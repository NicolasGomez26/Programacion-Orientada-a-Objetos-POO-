package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // cajaAhorro
        Cliente cliente1 = new Cliente(159, "Irrera", 35266025, "20-35266025-7");
        Cuenta cuenta1 = new CajaAhorro(50000.50, cliente1);
        System.out.println("Su saldo actual es de: " + cuenta1.getSaldo());
        cuenta1.depositarEfectivo(20000.00);
        cuenta1.extraerEfectivo(15500.00);
        cuenta1.extraerEfectivo(60000.00);
        // casteo para poder acceder a cobrarIntereses que pertenece a CajaAhorro y no a Cuenta.
        ((CajaAhorro)cuenta1).cobrarInteres();
        System.out.println("Su saldo luego de cobrar los intereses es de: " + cuenta1.getSaldo());

        // cuentaCorriente
        Cliente cliente2 = new Cliente(160, "Podesta", 17110222, "20-17110222-4");
        Cuenta cuenta2 = new CuentaCorriente(15000.00, cliente2);
        System.out.println("Su saldo actual es de: " + cuenta2.getSaldo());
        cuenta2.depositarEfectivo(17500.00);
        cuenta2.extraerEfectivo(22500.00);
        cuenta2.extraerEfectivo(10000.00);
        cuenta2.extraerEfectivo(10000.00);
        cuenta2.extraerEfectivo(2000.00);

    }
}
