/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.Interfaces.iEspecie;
import com.itson.dominio.Clima;
import com.itson.dominio.Continente;
import com.itson.dominio.Especie;
import com.itson.dominio.Habitat;
import com.itson.dominio.Vegetacion;
import com.itson.utils.FormatoColecciones;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Erick
 */
public class EspecieDAO implements iEspecie {

    @Override
    public void guardarEspecie(Especie especie) {

        
    }

    @Override
    public void eliminarEspecie(Especie especie) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Especie> consultarEspecie() {

         List<Especie> listaEspecie = new ArrayList();

        MongoCursor<Document> especieDoc = ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getEspecies()).find().iterator();

        while (especieDoc.hasNext()) {
            Document document = especieDoc.next();
            String nombreEspecie = document.getString("Nombre Especie");
            String nombreCientifico = document.getString("Nombre Cientifico");
            String descripcion = document.getString("Descripcion");
            

           
        }
        return listaEspecie;

    }

}
