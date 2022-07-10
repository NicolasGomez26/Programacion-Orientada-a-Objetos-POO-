package com.company;

public class Cliente {
    //atributos
    private Integer numeroDeCliente;
    private String nombre;
    private Double deuda;

    //constructor

//    public Cliente(Integer numeroDeCliente, String nombre) {
//        this.numeroDeCliente = numeroDeCliente;
//        this.nombre = nombre;
//        this.deuda = 0.0;
//    }

    public Cliente(Integer numeroDeCliente, String nombre, Double deuda) {
        this.numeroDeCliente = numeroDeCliente;
        this.nombre = nombre;
        this.deuda = deuda;
    }



    //Getters y Setters

    public String getNombre() {
        return nombre;
    }
    public Double getDeuda() {
        return deuda;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //metodo
    public void incrementarDeuda(Double valor) {
        if (valor > 0) {
            System.out.println("Mi deuda era de  " + deuda + " e incremento mi deuda por " + valor);
            deuda += valor;
            System.out.println("Mi nueva deuda es de " + deuda);
        }
        else{
            System.out.println("No se puede incrementar la deuda por valores negativos");
        }
    }
    public void pagarDeuda(){
        deuda = 0.0;
    }
}