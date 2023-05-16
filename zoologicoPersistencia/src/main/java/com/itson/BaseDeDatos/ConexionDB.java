/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.BaseDeDatos;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Erick
 */
public class ConexionDB {

    private static MongoDatabase conexionDB;

    private ConexionDB() {

    }

    public MongoDatabase obtenerInstancia() {

        if (conexionDB == null) {
            MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
            conexionDB = mongoClient.getDatabase("Zoologico");
            return conexionDB;
        }
        return conexionDB;
    }

}
