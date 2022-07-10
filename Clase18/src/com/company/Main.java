package com.company;

import java.io.FilterOutputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Equipo equipo = new Equipo("Chacarita");

        equipo.agregarJugador(new Jugador("ARQUERO","Dibu",1));
        equipo.agregarJugador(new Jugador("MEDIOCAMPISTA","Paredes",5));
        equipo.agregarJugador(new Jugador("DELANTERO","Martinez",9));
        equipo.agregarJugador(new Jugador("DEFENSOR","Romero",2));

        equipo.agregarJugador(new Jugador("ARQUERO","Dibu",1));
        equipo.agregarJugador(new Jugador("MEDIOCAMPISTA","Paredes",5));
        equipo.agregarJugador(new Jugador("DELANTERO","Martinez",9));
        equipo.agregarJugador(new Jugador("DEFENSOR","Romero",2));

        equipo.agregarJugador(new Jugador("ARQUERO","Dibu",1));
        equipo.agregarJugador(new Jugador("MEDIOCAMPISTA","Paredes",5));
        equipo.agregarJugador(new Jugador("DELANTERO","Martinez",9));
        equipo.agregarJugador(new Jugador("DEFENSOR","Romero",2));

        equipo.agregarJugador(new Jugador("ARQUERO","Dibu",1));
        equipo.agregarJugador(new Jugador("MEDIOCAMPISTA","Paredes",5));
        equipo.agregarJugador(new Jugador("DELANTERO","Martinez",9));
        equipo.agregarJugador(new Jugador("DEFENSOR","Romero",2));

        equipo.agregarJugador(new Jugador("ARQUERO","Dibu",1));
        equipo.agregarJugador(new Jugador("MEDIOCAMPISTA","Paredes",5));
        equipo.agregarJugador(new Jugador("DELANTERO","Martinez",9));
        equipo.agregarJugador(new Jugador("DEFENSOR","Romero",2));

        equipo.agregarJugador(new Jugador("ARQUERO","Dibu",1));
        equipo.agregarJugador(new Jugador("MEDIOCAMPISTA","Paredes",5));
        equipo.agregarJugador(new Jugador("DELANTERO","Martinez",9));
        equipo.agregarJugador(new Jugador("DEFENSOR","Romero",2));

        System.out.println(equipo.obtenerReservas());
        try {
            System.out.println(equipo.cantJugadores("ARQUERO"));
        } catch (EquipoException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(equipo.buscarJugador(2).getPosicion());
        } catch (EquipoException e) {
            e.printStackTrace();
        }
    }
}
