package com.mycompany.avaliacao.continuada.gabriel.valentim;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class GabrielValentim {
    public static void main(String[] args) {
        Double totalGuardado;
        
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("| SPTech Investimentos  |");
        System.out.println("--------------------------");
        System.out.println("| Olá, o que deseja fazer:  |");
        System.out.println("--------------------------");
        System.out.println("|   1 - Depositar    |");
        System.out.println("|   2 - Sacar   |");
        System.out.println("|   3 - Simular rendimentos   |");
        System.out.println("|   0 - Sair   |");
        System.out.println("--------------------------");
        
        // opção 1 - Depositar
        
        Double opcao01 = leitor.nextDouble();

            System.out.println("Digite o valor do depósito:");
            Double valorDeposito = leitor.nextDouble();
            if(valorDeposito < 0){
                System.out.println("Valor inválido");
            } else {
                System.out.println("Depósito realizado - Saldo atual: " + valorDeposito);
            }

        System.out.println("--------------------------");
        System.out.println("| SPTech Investimentos  |");
        System.out.println("--------------------------");
        System.out.println("| Olá, o que deseja fazer:  |");
        System.out.println("--------------------------");
        System.out.println("|   1 - Depositar    |");
        System.out.println("|   2 - Sacar   |");
        System.out.println("|   3 - Simular rendimentos   |");
        System.out.println("|   0 - Sair   |");
        System.out.println("--------------------------");
        
//        opção 02 - Sacar

        Double opcao02 = leitor.nextDouble();
         System.out.println("Digite o valor do saque:");
          Double valorSaque = leitor.nextDouble();
          if(valorSaque >= valorDeposito){
              System.out.println("Valor inválido");
          } else{
              System.out.println("Saque realizado - saldo atual de:" + (valorDeposito - valorSaque));
          }
          
        System.out.println("--------------------------");
        System.out.println("| SPTech Investimentos  |");
        System.out.println("--------------------------");
        System.out.println("| Olá, o que deseja fazer:  |");
        System.out.println("--------------------------");
        System.out.println("|   1 - Depositar    |");
        System.out.println("|   2 - Sacar   |");
        System.out.println("|   3 - Simular rendimentos   |");
        System.out.println("|   0 - Sair   |");
        System.out.println("--------------------------");
        
        //opção 03 - Opção Simular rendimentos
        
        totalGuardado = (valorDeposito - valorSaque) * 0.1;
        Double opcao03 = leitor.nextDouble();
        System.out.println("|Saldo atual: " + (valorDeposito - valorSaque) + " |");
        System.out.println("mês 1 - " +  (totalGuardado)  * 0.1);
        System.out.println("--------------------------");
        System.out.println("mês 2- " + (totalGuardado)  * 0.1);
        System.out.println("--------------------------");
        System.out.println("mês 3- " + (totalGuardado)  * 0.1);
        System.out.println("--------------------------");
        System.out.println("mês 4- " + (totalGuardado)  * 0.1);
        System.out.println("--------------------------");
        System.out.println("mês 5- " + (totalGuardado)  * 0.1);
        System.out.println("--------------------------");
        System.out.println("mês 6- " + (totalGuardado)  * 0.1);
        System.out.println("--------------------------");
        System.out.println("mês 7- " + (totalGuardado)  * 0.1);
        System.out.println("--------------------------");
        System.out.println("mês 8- " + (totalGuardado)  * 0.1);
        System.out.println("--------------------------");
        System.out.println("mês 9- " + (totalGuardado)  * 0.1);
        System.out.println("--------------------------");
        System.out.println("mês 10- " + (totalGuardado)  * 0.1);
        System.out.println("--------------------------");
        System.out.println("mês 11- " + (totalGuardado)  * 0.1);
        System.out.println("--------------------------");
        System.out.println("mês 12- " + (totalGuardado)  * 0.1);
        System.out.println("--------------------------");


    }
}
