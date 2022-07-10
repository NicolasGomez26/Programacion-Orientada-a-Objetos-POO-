package com.company;

public class StateTriste implements  StateTamagochi{
    @Override
    public StateTamagochi comer() {
        return new StateFeliz();
    }

    @Override
    public StateTamagochi beber() {
        return new StateFeliz();
    }

    @Override
    public StateTamagochi recibirMimos() {
        return new StateFeliz();
    }
}
