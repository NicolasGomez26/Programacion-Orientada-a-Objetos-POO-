package com.company;

public class Nave extends Objeto {
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad){
        super(posx, posy, direccion);
        this.velocidad = velocidad;
    }

    @Override
    public void irA(int x, int y, char direccion) {
         if (super.getDireccion() != direccion) {
            girar(direccion);
        }
         super.setPosx(x);
         super.setPosy(y);
    }

    public void girar (char direccion){
        super.setDireccion(direccion);
    }

    public void restaVida (int valor){

    }
}
