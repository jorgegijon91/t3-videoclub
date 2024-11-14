package com.videoclub.dao;

import com.videoclub.model.Pelicula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PeliculaDaoImpl implements PeliculaDAO{
    //Atributos para la conexión
    private final String url="jdbc:mariadb://localhost:3306/adt_t3_videoculub";
    private final String username="root";
    private final String password="";

    //Conectarse a la base
     //Metodo privado que nos devuelva la conexión
    private Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    @Override
    public void insertarPelicula(Pelicula pelicula) throws SQLException {
        // Insertar en películas
        String sql = "INSERT INTO peliculas(titulo, director, anio, genero, precio) " +
                "VALUES(?, ?, ?, ?, ?)";
        //Conectarse
        try (Connection conn = obtenerConexion()) {
            //Preparar la sentencia
            PreparedStatement pstmt = conn.prepareStatement(sql);
            //Sacar los atributos y meterlos en el Statement
            pstmt.setString(1, pelicula.getTitulo());
            pstmt.setString(2, pelicula.getDirector());
            pstmt.setInt(3, pelicula.getAnio());
            pstmt.setString(4, pelicula.getGenero());
            pstmt.setFloat(5, pelicula.getPrecio());
            //Ejecutar la sentencia
            pstmt.executeUpdate();
        }
    }

    @Override
    public Pelicula obtenerPelicula(int id) {
        return null;
    }

    @Override
    public List<Pelicula> obtenerTodasPeliculas() {
        return null;
    }

    @Override
    public void actualizarPelicula(Pelicula pelicula) throws SQLException {

    }

    @Override
    public void eliminarPelicula(int id) throws SQLException {

    }
}
