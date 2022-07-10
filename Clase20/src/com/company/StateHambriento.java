package com.company;

public class StateHambriento implements StateTamagochi{

    @Override
    public StateTamagochi comer() {
        return new StateFeliz();
    }

    @Override
    public StateTamagochi beber() {
        return new StateTriste();
    }

    @Override
    public StateTamagochi recibirMimos() {
        return this;
    }
}
