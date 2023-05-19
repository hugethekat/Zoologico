/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.control;

import com.itson.dominio.DatosItinerario;
import com.itson.logica.LogicaDatos;

/**
 *
 * @author Erick
 */
public class ControlQuejas {

    public DatosItinerario recuperDatosItinerario() {
        return LogicaDatos.obtenerInstancia().recuperaDatosItinerario();
    }
}
