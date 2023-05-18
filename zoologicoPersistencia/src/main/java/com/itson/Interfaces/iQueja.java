/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.Interfaces;

import com.itson.dominio.Clima;
import com.itson.dominio.Habitat;
import com.itson.dominio.Queja;
import com.itson.dominio.Vegetacion;
import java.util.List;

/**
 *
 * @author Erick
 */
public interface iQueja {

    public Object obtenerQueja(String nombre);

    public void guardarQueja(Queja queja);

    public void eliminarQueja(Queja queja);

    public List<Queja> consultarQuejas();


}
