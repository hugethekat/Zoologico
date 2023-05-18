/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itson.DAOs;


import com.itson.dominio.Clima;
import com.itson.dominio.Animal;
import com.itson.dominio.DiaHora;
import com.itson.dominio.Dias;
import com.itson.dominio.Itinerario;
import com.itson.dominio.Sexo;
import com.itson.dominio.Zona;
import java.util.ArrayList;
import java.util.List;


import com.itson.dominio.Zona;

/**
 *
 * @author Erick
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//
//        Habitat habitat = new Habitat();
//        List<Clima> climas = new ArrayList();
//        Clima clima1 = new Clima();
//        clima1.setNombre("Clima fuerte");
//        clima1.setDescripcion("Ta fuerte");
//        climas.add(clima1);
//        List<Continente> continentes = new ArrayList();
//        continentes.add(Continente.ASIA);
//        continentes.add(Continente.AFRICA);
//        List<ObjectId> idEspecies = new ArrayList();
//        List<Vegetacion> vegetaciones = new ArrayList();
//        Vegetacion vegetacion = new Vegetacion();
//        vegetacion.setNombre("CottonCandy");
//        vegetaciones.add(vegetacion);
//        
//        habitat.setClimas(climas);
//        habitat.setContinentes(continentes);
//        habitat.setEspecies(idEspecies);
//        habitat.setNombre("RacoonLand");
//        habitat.setVegetaciones(vegetaciones);
//        
//        HabitatDAO.getInstancia().eliminarHabitat(habitat);

//        Animal animal = new Animal();
//        animal.setEdad(4);
//        animal.setNombre("Bolt");
//        animal.setSexo(Sexo.MACHO);
//
//        AnimalDAO.getInstancia().guardarAnimal(animal);
//
//        System.out.println(AnimalDAO.getInstancia().consultarAnimales().toString());
//
//        AnimalDAO.getInstancia().eliminarAnimal(animal);

//        
//                System.out.println(AnimalDAO.getInstancia().consultarAnimales().toString());
//                
                System.out.println(HabitatDAO.getInstancia().obtenerHabitat("MapacheLand").getContinentes());

//
//        System.out.println(AnimalDAO.getInstancia().consultarAnimales().toString());

//        Itinerario itinerario = new Itinerario();
//        itinerario.setDuracion(500);
//        itinerario.setLongitud(7524);
//        itinerario.setMaxVisitantes(20);
//
//        List<DiaHora> DiasHoras = new ArrayList<>();
//        DiaHora diaHora = new DiaHora();
//        diaHora.setDia(Dias.LUNES);
//
//        List<String> horas = new ArrayList<>();
//        horas.add("12:00");
//        horas.add("1:00");
//        diaHora.setHora(horas);
//        itinerario.setDiasHora(DiasHoras);
//        
//         List<Zona> zonas = new ArrayList<>();


         ZonaDAO zonaDAO = new ZonaDAO();
         Zona zona = new Zona();
         zona.setExtension(100);
         zona.setNombre("Mamiferos");
         
        ZonaDAO.getInstancia().guardarZona(zona);
        System.out.println(ZonaDAO.getInstancia().consultarZona().toString());

    }

}
