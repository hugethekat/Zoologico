/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.Interfaces.iHabitat;
import com.itson.dominio.Clima;
import com.itson.dominio.Continente;
import com.itson.dominio.Habitat;
import com.itson.dominio.Vegetacion;
import com.itson.utils.FormatoColecciones;
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


    private static HabitatDAO instancia;


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
            MongoCollection<Document> collection = ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getHabitats());

            Document query = new Document(FormatoColecciones.getHabitats(), nombre);
            Document documentoEncontrado = collection.find(query).first();

            List<Clima> climas = new ArrayList<>();
            List<Vegetacion> vegetaciones = new ArrayList<>();
            List<Continente> continentes = new ArrayList<>();
            List<ObjectId> especies = new ArrayList<>();

            if (documentoEncontrado != null) {
                Habitat habitat = Habitat.getInstancia();
                habitat.setNombre(documentoEncontrado.getString("Nombre"));

                // Obtener lista de Climas
                List<Document> climasDocs = documentoEncontrado.getList(FormatoColecciones.getClimas(), Document.class);
                if (climasDocs != null) {
                    for (Document climaDoc : climasDocs) {
                        Clima clima = new Clima();
                        clima.setDescripcion(climaDoc.getString("Descripcion"));
                        clima.setNombre(climaDoc.getString("Nombre"));
                        climas.add(clima);
                    }
                }
                habitat.setClimas(climas);

                // Obtener lista de Vegetacion
                List<Document> vegetacionesDocs = documentoEncontrado.getList(FormatoColecciones.getVegetaciones(), Document.class);
                if (vegetacionesDocs != null) {

                    for (Document vegetacionDoc : vegetacionesDocs) {
                        Vegetacion vegetacion = new Vegetacion();
                        vegetacion.setNombre(vegetacionDoc.getString("Nombre"));
                        vegetaciones.add(vegetacion);
                    }

                }
                habitat.setVegetaciones(vegetaciones);

                List<Document> continentesDocs = documentoEncontrado.getList(FormatoColecciones.getContinentes(), Document.class);
                if (continentesDocs != null) {
                    for (Document continenteDoc : continentesDocs) {
                        Continente continente;
                        // Establecer los valores de las propiedades del continente
                        // Agregar el continente a la lista de continentes
                        switch (continenteDoc.getString("Nombre")) {

                            case ("AMERICA"):
                                continentes.add(Continente.AMERICA);
                                break;
                            case ("AFRICA"):
                                continentes.add(Continente.AFRICA);
                                break;
                            case ("ANTARTIDA"):
                                continentes.add(Continente.ANTARTIDA);
                                break;
                            case ("ASIA"):
                                continentes.add(Continente.ASIA);
                                break;
                            case ("EUROPA"):
                                continentes.add(Continente.EUROPA);
                                break;
                            case ("OCEANIA"):
                                continentes.add(Continente.OCEANIA);
                                break;

                        }

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
    public void guardarHabitat(Habitat habitat) {
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
