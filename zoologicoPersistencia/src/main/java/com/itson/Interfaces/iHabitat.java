/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.Interfaces;

import com.itson.dominio.Habitat;
import java.util.List;

/**
 *
 * @author Erick
 */
public interface iHabitat {

    public Habitat createHabitat();

    public void guardarHabitat(Habitat habitat);

    public void eliminarHabitat(Habitat habitat);

    public List<Habitat> consultarHabitat();
}
