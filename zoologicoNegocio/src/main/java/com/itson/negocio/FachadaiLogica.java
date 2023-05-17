/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.negocio;

import com.itson.Interfaces.iLogica;
import java.util.List;

/**
 *
 * @author xeron
 */
public class FachadaiLogica {

    private static FachadaiLogica instancia;
    iLogica iLog = CtrlHabitats.getInstancia();

    private FachadaiLogica() {

    }

    public static FachadaiLogica getInstancia() {
        if (instancia == null) {
            instancia = new FachadaiLogica();
        }
        return instancia;
    }

    public java.util.List<java.lang.String>[] recuperaDatosH() {
        List<String>[] datos = iLog.recuperaDatosH();

        return datos;
    }

    public Object verificarExistencia(String nombre) {
        String nom = nombre;
        Object bh = iLog.verificarExistencia(nom);
        return bh;
    }

}
