package com.example.partysearchbeta.modelo;

public class cuenta_usuario extends persona {

    private int usu_codigo;
    private String usu_nombre;
    private String usu_contrasena;

    public cuenta_usuario(int persona_codigo, int usu_codigo, String usu_nombre, String usu_contrasena) {
        super(persona_codigo);
        this.usu_codigo = usu_codigo;
        this.usu_nombre = usu_nombre;
        this.usu_contrasena = usu_contrasena;
    }

    public cuenta_usuario(int persona_codigo, String persona_nombre, String persona_apellido, String persona_corre_electronico, String persona_telefono, int usu_codigo, String usu_nombre, String usu_contrasena) {
        super(persona_codigo, persona_nombre, persona_apellido, persona_corre_electronico, persona_telefono);
        this.usu_codigo = usu_codigo;
        this.usu_nombre = usu_nombre;
        this.usu_contrasena = usu_contrasena;
    }

    public int getUsu_codigo() {
        return usu_codigo;
    }

    public void setUsu_codigo(int usu_codigo) {
        this.usu_codigo = usu_codigo;
    }

    public String getUsu_nombre() {
        return usu_nombre;
    }

    public void setUsu_nombre(String usu_nombre) {
        this.usu_nombre = usu_nombre;
    }

    public String getUsu_contrasena() {
        return usu_contrasena;
    }

    public void setUsu_contrasena(String usu_contrasena) {
        this.usu_contrasena = usu_contrasena;
    }
}
