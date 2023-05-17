/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itson.Interfaces;

import com.itson.dominio.Conocimiento;
import com.itson.dominio.Cuidador;
import com.itson.dominio.CuidadorEspecie;
import java.time.LocalDate;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Erick
 */
public interface iCuidador {

    public Cuidador createCuidador(String nombre, String direccion, String telefono, LocalDate fechaInicio, List<CuidadorEspecie> especies, List<Conocimiento> conocimientos);

    public void guardarCuidador(Cuidador cuidador);

    public void eliminarCuidador(Cuidador cuidador);

    public List<Cuidador> consultarCuidador();
}
