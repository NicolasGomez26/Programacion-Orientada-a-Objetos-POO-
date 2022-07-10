package com.company;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Jugador> plantel;


    public Equipo (String nombre){
        this.nombre = nombre;
        plantel = new ArrayList<>();
    }

    public Jugador buscarJugador(Integer numeroDeCamiseta) throws EquipoException{
        Jugador jugadorBuscado = null;
        for (Jugador jugador: plantel) {
            if (jugador.getNumeroCmiseta().equals(numeroDeCamiseta)){
                jugadorBuscado = jugador;
                break;
            }
        }
        if (jugadorBuscado == null){
        throw new EquipoException(" no existe jugador con el numero "+ numeroDeCamiseta);
        }
        return  jugadorBuscado;
    }
    public void agregarJugador(Jugador jugador){
        plantel.add(jugador);

    }

    public  List<Jugador> obtenerReservas(){
        List<Jugador> reservas = new ArrayList<>();

        for (int i = 18; i < plantel.size(); i++) {
            reservas.add(plantel.get(i));
        }
        
        return reservas;
    }

    public Integer cantJugadores(String posicion) throws EquipoException{

        if (!posicionesValidas().contains(posicion)){
            throw new EquipoException(posicion + " no es una posicion valida");
        }

        Integer cantidadJugadores = 0;

        for(Jugador jugador : plantel){
            if (jugador.getPosicion().equals(posicion)){
                cantidadJugadores ++;
            }
        }

        return cantidadJugadores;
    }

    private  List<String> posicionesValidas(){
        List<String> posicionesValidas = new ArrayList<>();
        posicionesValidas.add("ARQUERO");
        posicionesValidas.add("DEFENSOR");
        posicionesValidas.add("MEDIOCAMPISTA");
        posicionesValidas.add("DELANTERO");
        return  posicionesValidas;
    }
}
