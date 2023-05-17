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
public class Conocimiento {

    private ObjectId idEspecie;
    private ObjectId idCuidador;
    private List <NivelConocimiento> nivelConocimiento;

    public Conocimiento() {
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

    public List<NivelConocimiento> getNivelConocimiento() {
        return nivelConocimiento;
    }

    public void setNivelConocimiento(List<NivelConocimiento> nivelConocimiento) {
        this.nivelConocimiento = nivelConocimiento;
    }

}
