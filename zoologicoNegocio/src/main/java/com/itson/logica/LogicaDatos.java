/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.logica;

import com.itson.DAOs.GuiaDAO;
import com.itson.DAOs.HabitatDAO;
import com.itson.DAOs.ItinerarioDAO;
import com.itson.DAOs.QuejaDAO;
import com.itson.DAOs.ZonaDAO;
import com.itson.dominio.Clima;
import com.itson.dominio.DatosItinerario;
import com.itson.dominio.Especie;
import com.itson.dominio.Itinerario;
import com.itson.dominio.Guia;
import com.itson.dominio.Habitat;
import com.itson.dominio.Queja;
import com.itson.dominio.Vegetacion;
import com.itson.dominio.Zona;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

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

    public void hardcodeaGuias() {

        Guia guia1 = new Guia();
        guia1.setDireccion("Avenida siempre viva #224");
        guia1.setFechaInicio(LocalDate.of(1989, Month.MAY, 20));
        guia1.setNombre("Pedro Picapiedra");
        guia1.setTelefono("6644792483");

        Guia guia2 = new Guia();
        guia2.setDireccion("Rene Descartes #4834");
        guia2.setFechaInicio(LocalDate.of(1992, Month.AUGUST, 7));
        guia2.setNombre("Pepe Pecas");
        guia2.setTelefono("6646523483");

        Guia guia3 = new Guia();
        guia3.setDireccion("Hell's kitchen");
        guia3.setFechaInicio(LocalDate.of(1998, Month.DECEMBER, 23));
        guia3.setNombre("Matt Murdock");
        guia3.setTelefono("6644834361");

        GuiaDAO.getInstancia().guardarGuia(guia1);
        GuiaDAO.getInstancia().guardarGuia(guia2);
        GuiaDAO.getInstancia().guardarGuia(guia3);
    }

    public void hardcodeaZonas() {

        List<Especie> especies = new ArrayList();
        List<ObjectId> itinerariosId = new ArrayList();
        Zona zona1 = new Zona();
        zona1.setEspecies(especies);
        zona1.setExtension(123);
        zona1.setIdItinerarios(itinerariosId);
        zona1.setNombre("Reptiles");

        Zona zona2 = new Zona();
        zona2.setEspecies(especies);
        zona2.setExtension(43);
        zona2.setIdItinerarios(itinerariosId);
        zona2.setNombre("Aves");

        Zona zona3 = new Zona();
        zona3.setEspecies(especies);
        zona3.setExtension(213);
        zona3.setIdItinerarios(itinerariosId);
        zona3.setNombre("Felinos");

        Zona zona4 = new Zona();
        zona4.setEspecies(especies);
        zona4.setExtension(121);
        zona4.setIdItinerarios(itinerariosId);
        zona4.setNombre("Polar");

        Zona zona5 = new Zona();
        zona1.setEspecies(especies);
        zona1.setExtension(341);
        zona1.setIdItinerarios(itinerariosId);
        zona1.setNombre("Marino");

        ZonaDAO.getInstancia().guardarZona(zona1);
        ZonaDAO.getInstancia().guardarZona(zona2);
        ZonaDAO.getInstancia().guardarZona(zona3);
        ZonaDAO.getInstancia().guardarZona(zona4);
        ZonaDAO.getInstancia().guardarZona(zona5);

    }

    public void guardarQueja(Queja queja) {
        QuejaDAO.getInstancia().guardarQueja(queja);
    }
    
    public List <Itinerario> recuperaItinerario(){
        return ItinerarioDAO.getInstancia().obtenerItinerarios();
    }

    public List<Guia> obtenerGuias() {
        return GuiaDAO.getInstancia().consultarGuia();
    }

    public List<Zona> obtenerZonas() {
        return ZonaDAO.getInstancia().consultarZona();
    }

    public void guardarItinerario(Itinerario itinerario) {

        ItinerarioDAO.getInstancia().guardarItinerario(itinerario);

    }

    public Itinerario buscaItinerario(String nombre) {
        return ItinerarioDAO.getInstancia().consultarItinerario(nombre);
    }

    public List<Habitat> recuperaHabitats() {

        return HabitatDAO.getInstancia().consultarHabitat();

    }

    public Habitat obtenerHabitat(String nombre) {
        return HabitatDAO.getInstancia().obtenerHabitat(nombre);
    }

    public void guardarHabitat(Habitat habitat) {
        HabitatDAO.getInstancia().guardarHabitat(habitat);
    }

    public DatosItinerario recuperaDatosItinerario() {

        DatosItinerario datosItinerario = new DatosItinerario();
        datosItinerario.setGuias(LogicaDatos.obtenerInstancia().obtenerGuias());
        datosItinerario.setZonas(LogicaDatos.obtenerInstancia().obtenerZonas());

        return datosItinerario;

    }

    public List<Clima> obtenerClima() {
        return HabitatDAO.getInstancia().obtenerClimas();
    }

    public List<Vegetacion> obtenerVegetacion() {
        return HabitatDAO.getInstancia().obtenerVegetaciones();
    }
}