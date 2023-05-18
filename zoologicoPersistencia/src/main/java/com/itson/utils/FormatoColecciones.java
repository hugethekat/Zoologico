/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.utils;

/**
 *
 * @author Erick
 */
public class FormatoColecciones {

    private static FormatoColecciones instancia;

    public static FormatoColecciones getInstancia() {
        if (instancia == null) {
            instancia = new FormatoColecciones();
        }
        return instancia;
    }

    public static String getAnimales() {
        return "Animales";
    }

    public static String getClimas() {
        return "Climas";
    }

    public static String getConocimientos() {
        return "Conocimiento";
    }

    public static String getContinentes() {
        return "Continentes";
    }

    public static String getCuidadores() {
        return "Cuidador";
    }

    public static String getCuidadoresEspecies() {
        return "CuidadorEspecie";
    }

    public static String getDiasHoras() {
        return "DiaHora";
    }

    public static String getEspecies() {
        return "Especie";
    }

    public static String getGuias() {
        return "Guia";
    }

    public static String getHabitats() {
        return "Habitats";
    }

    public static String getItinerarios() {
        return "Itinerario";
    }

    public static String getQuejas() {
        return "Queja";
    }

    public static String getRecorridos() {
        return "Recorrido";
    }

    public static String getVegetaciones() {
        return "Vegetacion";
    }

    public static String getZonas() {
        return "Zona";
    }
}
