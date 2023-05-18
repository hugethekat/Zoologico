/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.fachadas;

import com.itson.DAOs.GuiaDAO;
import com.itson.dominio.Guia;
import com.itson.dominio.Habitat;
import com.itson.logica.LogicaDatos;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 *
 * @author Erick
 */
public class LogicaDatosFachada {

    public void hardcodeaGuias() {

        LogicaDatos.obtenerInstancia().hardcodeaGuias();
    }

    public List<Habitat> recuperaHabitats() {
        return LogicaDatos.obtenerInstancia().recuperaHabitats();
    }

}
