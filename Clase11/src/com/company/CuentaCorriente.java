package com.company;

public class CuentaCorriente extends Cuenta{

    private Double descubierto;

    public CuentaCorriente (Double saldo, Cliente cliente){
        super(saldo, cliente);
        descubierto = 10000.00;
    }

    @Override
    public void depositarEfectivo(Double importe) {
        Double saldo = super.getSaldo();
        saldo += importe;
        super.setSaldo(saldo);
        System.out.println("Depósito realizado con éxito, su nuevo saldo es: " + super.getSaldo());
    }

    @Override
    public void extraerEfectivo(Double importe) {
        Double saldoActual = super.getSaldo() + descubierto;
        if(importe <= saldoActual){
            saldoActual = saldoActual - importe - descubierto;
            super.setSaldo(saldoActual);
            System.out.println("Extracción realizada con éxito, el nuevo saldo es: " + super.getSaldo());
        } else System.out.println("Su saldo más el descubierto asignado es menor al monto que desea extraer, por favor ingrese un nuevo monto");
    }
}
