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
public class Guia extends Empleado{
    
    private List<ObjectId> idRecorridos;

    public Guia() {
    }
    
    public List<ObjectId> getIdRecorridos() {
        return idRecorridos;
    }

    public void setIdRecorridos(List<ObjectId> idRecorridos) {
        this.idRecorridos = idRecorridos;
    }   

    @Override
    public String toString() {
        return getNombre();
    }
    
    
}