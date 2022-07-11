package com.company;

public class CajaAhorro extends Cuenta {
    private Double tasaInteres;

    public CajaAhorro (Double saldo, Cliente cliente){
        super(saldo, cliente);
        tasaInteres = 25.00;
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
        Double saldoActual = super.getSaldo();
        if(importe <= saldoActual){
            saldoActual -= importe;
            super.setSaldo(saldoActual);
            System.out.println("Extracción realizada con éxito, el nuevo saldo es: " + super.getSaldo());
        } else System.out.println("Saldo menor al que desea extraer, por favor ingrese un monto igual o menor a su saldo actual");
    }

    public void cobrarInteres (){
        tasaInteres = super.getSaldo() * tasaInteres / 100;
        Double nuevoSaldo = super.getSaldo() + tasaInteres;
        super.setSaldo(nuevoSaldo);
    }

}
