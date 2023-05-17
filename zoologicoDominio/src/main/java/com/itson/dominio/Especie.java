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
public class Especie {

    private ObjectId id;
    private String nombreEspecie;
    private String nombreCientifico;
    private String descripcion;
    private List<Animal> animales;
    private List<CuidadorEspecie> cuidadores;
    private List<Conocimiento> conocedores;
    private Zona zona;
    private List <ObjectId> habitats;
    

    public Especie() {
    }

    public ObjectId getId() {
        return id;
    }

    public List<ObjectId> getHabitats() {
        return habitats;
    }

    public void setHabitats(List<ObjectId> habitats) {
        this.habitats = habitats;
    }

    
    
    public List<CuidadorEspecie> getCuidadores() {
        return cuidadores;
    }

    public void setCuidadores(List<CuidadorEspecie> cuidadores) {
        this.cuidadores = cuidadores;
    }

    public List<Conocimiento> getConocedores() {
        return conocedores;
    }

    public void setConocedores(List<Conocimiento> conocedores) {
        this.conocedores = conocedores;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }
}
