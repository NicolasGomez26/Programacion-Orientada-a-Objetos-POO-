package com.company;

import java.util.Date;

public class Impresora {

    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private Integer hojasDisponibles;

    public Impresora(String modelo, String tipoConexion){
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        fechaFabricacion = new Date();
        hojasDisponibles = 100;
    }

    public Impresora(String modelo, String tipoConexion, Date fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        hojasDisponibles = 100;
    }
    private Boolean tienePapel(){
        return hojasDisponibles > 0;
    }

    public void imprimir(String texto){
        if (tienePapel()){
            System.out.println(texto);
            hojasDisponibles --;
        }
        else {
            System.out.println("No hay papel");
        }
    }
}
