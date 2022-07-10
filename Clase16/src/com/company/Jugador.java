package com.company;

public class Jugador implements Comparable<Jugador> {

    private Integer numeroCamiseta;
    private String nombre;
    private Boolean esTitular;
    private Boolean estaLesionado;

    public Jugador(Integer numeroCamiseta, String nombre, Boolean esTitular, Boolean estaLesionado) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.esTitular = esTitular;
        this.estaLesionado = estaLesionado;
    }

    @Override
    public String toString() {
        return
                "numero: " + numeroCamiseta +", nombre: "+ nombre;
    }

    @Override
    public int compareTo(Jugador jugador) {
        if (this.numeroCamiseta > jugador.numeroCamiseta) {
            return 1;
        } else if (this.numeroCamiseta < jugador.numeroCamiseta) {
            return -1;
        }
        return 0;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }
}
