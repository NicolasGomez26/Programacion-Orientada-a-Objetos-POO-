package com.company;

public class StateFeliz implements StateTamagochi{


    @Override
    public StateTamagochi comer() {
        return new StateSediento();
    }

    @Override
    public StateTamagochi beber() {
        return new StateHambriento();
    }

    @Override
    public StateTamagochi recibirMimos() {
        return this;
    }
}
