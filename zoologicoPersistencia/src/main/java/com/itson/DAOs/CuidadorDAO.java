/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.Interfaces.iCuidador;
import com.itson.dominio.Conocimiento;
import com.itson.dominio.Cuidador;
import com.itson.dominio.CuidadorEspecie;
import com.itson.dominio.Recorrido;
import com.itson.utils.FormatoColecciones;
import com.mongodb.client.MongoCursor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Erick
 */
public class CuidadorDAO implements iCuidador{

    @Override
    public Cuidador createCuidador(String nombre, String direccion, String telefono, LocalDate fechaInicio, List<CuidadorEspecie> especies, List<Conocimiento> conocimientos) {

        Cuidador cuidador = new Cuidador();
        cuidador.setNombre(nombre);
        cuidador.setDireccion(direccion);
        cuidador.setTelefono(telefono);
        cuidador.setFechaInicio(fechaInicio);
        cuidador.setEspecies(especies);
        cuidador.setConocimientos(conocimientos);

        return cuidador;
    }

    @Override
    public void guardarCuidador(Cuidador cuidador) {

        ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getCuidadores(), Cuidador.class).insertOne(cuidador);

    }

    @Override
    public void eliminarCuidador(Cuidador cuidador) {

//        Document cuidadorDoc = new Document("", recorrido.getLongitud())
//                .append("Fecha y hora", recorrido.getFechaHora())
//                .append("Id Guia", recorrido.getIdGuia())
//                .append("Id Itinerario", recorrido.getIdItinerario())
//                .append("Numero de visitantes", recorrido.getNumVisitantes())
//                .append("Quejas", recorrido.getQuejas());
//        ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getRecorridos()).deleteOne(recorridoDoc);

    }

    @Override
    public List<Cuidador> consultarCuidador() {

        List<Cuidador> listaCuidadores = new ArrayList();

        MongoCursor<Cuidador> cuidadorDoc = ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getCuidadores(), Cuidador.class).find().iterator();

        while (cuidadorDoc.hasNext()) {
            Cuidador cuidador = cuidadorDoc.next();

            listaCuidadores.add(cuidador);
        }
        return listaCuidadores;

    }

}
