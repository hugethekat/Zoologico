/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.Interfaces.iHabitat;
import com.itson.Interfaces.iQueja;
import com.itson.dominio.Clima;
import com.itson.dominio.Continente;
import com.itson.dominio.Habitat;
import com.itson.dominio.Queja;
import com.itson.dominio.Vegetacion;
import com.itson.utils.FormatoColecciones;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author xeron
 */
public class QuejaDAO implements iQueja {


    private static QuejaDAO instancia;


    public static QuejaDAO getInstancia() {
        if (instancia == null) {
            instancia = new QuejaDAO();
        }
        return instancia;
    }

    private QuejaDAO() {

    }

    @Override
    public Object obtenerQueja(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void guardarQueja(Queja queja) {
        Document quejaDoc = new Document("Asunto", queja.getAsunto())
                .append("Descripcion", queja.getDescripcion())
                .append("Nombre", queja.getNombre())
                .append("Correo", queja.getCorreo())
                .append("Telefono", queja.getTelefono())
                .append("Recorrido", queja.getRecorrido());

        ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getQuejas()).insertOne(quejaDoc);
    }

    @Override
    public void eliminarQueja(Queja queja) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Queja> consultarQuejas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
