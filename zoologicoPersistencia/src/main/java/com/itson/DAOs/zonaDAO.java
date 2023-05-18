/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.DAOs;

import com.itson.BaseDeDatos.ConexionDB;
import com.itson.Interfaces.iZona;
import com.itson.dominio.Animal;
import com.itson.dominio.DiaHora;
import com.itson.dominio.Zona;
import com.itson.dominio.Itinerario;
import com.itson.dominio.Recorrido;
import com.itson.dominio.Sexo;
import com.itson.utils.FormatoColecciones;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Erick
 */
public class ZonaDAO implements iZona {

    private static ZonaDAO instancia;

    public static ZonaDAO getInstancia() {
        if (instancia == null) {
            instancia = new ZonaDAO();
        }
        return instancia;
    }

    @Override
    public void guardarZona(Zona queja) {

        Document zonaDoc = new Document("Nombre", queja.getNombre())
                .append("Extension", queja.getExtension());

        ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getZonas()).insertOne(zonaDoc);
    }

    @Override
    public void eliminarZona(Zona queja) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Zona> consultarZona() {
        List<Zona> listaZonas = new ArrayList();

        MongoCursor<Document> ZonasDoc = ConexionDB.obtenerInstancia().getCollection(FormatoColecciones.getZonas()).find().iterator();

        while (ZonasDoc.hasNext()) {
            Document documento = ZonasDoc.next();
            String nombre = documento.getString("Nombre");
            double extension = documento.getDouble("Extension");

            Zona zona = new Zona();
            zona.setNombre(nombre);
            zona.setExtension(extension);

            listaZonas.add(zona);
        }
        return listaZonas;
    }
}
