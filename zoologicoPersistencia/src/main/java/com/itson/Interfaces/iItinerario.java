/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.Interfaces;

import com.itson.dominio.Itinerario;
import java.util.List;

/**
 *
 * @author Erick
 */
public interface iItinerario {

    public void guardarItinerario(Itinerario itinerario);

    public void eliminarItinerario(Itinerario itinerario);

    public Itinerario consultarItinerario(String nombre);
    
    public List<Itinerario> obtenerItinerarios();
}
