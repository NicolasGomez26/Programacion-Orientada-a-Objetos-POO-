package com.company;

import com.company.Pacientes.ObraSocial;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Consulta consulta1 = new Consulta("26-08-2021","pediatria","16:30");
        Consulta consulta2 = new Consulta("12-09-2019","pediatria","199");

        ObraSocial obraSocial1 = new ObraSocial(consulta1,"26-08-2002","Pedro","Santos",1,116665,3332);
        ObraSocial obraSocial2 = new ObraSocial(consulta2,"30-12-1996","Santiago","Almaraz",5,654121,100);


        System.out.println(obraSocial2.hacerEvaluacionInicial());

        System.out.println(obraSocial1.compareTo(obraSocial2));
    }
}
