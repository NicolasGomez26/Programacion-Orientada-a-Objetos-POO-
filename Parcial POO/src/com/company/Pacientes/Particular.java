package com.company.Pacientes;

import com.company.Consulta;

public class Particular extends Paciente {

    private Double precioConsulta;
    private Integer dni;

    public Particular(Consulta consulta, String fechaNacimiento, String nombre, String apellido, Integer numeroConsulta, Double precioConsulta, Integer dni) {
        super(consulta, fechaNacimiento, nombre, apellido, numeroConsulta);
        this.precioConsulta = precioConsulta;
        this.dni = dni;
    }

}
