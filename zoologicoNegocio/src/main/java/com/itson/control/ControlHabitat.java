/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.control;

import com.itson.DAOs.HabitatDAO;
import com.itson.dominio.DatosHabitat;
import com.itson.dominio.Habitat;
import com.itson.logica.LogicaDatos;

/**
 *
 * @author Erick
 */
public class ControlHabitat {

    
       private static ControlHabitat instancia;

    public static ControlHabitat obtenerInstancia() {

        if (instancia == null) {
            ControlHabitat instancia = new ControlHabitat();
            return instancia;
        }
        return instancia;
    }
    
    private ControlHabitat() {
    }
    
    public DatosHabitat recuperaDatosHabitat(){

        DatosHabitat datosHabitat = new DatosHabitat();
        datosHabitat.setClimas(LogicaDatos.obtenerInstancia().obtenerClima());
        datosHabitat.setVegetacion(LogicaDatos.obtenerInstancia().obtenerVegetacion());

        return datosHabitat;
    }
    
    public Habitat buscaHabitat(String nombre){
        return LogicaDatos.obtenerInstancia().obtenerHabitat(nombre);
    }
//    
//    public List <Habitat> recuperaHabitats(){
//        
//    }
    
}
