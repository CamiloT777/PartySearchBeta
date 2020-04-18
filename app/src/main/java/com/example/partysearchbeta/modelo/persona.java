package com.example.partysearchbeta.modelo;

public class persona {

    private int persona_codigo;
    private String persona_nombre;
    private String persona_apellido;
    private String persona_corre_electronico;
    private String persona_telefono;

    public persona(int persona_codigo) {
        this.persona_codigo = persona_codigo;
    }

    public persona(int persona_codigo, String persona_nombre, String persona_apellido, String persona_corre_electronico, String persona_telefono) {
        this.persona_codigo = persona_codigo;
        this.persona_nombre = persona_nombre;
        this.persona_apellido = persona_apellido;
        this.persona_corre_electronico = persona_corre_electronico;
        this.persona_telefono = persona_telefono;
    }

    public int getPersona_codigo() {
        return persona_codigo;
    }

    public void setPersona_codigo(int persona_codigo) {
        this.persona_codigo = persona_codigo;
    }

    public String getPersona_nombre() {
        return persona_nombre;
    }

    public void setPersona_nombre(String persona_nombre) {
        this.persona_nombre = persona_nombre;
    }

    public String getPersona_apellido() {
        return persona_apellido;
    }

    public void setPersona_apellido(String persona_apellido) {
        this.persona_apellido = persona_apellido;
    }

    public String getPersona_corre_electronico() {
        return persona_corre_electronico;
    }

    public void setPersona_corre_electronico(String persona_corre_electronico) {
        this.persona_corre_electronico = persona_corre_electronico;
    }

    public String getPersona_telefono() {
        return persona_telefono;
    }

    public void setPersona_telefono(String persona_telefono) {
        this.persona_telefono = persona_telefono;
    }
}
