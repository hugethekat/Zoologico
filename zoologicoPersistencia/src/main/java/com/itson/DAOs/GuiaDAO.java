/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.Interfaces.iGuia;
import com.itson.dominio.Guia;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author xeron
 */
public class GuiaDAO implements iGuia {

    private static GuiaDAO instancia;

    public static GuiaDAO getInstancia() {
        if (instancia == null) {
            instancia = new GuiaDAO();
        }
        return instancia;
    }

    @Override
    public List<Guia> consultarGuia() {
        List<Guia> guias = new ArrayList<>();

        // Obtener la colección de guías
        MongoCollection<Document> guiasCollection = ConexionDB.obtenerInstancia().getCollection("guias");

        // Realizar la consulta para obtener todos los documentos
        FindIterable<Document> guiasDocuments = guiasCollection.find();

        // Recorrer los documentos y obtener los nombres de las guías
        try (MongoCursor<Document> cursor = guiasDocuments.iterator()) {
            while (cursor.hasNext()) {
                Document guiaDocument = cursor.next();
                String nombre = guiaDocument.getString("nombre");

                // Crear un objeto Guia y agregarlo a la lista
                Guia guia = new Guia();
                guia.setNombre(nombre);
                guias.add(guia);
            }
        }

        return guias;
    }

}
