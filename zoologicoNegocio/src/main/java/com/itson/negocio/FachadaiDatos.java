/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.negocio;

import com.itson.DAOs.ClimaDAO;
import com.itson.DAOs.HabitatDAO;
import com.itson.DAOs.VegetacionDAO;
import com.itson.Interfaces.iClima;
import com.itson.Interfaces.iHabitat;
import com.itson.Interfaces.iVegetacion;
import java.util.List;

/**
 *
 * @author xeron
 */
public class FachadaiDatos {

    private static FachadaiDatos instancia;

    private FachadaiDatos() {

    }

    public static FachadaiDatos getInstancia() {
        if (instancia == null) {
            instancia = new FachadaiDatos();
        }
        return instancia;
    }

    public java.util.List<java.lang.String>[] recuperaDatosH() {
        
        iClima iDa = ClimaDAO.getInstancia();
        List<String> climas = iDa.obtenerClimas();
        
        iVegetacion iVe = VegetacionDAO.getInstancia();
        List<String> vegetaciones = iVe.obtenerVegetacion();
        
        List<String>[] arregloListas = new List[2];
        arregloListas[0] = climas;
        arregloListas[1] = vegetaciones;

        return arregloListas;
    }

    public Object buscaHabitat(String nombre){
        iHabitat iHa = HabitatDAO.getInstancia();
        Object bh = iHa.obtenerHabitat(nombre);
        return bh;
    }
    
}
