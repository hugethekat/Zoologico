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
public class CuidadorEspecie {

    private ObjectId id;
    private ObjectId idEspecie;
    private ObjectId idCuidador;
    private LocalDate fechaCargo;

    public CuidadorEspecie() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(ObjectId idEspecie) {
        this.idEspecie = idEspecie;
    }

    public ObjectId getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(ObjectId idCuidador) {
        this.idCuidador = idCuidador;
    }

    public LocalDate getFechaCargo() {
        return fechaCargo;
    }

    public void setFechaCargo(LocalDate fechaCargo) {
        this.fechaCargo = fechaCargo;
    }
    
    
    
}
