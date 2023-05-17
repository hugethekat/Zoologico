/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.Interfaces;

import com.itson.dominio.Zona;
import java.util.List;

/**
 *
 * @author Erick
 */
public interface iZona {

    public Zona createZona();

    public void guardarZona(Zona queja);

    public void eliminarZona(Zona queja);

    public List<Zona> consultarZona();
}
