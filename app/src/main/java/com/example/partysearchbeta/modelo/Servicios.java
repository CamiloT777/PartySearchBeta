package com.example.partysearchbeta.modelo;

public class Servicios {
    private String s_nombre ;
    private String s_descripcion;
    private String s_precio;
    private String s_direccion;
    private String s_contactos;


    public Servicios() {

    }

    public Servicios(String s_nombre, String s_descripcion, String s_precio, String s_direccion, String s_contactos) {
        this.s_nombre = s_nombre;
        this.s_descripcion = s_descripcion;
        this.s_precio = s_precio;
        this.s_direccion = s_direccion;
        this.s_contactos = s_contactos;
    }

    public String getS_nombre() {
        return s_nombre;
    }

    public void setS_nombre(String s_nombre) {
        this.s_nombre = s_nombre;
    }

    public String getS_descripcion() {
        return s_descripcion;
    }

    public void setS_descripcion(String s_descripcion) {
        this.s_descripcion = s_descripcion;
    }

    public String getS_precio() {
        return s_precio;
    }

    public void setS_precio(String s_precio) {
        this.s_precio = s_precio;
    }

    public String getS_direccion() {
        return s_direccion;
    }

    public void setS_direccion(String s_direccion) {
        this.s_direccion = s_direccion;
    }

    public String getS_contactos() {
        return s_contactos;
    }

    public void setS_contactos(String s_contactos) {
        this.s_contactos = s_contactos;
    }
}
