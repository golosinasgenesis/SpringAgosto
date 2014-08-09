package com.enero.springagosto.beans.model;

import java.util.List;

public class Musico extends Persona {

    private int numerocanciones;
    private Instrumento instrumento;
    private List<Instrumento> instrumentos;

    public Musico(int numerocanciones) {
        this.numerocanciones = numerocanciones;
    }

    public Musico() {
        
    }
    
    public Musico(Instrumento instrumento) {
            this.instrumento = instrumento;
    }
    
    public Musico(int numerocanciones, Instrumento instrumento) {
        this.numerocanciones = numerocanciones;
        this.instrumento = instrumento;
    }
   
    public int getNumerocanciones() {
        return numerocanciones;
    }

    public void setNumerocanciones(int numerocanciones) {
        this.numerocanciones = numerocanciones;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(List<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
}