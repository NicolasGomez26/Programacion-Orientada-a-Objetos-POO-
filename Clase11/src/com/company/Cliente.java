package com.company;

public class Cliente {
   private Integer numeroCliente;
   private String apellido;
   private Integer dni;
   private String cuit;

   public Cliente (Integer numeroCliente, String apellido, Integer dni, String cuit){
      this.numeroCliente = numeroCliente;
      this.apellido = apellido;
      this.dni = dni;
      this.cuit = cuit;
   }
}
