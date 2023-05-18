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
public class Zona {

    private ObjectId id;
    private String nombre;
    private double extension;
    private List<ObjectId> idItinerarios;
    private List<Especie> especies;

    public Zona() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<ObjectId> getIdItinerarios() {
        return idItinerarios;
    }

    public void setIdItinerarios(List<ObjectId> idItinerarios) {
        this.idItinerarios = idItinerarios;
    }

    public List<Especie> getEspecies() {
        return especies;
    }

    public void setEspecies(List<Especie> especies) {
        this.especies = especies;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return nombre;
    }
 
    
    
}
