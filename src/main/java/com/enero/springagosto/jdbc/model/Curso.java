package com.enero.springagosto.jdbc.model;

import java.util.Date;

public class Curso {
    private long id;
    private String nombre;
    private String codigo;
    private String fechainicio;
    private long idprograma;
    private Programa programa;
    
    public long getIdprograma() {
        return idprograma;
    }

    public void setIdprograma(long idprograma) {
        this.idprograma = idprograma;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
}