package com.example.root.testlistapais;

import android.graphics.drawable.Drawable;

public class Pais {

    private int icono;
    private String nombre;
    private String dominio;
    private String descripcion;

    public Pais(int icono, String nombre, String dominio, String descripcion) {
        this.icono = icono;
        this.nombre = nombre;
        this.dominio = dominio;
        this.descripcion = descripcion;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
