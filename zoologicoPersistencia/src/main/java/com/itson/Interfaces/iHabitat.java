/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.Interfaces;

import com.itson.dominio.Clima;
import com.itson.dominio.Habitat;
import com.itson.dominio.Vegetacion;
import java.util.List;

/**
 *
 * @author Erick
 */
public interface iHabitat {

    public Object obtenerHabitat(String nombre);

    public void guardarHabitat(Habitat habitat);

    public void eliminarHabitat(Habitat habitat);

    public List<Habitat> consultarHabitat();

    public List<Clima> obtenerClimas();

    public List<Vegetacion> obtenerVegetaciones();

}
