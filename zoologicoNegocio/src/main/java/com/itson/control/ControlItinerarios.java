/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.control;

import com.itson.dominio.DatosItinerario;
import com.itson.dominio.Habitat;
import com.itson.dominio.Itinerario;
import com.itson.logica.LogicaDatos;

/**
 *
 * @author Erick
 */
public class ControlItinerarios {

    private static ControlItinerarios instancia;

    public static ControlItinerarios obtenerInstancia() {

        if (instancia == null) {
            ControlItinerarios instancia = new ControlItinerarios();
            return instancia;
        }
        return instancia;
    }

    private ControlItinerarios() {
    }
    
    public void guardarItinerario(Itinerario itinerario){
        LogicaDatos.obtenerInstancia().guardarItinerario(itinerario);
    }

    public Itinerario buscaItinerario(String nombre){
        return LogicaDatos.obtenerInstancia().buscaItinerario(nombre);
    }
    
    public DatosItinerario recuperaDatosItinerario() {

        DatosItinerario datosItinerario = new DatosItinerario();
        datosItinerario.setGuias(LogicaDatos.obtenerInstancia().obtenerGuias());
        datosItinerario.setZonas(LogicaDatos.obtenerInstancia().obtenerZonas());

        return datosItinerario;

    }


}
