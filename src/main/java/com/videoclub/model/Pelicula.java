package com.videoclub.model;

public class Pelicula {

    private int id;
    private String titulo;
    private String director;
    private int anio;
    private String genero;
    private float precio;

    public Pelicula(int id, String titulo, String director, int anio, String genero, float precio) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.genero = genero;
        this.precio = precio;
    }

    //Constructor sin id

    public Pelicula(String titulo, String director, int anio, String genero, float precio) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.genero = genero;
        this.precio = precio;
    }


    //Getter y setter de todo


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
