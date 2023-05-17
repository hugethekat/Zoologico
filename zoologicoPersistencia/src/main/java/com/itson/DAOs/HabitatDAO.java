/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.Interfaces.iHabitat;
import com.itson.dominio.Continente;
import com.itson.dominio.Habitat;
import com.itson.utils.FormatoColecciones;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author xeron
 */
public class HabitatDAO implements iHabitat {

    MongoDatabase con = ConexionDB.obtenerInstancia();

    private static HabitatDAO instancia;

    FormatoColecciones fmt = FormatoColecciones.getInstancia();

    public static HabitatDAO getInstancia() {
        if (instancia == null) {
            instancia = new HabitatDAO();
        }
        return instancia;
    }

    private HabitatDAO() {

    }

    @Override
    public Object obtenerHabitat(String nombre) {
        try {
            MongoCollection<Document> collection = con.getCollection(fmt.getHabitats());

            Document query = new Document(fmt.getHabitats(), nombre);
            Document documentoEncontrado = collection.find(query).first();

            List<ObjectId> climas = new ArrayList<>();
            List<ObjectId> vegetacion = new ArrayList<>();
            List<Continente> continentes = new ArrayList<>();
            List<ObjectId> especies = new ArrayList<>();

            if (documentoEncontrado != null) {
                Habitat habitat = Habitat.getInstancia();
                habitat.setNombre(documentoEncontrado.getString("Nombre"));

                // Obtener lista de IDs de Climas
                List<ObjectId> climasIds = documentoEncontrado.getList("Climas", ObjectId.class);
                if (climasIds != null) {
                    climas.addAll(climasIds);
                }
                habitat.setClimas(climas);

                // Obtener lista de IDs de Vegetacion
                List<ObjectId> vegetacionIds = documentoEncontrado.getList("Vegetacion", ObjectId.class);
                if (vegetacionIds != null) {
                    vegetacion.addAll(vegetacionIds);
                }
                habitat.setVegetaciones(vegetacion);

                //no se q rollo con los continentes
                List<Document> continentesDocs = documentoEncontrado.getList("Continentes", Document.class);
                if (continentesDocs != null) {
                    for (Document continenteDoc : continentesDocs) {
                        Continente continente = new Continente();
                        // Establecer los valores de las propiedades del continente
                        continente.setNombre(continenteDoc.getString("Nombre"));
                        // Agregar el continente a la lista de continentes
                        continentes.add(continente);
                    }
                }
                habitat.setContinentes(continentes);

                // Obtener lista de IDs de Especies
                List<ObjectId> especiesIds = documentoEncontrado.getList("Especies", ObjectId.class);
                if (especiesIds != null) {
                    especies.addAll(especiesIds);
                }
                habitat.setEspecies(especies);

                return habitat;
            }
        } catch (NoSuchElementException ex) {
           
        }
        return null;
    }
      


@Override
public void guardarHabitat(Habitat habitat
    ) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
public void eliminarHabitat(Habitat habitat
    ) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
public List<Habitat> consultarHabitat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
