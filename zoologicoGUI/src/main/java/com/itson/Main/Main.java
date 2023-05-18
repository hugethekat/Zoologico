/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itson.Main;

import com.itson.GUI.frmInicio;
import com.itson.logica.Logica;
import com.itson.logica.LogicaDatos;

/**
 *
 * @author Erick
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        frmInicio.obtenerInstancia().setVisible(true);

        if (Logica.obtenerInstancia().recuperaDatosItinerario().getGuias().isEmpty()) {
            LogicaDatos.obtenerInstancia().hardcodeaGuias();
        }

        if (Logica.obtenerInstancia().recuperaDatosItinerario().getZonas().isEmpty()) {
            LogicaDatos.obtenerInstancia().hardcodeaZonas();
        }

    }

}
