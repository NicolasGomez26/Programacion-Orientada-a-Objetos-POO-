package com.company;

import java.util.Dictionary;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre perro: ");
        String nombrePerro = scanner.nextLine();
        System.out.println("Alimento requerido: ");
        Double cuantoAlimentoRequiere = scanner.nextDouble();

        Integer cantidadPaquetes = cuantosPaquetes(cuantoAlimentoRequiere);

        System.out.println( "A "+ nombrePerro + " hay que darle: " + cantidadPaquetes + " paquete/s.");
    }
    public static Integer cuantosPaquetes(Double cuantoAlimentoRequiere){

        Scanner scanner = new Scanner(System.in);
        Double totalAlimento = 0.0;
        Integer cantidadPaquetes = 0;
        while (totalAlimento < cuantoAlimentoRequiere){
            System.out.println("Peso del paquete: ");
            Double pesoPaquete = scanner.nextDouble();
            totalAlimento += pesoPaquete;
            cantidadPaquetes ++;
        }
        return cantidadPaquetes;
    }
}
