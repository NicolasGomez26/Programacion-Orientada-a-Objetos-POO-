package com.company;

public abstract class Cuenta {

    private Double saldo;
    private Cliente cliente;

    public Cuenta (Double saldo, Cliente cliente){
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public abstract void depositarEfectivo (Double importe);

    public abstract void extraerEfectivo (Double importe);

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
