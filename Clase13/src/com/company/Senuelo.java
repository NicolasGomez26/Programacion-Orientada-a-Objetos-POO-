package com.company;

public class Senuelo implements Mostrador {

    private Integer energia;

    public Senuelo(Integer energia) {
        this.energia = energia;
    }

    @Override
    public void mostrarse() {
        System.out.println("Me muestro");
    }
}
