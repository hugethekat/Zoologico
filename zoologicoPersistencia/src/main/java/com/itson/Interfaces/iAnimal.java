/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.Interfaces;

import com.itson.dominio.Animal;
import com.itson.dominio.Sexo;
import java.util.List;

/**
 *
 * @author Erick
 */
public interface iAnimal {

    public void guardarAnimal(Animal animal);

    public void eliminarAnimal(Animal animal);

    public List<Animal> consultarAnimales();
}
