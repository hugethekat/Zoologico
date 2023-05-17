/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.Interfaces.iAnimal;
import com.itson.dominio.Animal;
import com.itson.dominio.Sexo;
import com.itson.utils.FormatoColecciones;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Erick
 */
public class AnimalDAO implements iAnimal {
    

  //  @Override
    public Animal createAnimal(String nombre, int edad, Sexo sexo) {

        Animal animal = new Animal();
        animal.setEdad(edad);
        animal.setNombre(nombre);
        animal.setSexo(sexo);

        return animal;

    }

    @Override
    public void guardarAnimal(Animal animal) {

        Document animalDoc = new Document("Nombre", animal.getNombre())
                .append("Edad", animal.getEdad())
                .append("Sexo", animal.getSexo());

        ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getAnimales()).insertOne(animalDoc);
    }

    @Override
    public void eliminarAnimal(Animal animal) {

        Document animalDoc = new Document("Nombre", animal.getNombre())
                .append("Edad", animal.getEdad())
                .append("Sexo", animal.getSexo());

        ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getAnimales()).deleteOne(animalDoc);

    }

    @Override
    public List<Animal> consultarAnimales() {

        List<Animal> listaAnimales = new ArrayList();

        MongoCursor<Document> animalDoc = ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getAnimales()).find().iterator();

        while (animalDoc.hasNext()) {
            Document document = animalDoc.next();
            String nombre = document.getString("Nombre");
            int edad = document.getInteger("Edad");
            String sexo = document.getString("Sexo");

            if (sexo.equals("MACHO")) {
                listaAnimales.add(createAnimal(nombre, edad, Sexo.MACHO));
            } else if (sexo.equals("HEMBRA")) {
                listaAnimales.add(createAnimal(nombre, edad, Sexo.MACHO));
            }
        }
        return listaAnimales;

    }
}