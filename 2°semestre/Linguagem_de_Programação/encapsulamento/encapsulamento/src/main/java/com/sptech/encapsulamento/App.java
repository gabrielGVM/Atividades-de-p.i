package com.sptech.encapsulamento;

/**
 *
 * @author miniguiti
 */
public class App {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria();
        conta01.setNomeTitular("José");
        
        ContaBancaria conta02 = new ContaBancaria();
        conta02.setNomeTitular("Maria");
        
        System.out.println("Conta 01: ");
        conta01.depositar(10.11);
  
        System.out.println("Conta 02:");
        conta02.depositar(10000.00);
        
        Double saldoConta1 = conta01.getSaldo();
                
        System.out.println("Saldo c1: " + saldoConta1);
        System.out.println(String.format("Saldo c2: %.2f", conta02.getSaldo()));
    }
}
