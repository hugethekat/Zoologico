/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dominio;

import java.util.List;

/**
 *
 * @author Erick
 */

//Clase para envolver otros datos xd

public class DatosHabitat {
    
    private List <Clima> climas;
    private List <Vegetacion> vegetacion;

    public DatosHabitat() {
    }

    public List<Clima> getClimas() {
        return climas;
    }

    public void setClimas(List<Clima> climas) {
        this.climas = climas;
    }

    public List<Vegetacion> getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(List<Vegetacion> vegetacion) {
        this.vegetacion = vegetacion;
    }
    
}
