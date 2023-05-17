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
public class Habitat {

    private ObjectId id;
    private String nombre;
    private List<ObjectId> climas;
    private List<ObjectId> vegetaciones;
    private List<Continente> continentes;
    private List<ObjectId> especies;

    private static Habitat instancia;

    public static Habitat getInstancia() {
        if (instancia == null) {
            instancia = new Habitat();
        }
        return instancia;
    }

    private Habitat() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<ObjectId> getEspecies() {
        return especies;
    }

    public void setEspecies(List<ObjectId> especies) {
        this.especies = especies;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ObjectId> getClimas() {
        return climas;
    }

    public void setClimas(List<ObjectId> climas) {
        this.climas = climas;
    }

    public List<ObjectId> getVegetaciones() {
        return vegetaciones;
    }

    public void setVegetaciones(List<ObjectId> vegetaciones) {
        this.vegetaciones = vegetaciones;
    }

    public List<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(List<Continente> continentes) {
        this.continentes = continentes;
    }

}
