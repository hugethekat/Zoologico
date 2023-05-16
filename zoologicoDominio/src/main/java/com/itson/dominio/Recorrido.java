/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.dominio;

import java.time.LocalDate;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Erick
 */
public class Recorrido {
    
    private ObjectId id;
    private double duracion;
    private double longitud;
    private int numVisitantes;
    private LocalDate fechaHora;
    private List <Queja> quejas;
    
    
}
    