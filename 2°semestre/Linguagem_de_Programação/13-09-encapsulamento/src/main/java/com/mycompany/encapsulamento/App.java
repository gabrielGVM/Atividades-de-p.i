package com.mycompany.encapsulamento;

/**
 *
 * @author gabri
 */
public class App {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria();
        
        ContaBancaria conta02 = new ContaBancaria();
        
        System.out.println("Conta 01");
        conta01.depositar(10.11);
        
        System.out.println("Conta 02");
        conta02.depositar(10000.0);
        
        System.out.println("Saldo c1: " + conta01.pegarSaldo());
        System.out.println("Saldo c2: " + conta02.pegarSaldo());
        Double saldoConta1 = conta01.getSaldo();
    }
}
