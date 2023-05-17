/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dominio;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Erick
 */
public class DiaHora {
    
    
    private Dias dia;
    private List<String> hora;

    public DiaHora() {
    }

    public Dias getDia() {
        return dia;
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }

    public List<String> getHora() {
        return hora;
    }

    public void setHora(List<String> hora) {
        this.hora = hora;
    }


}
