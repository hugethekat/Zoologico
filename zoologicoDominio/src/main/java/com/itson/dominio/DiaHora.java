/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dominio;

import java.util.List;

/**
 *
 * @author Erick
 */
public class DiaHora {

    private Dias dia;
    private String hora;

    public DiaHora() {
    }

    public Dias getDia() {
        return dia;
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public DiaHora(Dias dia, String hora) {
        this.dia = dia;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return dia + " " + hora;
    }

}
