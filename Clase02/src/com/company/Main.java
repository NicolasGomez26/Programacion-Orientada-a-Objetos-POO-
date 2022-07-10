package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 4;

        System.out.println("es Divisible: "+ esDivisible(numero1, numero2));
        System.out.println("Que numeros queres sumar??" + suma(a,b));
        }
        public static boolean esDivisible(int numero1, int numero2){
            if (numero1 % numero2 == 0){
                return true;
            }
            return false;
        }

        public static int suma(int a,int b){
        return a + b;
        }

    }


