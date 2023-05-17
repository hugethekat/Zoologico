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
public class CtrlHabitats implements iLogica {

    private static CtrlHabitats instancia;

    FachadaiDatos fachadaD = FachadaiDatos.getInstancia();

    private CtrlHabitats() {

    }

    public static CtrlHabitats getInstancia() {
        if (instancia == null) {
            instancia = new CtrlHabitats();
        }
        return instancia;
    }

    @Override
    public java.util.List<java.lang.String>[] recuperaDatosH() {
        List<String>[] datos = fachadaD.recuperaDatosH();
        return datos;
    }

    @Override
    public Object verificarExistencia(String nombre) {
        String nom = nombre;
        Object bh = fachadaD.buscaHabitat(nom);
        return bh;
    }

    @Override
    public boolean activaCampos(Object object) {
        return object != null;
    }

}