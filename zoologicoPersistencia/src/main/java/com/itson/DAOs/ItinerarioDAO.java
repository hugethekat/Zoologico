/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.Interfaces.iItinerario;
import com.itson.dominio.Animal;
import com.itson.dominio.DiaHora;
import com.itson.dominio.Zona;
import com.itson.dominio.Itinerario;
import com.itson.dominio.Recorrido;
import com.itson.dominio.Sexo;
import com.itson.utils.FormatoColecciones;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
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
        List<Document> DiasHorasDoc = new ArrayList<>();
        
        
        
        
        for (DiaHora diahora : itinerario.getDiasHora()) {             
            Document diaHoraDoc = new Document("Hora", diahora.getHora())
                    .append("Dia", diahora.getDia().toString());
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

        ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getItinerarios()).insertOne(itinerarioDoc);
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
    public List<Itinerario> consultarItinerario() {
       return null;
    }
}