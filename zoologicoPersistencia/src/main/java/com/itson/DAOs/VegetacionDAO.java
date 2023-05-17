/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.Interfaces.iVegetacion;
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
public class VegetacionDAO implements iVegetacion {

    MongoDatabase con = ConexionDB.obtenerInstancia();

    FormatoColecciones fmt = FormatoColecciones.getInstancia();

    private static VegetacionDAO instancia;

    public VegetacionDAO() {
    }

    public static VegetacionDAO getInstancia() {
        if (instancia == null) {
            instancia = new VegetacionDAO();
        }
        return instancia;
    }

    @Override
    public List<String> obtenerVegetacion() {

        try {
            MongoCollection<Document> collection = con.getCollection(fmt.getVegetaciones());

            // Consulta todos los documentos de la colección "climas"
            FindIterable<Document> documents = collection.find();
            List<String> vege = new ArrayList<>();
            // Itera sobre los documentos y muestra sus contenidos
            for (Document document : documents) {
                String nombre = document.getString("nombre");
                System.out.println("Tipo de vegetacion: " + nombre);
                vege.add(nombre);
            }
            return vege;
        } catch (NoSuchElementException ex) {
            return new ArrayList<>();
        }

    }
}
