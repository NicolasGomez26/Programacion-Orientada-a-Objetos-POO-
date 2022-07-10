package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente = new Cliente(1,"Mario",300.0);

        Cliente cliente2 = new Cliente(2, "José",300.0);

        cliente.incrementarDeuda(200.0);
        cliente.pagarDeuda();
        System.out.println(cliente.getDeuda());
    }
}
+