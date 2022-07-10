package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Equipo equipo = new Equipo("Saca Chispas");

        equipo.agregarJugador(new Jugador(30,"Messi",true,false));
        equipo.agregarJugador(new Jugador(9,"Aguero",true,true));
        equipo.agregarJugador(new Jugador(1,"Dibu",true,false));
        equipo.agregarJugador(new Jugador(10,"James",true,false));
        equipo.agregarJugador(new Jugador(5,"Rafa",false,false));


        equipo.mostrarTitulares();
        System.out.println(equipo.getCantidadTitularesLesionados());


    }
}
