package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Objeto nave = new Nave(10, 20, 'N', 50.00);
        System.out.println("La dirección de la nave es: " + nave.getDireccion());
        System.out.println("La posición x de la nave es: " + nave.getPosx());
        System.out.println("La posición y de la nave es: " + nave.getPosy());

        nave.irA(20, 30, 'N');
        System.out.println("La dirección de la nave es: " + nave.getDireccion());
        System.out.println("La posición x de la nave es: " + nave.getPosx());
        System.out.println("La posición y de la nave es: " + nave.getPosy());

        nave.irA(50, 50, 'S');
        System.out.println("La dirección de la nave es: " + nave.getDireccion());
        System.out.println("La posición x de la nave es: " + nave.getPosx());
        System.out.println("La posición y de la nave es: " + nave.getPosy());

        Objeto asteroide = new Asteroide(35, 75, 'O', 20);
        System.out.println("La dirección del asteroide es: " + asteroide.getDireccion());
        System.out.println("La posición x del asteroide es: " + asteroide.getPosx());
        System.out.println("La posición y del asteroide es: " + asteroide.getPosy());

        asteroide.irA(20, 30, 'E');
        System.out.println("La dirección del asteroide es: " + asteroide.getDireccion());
        System.out.println("La posición x del asteroide es: " + asteroide.getPosx());
        System.out.println("La posición y del asteroide es: " + asteroide.getPosy());

        asteroide.irA(50, 50, 'S');
        System.out.println("La dirección del asteroide es: " + asteroide.getDireccion());
        System.out.println("La posición x del asteroide es: " + asteroide.getPosx());
        System.out.println("La posición y del asteroide es: " + asteroide.getPosy());
    }
}
