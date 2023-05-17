/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.Interfaces.iClima;
import com.itson.utils.FormatoColecciones;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.bson.Document;

/**
 *
 * @author xeron
 */
public class ClimaDAO implements iClima {

    MongoDatabase con = ConexionDB.obtenerInstancia();

    private static ClimaDAO instancia;

    FormatoColecciones fmt = FormatoColecciones.getInstancia();

    private ClimaDAO() {
    }

    public static ClimaDAO getInstancia() {
        if (instancia == null) {
            instancia = new ClimaDAO();
        }
        return instancia;
    }

    @Override
    public List<String> obtenerClimas() {
        try{
        MongoCollection<Document> collection = con.getCollection(fmt.getClimas());

        // Consulta todos los documentos de la colección "climas"
        FindIterable<Document> documents = collection.find();
        List<String> climas = new ArrayList<>();
        // Itera sobre los documentos y muestra sus contenidos
        for (Document document : documents) {
            String nombre = document.getString("nombre");
            System.out.println("Tipo de clima: " + nombre);
            climas.add(nombre);
        }
        return climas;
        }catch(NoSuchElementException ex){
            return new ArrayList<>();
        }
    }

}
