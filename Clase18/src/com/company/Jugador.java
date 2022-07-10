package com.company;

public class Jugador {

    private String posicion;
    private String apellido;
    private Integer numeroCmiseta;

    public Jugador(String posicion, String apellido, Integer numeroCmiseta) {
        this.posicion = posicion;
        this.apellido = apellido;
        this.numeroCmiseta = numeroCmiseta;
    }

    public Integer getNumeroCmiseta() {
        return numeroCmiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return  apellido +  numeroCmiseta;
    }
}
