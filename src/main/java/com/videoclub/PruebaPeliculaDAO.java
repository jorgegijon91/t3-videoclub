package com.videoclub;

import com.videoclub.dao.PeliculaDAO;
import com.videoclub.dao.PeliculaDaoImpl;
import com.videoclub.model.Pelicula;

import java.sql.SQLException;

public class PruebaPeliculaDAO {
    public static void main(String[] args) {
        //Crear instancia del DAO
        PeliculaDAO peliculaDAO = new PeliculaDaoImpl();

        //Insertar nueva pelicula
        Pelicula pelicula = new Pelicula("La Vida es bella", "Roberto Benigni", 1999, "drama", 2.5f);
        //Persistir pelicula
        try {
            peliculaDAO.insertarPelicula(pelicula);
            System.out.println("Se ha insertado la pelicula");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
