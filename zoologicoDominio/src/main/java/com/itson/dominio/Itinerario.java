/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dominio;

import org.bson.types.ObjectId;

/**
 *
 * @author Erick
 */
public class Itinerario {

    private ObjectId id;
    private double duracion;
    private double longitud;
    private int maxVisitantes;

    public Itinerario() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }

    
    
}
