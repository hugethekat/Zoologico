/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itson.DAOs;

import com.itson.dominio.Clima;

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
//
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


    }

}
