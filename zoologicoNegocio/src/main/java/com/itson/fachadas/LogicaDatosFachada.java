/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.fachadas;

import com.itson.dominio.Habitat;
import com.itson.dominio.Itinerario;
import com.itson.logica.LogicaDatos;
import java.util.List;

/**
 *
 * @author Erick
 */
public class LogicaDatosFachada {

    private static LogicaDatosFachada instancia;

    public static LogicaDatosFachada obtenerInstancia() {

        if (instancia == null) {
            LogicaDatosFachada instancia = new LogicaDatosFachada();
            return instancia;
        }
        return instancia;
    }

    public List<Habitat> recuperaHabitats() {
        return LogicaDatos.obtenerInstancia().recuperaHabitats();
    }

    public Itinerario buscaItinerario(String nombre) {
        return LogicaDatos.obtenerInstancia().buscaItinerario(nombre);
    }

}
