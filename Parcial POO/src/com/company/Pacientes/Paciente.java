package com.company.Pacientes;

import com.company.Consulta;

public abstract class Paciente {

    private Consulta consulta;
    private String fechaNacimiento;
    private String nombre;
    private String apellido;
    private Integer numeroConsulta;

    public Paciente(Consulta consulta, String fechaNacimiento, String nombre, String apellido, Integer numeroConsulta) {
        this.consulta = consulta;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroConsulta = numeroConsulta;
    }


    public Boolean hacerEvaluacionInicial(){
        return numeroConsulta == 1;
    }
}
