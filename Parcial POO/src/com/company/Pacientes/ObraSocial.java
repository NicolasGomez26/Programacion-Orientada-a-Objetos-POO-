package com.company.Pacientes;

import com.company.Consulta;

public class ObraSocial extends Paciente implements Comparable{

    private Integer numeroObraSocial;
    private Integer numeroAsociado;

    public ObraSocial(Consulta consulta, String fechaNacimiento, String nombre, String apellido, Integer numeroConsulta, Integer numeroObraSocial, Integer numeroAsociado) {
        super(consulta, fechaNacimiento, nombre, apellido, numeroConsulta);
        this.numeroObraSocial = numeroObraSocial;
        this.numeroAsociado = numeroAsociado;
    }

    @Override
    public int compareTo(Object object) {
        ObraSocial otroObraSocial = (ObraSocial) object;

        if (numeroAsociado > otroObraSocial.numeroAsociado){
            return 1;
        }
        else if (numeroAsociado < otroObraSocial.numeroAsociado){
            return -1;
        }
        return 0;
    }
}
