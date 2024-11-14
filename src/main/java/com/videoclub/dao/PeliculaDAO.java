package com.videoclub.dao;

import java.sql.SQLException;

public interface PeliculaDAO {
    void insertarPelicula(Pelicula pelicula) throws SQLException;

    Pelicula obtenerPelicula(int id);

    List<Pelicula> obtenerTodasPeliculas();

    void actualizarPelicula(Pelicula pelicula) throws SQLException;

    void eliminarPelicula(int id) throws SQLException;
}
