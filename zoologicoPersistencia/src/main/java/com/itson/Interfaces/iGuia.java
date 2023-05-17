/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.Interfaces;

import com.itson.dominio.DiaHora;
import com.itson.dominio.Guia;
import java.util.List;

/**
 *
 * @author Erick
 */
public interface iGuia {

    public Guia createGuia();

    public void guardarGuia(Guia guia);

    public void eliminarGuia(Guia guia);

    public List<Guia> consultarGuia();
}
