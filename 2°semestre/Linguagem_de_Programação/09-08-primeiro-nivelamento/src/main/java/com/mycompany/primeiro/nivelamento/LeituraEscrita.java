package com.mycompany.primeiro.nivelamento;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class LeituraEscrita {
    public static void main(String[] args) {
        //utilizar o scaner para ler os valores do console
        
        //claasse que usamos pra criar um objeto
        //new serve para instanciar um objeto, ou seja criando um obj
        //criando um objeto do tipo scanner
        //leitor.
        //colocar \n serve para quebrar a linha, bem como br
        //da mesma forma o \t dá um tab/ paragrafo
        Scanner leitor = new Scanner(System.in);
                
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        System.out.println("Digite sua altura: ");
        Double altura = leitor.nextDouble();
        
        System.out.println("Parabéns " + nome);
        
        System.out.println("Nome: " + nome + 
                "\nIdade: " + idade + 
                "\nAltura: " + altura);
    }
}
