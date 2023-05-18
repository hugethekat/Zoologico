/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.logica;

import com.itson.control.ControlHabitat;
import com.itson.dominio.DatosHabitat;
import com.itson.dominio.Habitat;

/**
 *
 * @author Erick
 */
public class Logica {

    public DatosHabitat recuperaDatosHabitat() {
        return ControlHabitat.obtenerInstancia().recuperaDatosHabitat();
    }

    public Habitat verificarExistencia(String nombre) {
        return ControlHabitat.obtenerInstancia().buscaHabitat(nombre);
    }
}
