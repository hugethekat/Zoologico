/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dominio;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Erick
 */
public class Cuidador extends Empleado {

    private List<CuidadorEspecie> especies;
    private List<Conocimiento> conocimientos;

    public Cuidador() {
    }

    
    
    public List<CuidadorEspecie> getEspecies() {
        return especies;
    }

    public void setEspecies(List<CuidadorEspecie> Especies) {
        this.especies = Especies;
    }

    public List<Conocimiento> getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(List<Conocimiento> conocimientos) {
        this.conocimientos = conocimientos;
    }


}
