/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.Interfaces;

import com.itson.dominio.Animal;
import com.itson.dominio.Queja;
import com.itson.dominio.Recorrido;
import java.time.LocalDate;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Erick
 */
public interface iRecorrido {

    public Recorrido createRecorrido(double longitud,LocalDate fechaHora, ObjectId idGuia, ObjectId idItinerario, int numVisitantes, List <Queja> quejas);

    public void guardarRecorrido(Recorrido recorrido);

    public void eliminarRecorrido(Recorrido recorrido);

    public List<Recorrido> consultarRecorridos();

}
