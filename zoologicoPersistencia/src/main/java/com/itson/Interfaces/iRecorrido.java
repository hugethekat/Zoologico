/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.Interfaces;

import com.itson.dominio.Recorrido;
import java.util.List;

/**
 *
 * @author Erick
 */
public interface iRecorrido {


    public void guardarRecorrido(Recorrido recorrido);

    public void eliminarRecorrido(Recorrido recorrido);

    public List<Recorrido> consultarRecorridos();

}
