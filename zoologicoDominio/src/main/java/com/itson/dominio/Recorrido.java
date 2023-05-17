/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dominio;

import java.time.LocalDate;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Erick
 */
public class Recorrido {

    private ObjectId id;
    private double duracion;
    private double longitud;
    private int numVisitantes;
    private LocalDate fechaHora;
    private List<Queja> quejas;
    private ObjectId idGuia;
    private ObjectId idItinerario;

    public Recorrido() {
    }

    public ObjectId getIdGuia() {
        return idGuia;
    }

    public void setIdGuia(ObjectId idGuia) {
        this.idGuia = idGuia;
    }

    public ObjectId getIdItinerario() {
        return idItinerario;
    }

    public void setIdItinerario(ObjectId idItinerario) {
        this.idItinerario = idItinerario;
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

    public int getNumVisitantes() {
        return numVisitantes;
    }

    public void setNumVisitantes(int numVisitantes) {
        this.numVisitantes = numVisitantes;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public List<Queja> getQuejas() {
        return quejas;
    }

    public void setQuejas(List<Queja> quejas) {
        this.quejas = quejas;
    }
    
    
}
    