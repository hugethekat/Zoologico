/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.dominio.Recorrido;
import com.mongodb.client.MongoCollection;

/**
 *
 * @author Erick
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        RecorridoDAO recorridoDAO = new RecorridoDAO();
        //        Queja queja = new Queja();
        //        queja.setAsunto("Ola");
        //        queja.setDescripcion("Mundo");
        //        
        //        List <Queja> quejas = new ArrayList ();
        //        quejas.add(queja);
        //        
        //        Recorrido recorrido = new Recorrido();
        //        recorridoDAO.guardarRecorrido(recorrido);

        MongoCollection<Recorrido> coleccion = ConexionDB.obtenerInstancia().getCollection("Recorridos",Recorrido.class);
        coleccion.insertOne(new Recorrido());

        
        
    }

}
