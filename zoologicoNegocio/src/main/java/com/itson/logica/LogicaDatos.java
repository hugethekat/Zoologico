/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.logica;

import com.itson.DAOs.HabitatDAO;
import com.itson.DAOs.ItinerarioDAO;
import com.itson.dominio.Clima;
import com.itson.dominio.Itinerario;
import com.itson.dominio.DatosHabitat;
import com.itson.dominio.Habitat;
import com.itson.dominio.Vegetacion;
import java.util.List;

/**
 *
 * @author Erick
 */
public class LogicaDatos {

    private static LogicaDatos instancia;

    public static LogicaDatos obtenerInstancia() {

        if (instancia == null) {
            LogicaDatos instancia = new LogicaDatos();
            return instancia;
        }
        return instancia;
    }

    public Itinerario obtenItinerario(String nombre) {

        return ItinerarioDAO.getInstancia().consultarItinerario(nombre);

    }
    
//    public void guardarQueja(){
//        QuejaDAO.
//    }

    public void guardarItinerario(Itinerario itinerario) {

        ItinerarioDAO.getInstancia().guardarItinerario(itinerario);

    }

    public Itinerario buscaItinerario(String nombre) {
        return ItinerarioDAO.getInstancia().consultarItinerario(nombre);
    }
    
//    public List<Cuidador>recuperaCuidadores(){
//        return CuidadorDAO.
//    }
    
    public List <Habitat> recuperaHabitats(){
        
        return HabitatDAO.getInstancia().consultarHabitat();
        
    }
    
    public Habitat obtenerHabitat(String nombre) {
        return HabitatDAO.getInstancia().obtenerHabitat(nombre);
    }

    public void guardarHabitat(Habitat habitat) {
        HabitatDAO.getInstancia().guardarHabitat(habitat);
    }

//    public DatosItinerario recuperaDatosItinerario() {
//        DatosItinerario datosItinerario = new DatosItinerario();
//        datosItinerario.setGuia(ItinerarioDAO.getInstancia().consultarItinerario()));
//        datosItinerario.setZonas(ItinerarioDAO.getInstancia().consultarItinerario());
//    }

   

    public List<Clima> obtenerClima() {
        return HabitatDAO.getInstancia().obtenerClimas();
    }

    public List<Vegetacion> obtenerVegetacion() {
        return HabitatDAO.getInstancia().obtenerVegetaciones();
    }
}
