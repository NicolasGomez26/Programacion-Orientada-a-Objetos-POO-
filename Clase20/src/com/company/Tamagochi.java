package com.company;

public class Tamagochi {

    private String nombre;
    private StateTamagochi estadoActual;

    public Tamagochi(String nombre ) {
        this.nombre = nombre;
        this.estadoActual =  new StateFeliz();
    }

    public Tamagochi(String nombre, StateTamagochi estadoActual) {
        this.nombre = nombre;
        this.estadoActual = estadoActual;
    }

    public void darDeComer(){
        estadoActual = estadoActual.comer();
    }

    public void darDeBeber(){
        estadoActual = estadoActual.beber();
    }

    public void darMimos(){
        estadoActual = estadoActual.recibirMimos();
    }
}
