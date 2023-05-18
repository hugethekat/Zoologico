/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.Interfaces.iItinerario;
import com.itson.dominio.Animal;
import com.itson.dominio.DiaHora;
import com.itson.dominio.Dias;
import com.itson.dominio.Zona;
import com.itson.dominio.Itinerario;
import com.itson.dominio.Recorrido;
import com.itson.dominio.Sexo;
import com.itson.utils.FormatoColecciones;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Erick
 */
public class ItinerarioDAO implements iItinerario {

    private static ItinerarioDAO instancia;

    public static ItinerarioDAO getInstancia() {
        if (instancia == null) {
            instancia = new ItinerarioDAO();
        }
        return instancia;
    }

    @Override
    public void guardarItinerario(Itinerario itinerario) {
//        List<Document> DiasHorasDoc = new ArrayList<>();
//
//        for (DiaHora diahora : itinerario.getDiasHora()) {
//            Document diaHoraDoc = new Document("Hora", diahora.getHora())
//                    .append("Dia", diahora.getDia().toString());
//            DiasHorasDoc.add(diaHoraDoc);
//        }
//
//        List<Document> ZonasDoc = new ArrayList<>();
//        for (Zona zona : itinerario.getIdZonas()) {
//            Document zonaDoc = new Document("Nombre", zona.getNombre())
//                    .append("Exstencion", zona.getExtension());
//            ZonasDoc.add(zonaDoc);
//        }
//
//        Document itinerarioDoc = new Document("Duracion", itinerario.getDuracion())
//                .append("Longitud", itinerario.getLongitud())
//                .append("MaxVisitantes", itinerario.getMaxVisitantes())
//                .append("DiaHoras", DiasHorasDoc)
//                .append("Zonas", ZonasDoc);
//
//        ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getItinerarios()).insertOne(itinerarioDoc);

        MongoCollection<Document> itinerariosCollection = ConexionDB.obtenerInstancia().getCollection("itinerarios");

        Document itinerarioDocument = new Document();
        itinerarioDocument.append("nombre", itinerario.getNombre());
        itinerarioDocument.append("duracion", itinerario.getDuracion());
        itinerarioDocument.append("longitud", itinerario.getLongitud());
        itinerarioDocument.append("maxVisitantes", itinerario.getMaxVisitantes());
        itinerarioDocument.append("diasHora", itinerario.getDiasHora());
        itinerarioDocument.append("Zonas", itinerario.getIdZonas());

        // Insertar el itinerario sin las IDs de los recorridos
        itinerariosCollection.insertOne(itinerarioDocument);

        ObjectId itinerarioId = itinerarioDocument.getObjectId("_id");

        List<ObjectId> idRecorridos = new ArrayList<>();

        MongoCollection<Document> recorridosCollection = ConexionDB.obtenerInstancia().getCollection("recorridos");

        for (DiaHora diaHora : itinerario.getDiasHora()) {
            Recorrido recorrido = new Recorrido();
            recorrido.setDuracion(itinerario.getDuracion());
            recorrido.setLongitud(itinerario.getLongitud());
            recorrido.setNumVisitantes(itinerario.getMaxVisitantes());
            //recorrido.setFechaHora(diaHora.getFechaHora());
            recorrido.setQuejas(new ArrayList<>()); // Agrega lógica para las quejas si es necesario
            recorrido.setIdGuia(new ObjectId()); // Asigna el ObjectId del guía correspondiente
            recorrido.setIdItinerario(itinerarioId);

            Document recorridoDocument = new Document();
            recorridoDocument.put("duracion", recorrido.getDuracion());
            recorridoDocument.put("longitud", recorrido.getLongitud());
            recorridoDocument.put("numVisitantes", recorrido.getNumVisitantes());
            recorridoDocument.put("fechaHora", recorrido.getFechaHora());
            //recorridoDocument.put("idGuia", recorrido.getIdGuia());
            recorridoDocument.put("idItinerario", recorrido.getIdItinerario());

            recorridosCollection.insertOne(recorridoDocument);

            ObjectId recorridoId = recorridoDocument.getObjectId("_id");
            idRecorridos.add(recorridoId);
        }

        // Actualizar el itinerario con las IDs de los recorridos
        Bson filter = Filters.eq("_id", itinerarioId);
        Bson update = Updates.set("idRecorridos", idRecorridos);
        itinerariosCollection.updateOne(filter, update);
    }

    @Override
    public void eliminarItinerario(Itinerario itinerario) {
        List<Document> DiasHorasDoc = new ArrayList<>();
        for (DiaHora diahora : itinerario.getDiasHora()) {
            Document diaHoraDoc = new Document("Hora", diahora.getHora())
                    .append("Dia", diahora.getDia());
            DiasHorasDoc.add(diaHoraDoc);
        }

        List<Document> ZonasDoc = new ArrayList<>();
        for (Zona zona : itinerario.getIdZonas()) {
            Document zonaDoc = new Document("Nombre", zona.getNombre())
                    .append("Exstencion", zona.getExtension());
            ZonasDoc.add(zonaDoc);
        }

        Document itinerarioDoc = new Document("Duracion", itinerario.getDuracion())
                .append("Longitud", itinerario.getLongitud())
                .append("MaxVisitantes", itinerario.getMaxVisitantes())
                .append("DiaHoras", DiasHorasDoc)
                .append("Zonas", ZonasDoc);

        ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getItinerarios()).deleteOne(itinerarioDoc);
    }

    @Override
    public Itinerario consultarItinerario(String nombre) {
        MongoCollection<Document> itinerariosCollection = ConexionDB.obtenerInstancia().getCollection("itinerarios");
        Document query = new Document("nombre", nombre);
        Document result = itinerariosCollection.find(query).first();

        if (result != null) {
            Itinerario itinerario = new Itinerario();
            itinerario.setId(result.getObjectId("_id"));
            itinerario.setNombre(result.getString("nombre"));
            itinerario.setDuracion(result.getDouble("duracion"));
            itinerario.setLongitud(result.getDouble("longitud"));
            itinerario.setMaxVisitantes(result.getInteger("maxVisitantes"));

            // Convertir la lista de objetos Document a List<DiaHora>
            List<Document> diasHoraDocuments = (List<Document>) result.get("diasHora");
            List<DiaHora> diasHora = new ArrayList<>();
            for (Document diaHoraDocument : diasHoraDocuments) {
                String diaString = diaHoraDocument.getString("dia");
                Dias dia = Dias.valueOf(diaString); // Convertir el String a enum Dia
                String hora = diaHoraDocument.getString("hora");
                DiaHora diaHora = new DiaHora(dia, hora);
                diasHora.add(diaHora);
            }
            itinerario.setDiasHora(diasHora);

            // Obtener la lista de ObjectId directamente
            itinerario
                    .setIdRecorridos(result.getList("idRecorridos", ObjectId.class
                    ));

            // Convertir la lista de objetos Document a List<Zona>
            List<Document> zonasDocuments = (List<Document>) result.get("idZonas");
            List<Zona> zonas = new ArrayList<>();
            for (Document zonaDocument : zonasDocuments) {
                Zona zona = new Zona();
                zona.setId(zonaDocument.getObjectId("_id"));
                zona.setNombre(zonaDocument.getString("nombre"));
                // Asignar valores a los demás atributos de Zona...
                zonas.add(zona);
            }
            itinerario.setIdZonas(zonas);

            return itinerario;
        } else {
            Document itinerarioDocument = new Document("nombre", nombre);
            itinerariosCollection.insertOne(itinerarioDocument);

            ObjectId id = itinerarioDocument.getObjectId("_id");

            Itinerario itinerario = new Itinerario();
            itinerario.setId(id);
            itinerario.setNombre(nombre);

            return itinerario;
        }
    }
}
