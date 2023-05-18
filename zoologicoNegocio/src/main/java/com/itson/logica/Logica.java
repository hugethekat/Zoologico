/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.logica;

import com.itson.control.ControlHabitat;
import com.itson.control.ControlItinerarios;
import com.itson.dominio.DatosHabitat;
import com.itson.dominio.DatosItinerario;
import com.itson.dominio.Habitat;
import com.itson.dominio.Itinerario;

/**
 *
 * @author Erick
 */
public class Logica {

    private static Logica instancia;

    public static Logica obtenerInstancia() {

        if (instancia == null) {
            Logica inicio = new Logica();
            return inicio;
        }
        return instancia;
    }

    private Logica() {
    }

    public void guardarItinerario(Itinerario itinerario) {
        ControlItinerarios.obtenerInstancia().guardarItinerario(itinerario);
    }

    public Itinerario buscaItinerario(String nombre) {
        return ControlItinerarios.obtenerInstancia().buscaItinerario(nombre);
    }

    public DatosItinerario recuperaDatosItinerario() {
        return ControlItinerarios.obtenerInstancia().recuperaDatosItinerario();
    }
    
    public void guardarHabitat(Habitat habitat){
        LogicaDatos.obtenerInstancia().guardarHabitat(habitat);
    }
    
    public DatosHabitat recuperaDatosHabitat() {
        return ControlHabitat.obtenerInstancia().recuperaDatosHabitat();
    }

    public Habitat verificarExistencia(String nombre) {
        return ControlHabitat.obtenerInstancia().buscaHabitat(nombre);
    }
    
    
    
}
