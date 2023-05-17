/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.Interfaces;

import com.itson.dominio.Especie;
import java.util.List;

/**
 *
 * @author Erick
 */
public interface iEspecie {
 
    public Especie createEspecie();

    public void guardarEspecie(Especie especie);

    public void eliminarEspecie(Especie especie);

    public List<Especie> consultarEspecie();
}
