/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.Interfaces.iRecorrido;
import com.itson.dominio.Queja;
import com.itson.dominio.Recorrido;
import com.itson.utils.FormatoColecciones;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Erick
 */
public class RecorridoDAO implements iRecorrido{

   // @Override
    public Recorrido createRecorrido(double longitud,LocalDate fechaHora, ObjectId idGuia, ObjectId idItinerario, int numVisitantes, List <Queja> quejas) {

        Recorrido recorrido = new Recorrido();
        recorrido.setLongitud(longitud);
        recorrido.setFechaHora(fechaHora);
        recorrido.setIdGuia(idGuia);
        recorrido.setIdItinerario(idItinerario);
        recorrido.setNumVisitantes(numVisitantes);
        recorrido.setQuejas(quejas);
        
        return recorrido;

    }

    @Override
    public void guardarRecorrido(Recorrido recorrido) {


       // ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getRecorridos(), Recorrido.class).insertOne(recorrido);
        MongoCollection<Recorrido> coleccion = ConexionDB.obtenerInstancia().getCollection("Recorridos", Recorrido.class);
        coleccion.insertOne(recorrido);
    }

    @Override
    public void eliminarRecorrido(Recorrido recorrido) {
//        Document recorridoDoc = new Document("Longitud", recorrido.getLongitud())
//                .append("Fecha y hora", recorrido.getFechaHora())
//                .append("Id Guia", recorrido.getIdGuia())
//                .append("Id Itinerario", recorrido.getIdItinerario())
//                .append("Numero de visitantes", recorrido.getNumVisitantes())
//                .append("Quejas", recorrido.getQuejas());
//        ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getRecorridos()).deleteOne(recorridoDoc);

    }

    @Override
    public List<Recorrido> consultarRecorridos() {

        List<Recorrido> listaRecorridos = new ArrayList();

        MongoCursor<Recorrido> recorridoDoc = ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getRecorridos(), Recorrido.class).find().iterator();

        while (recorridoDoc.hasNext()) {
            Recorrido recorrido = recorridoDoc.next();

            listaRecorridos.add(recorrido);
        }
        return listaRecorridos;

    }

}
