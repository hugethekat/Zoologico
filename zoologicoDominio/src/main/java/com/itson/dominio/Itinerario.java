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
public class Itinerario {

    private ObjectId id;
    private String nombre;
    private double duracion;
    private double longitud;
    private int maxVisitantes;
    private List<DiaHora> diasHora;
    private List<ObjectId> idRecorridos;
    private List<ObjectId> idZonas;

    public Itinerario() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<DiaHora> getDiasHora() {
        return diasHora;
    }

    public void setDiasHora(List<DiaHora> diasHora) {
        this.diasHora = diasHora;
    }

    public List<ObjectId> getIdRecorridos() {
        return idRecorridos;
    }

    public void setIdRecorridos(List<ObjectId> idRecorridos) {
        this.idRecorridos = idRecorridos;
    }

    public List<ObjectId> getIdZonas() {
        return idZonas;
    }

    public void setIdZonas(List<ObjectId> idZonas) {
        this.idZonas = idZonas;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return getNombre();
    }

}
