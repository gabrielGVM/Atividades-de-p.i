package com.mycompany.lista.de.exercicios02;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        // Solicitando o número para o usuário
        System.out.println("Insira um número entre 0 e 10: ");
        Scanner leitor = new Scanner(System.in);
        Integer numeroDigitado = leitor.nextInt();
        
        // Tentando adivinhar o número do usuário
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
        System.out.println("Seu número foi " + numeroAleatorio + "?");
        System.out.println(numeroAleatorio);
        
        Integer i = 0;
        while(numeroDigitado != numeroAleatorio){
            System.out.println("Errou!");
            System.out.println("\nDigite outro:");
            numeroDigitado = leitor.nextInt();
            i++;
            }
        if (i <= 3){
            System.out.println("Você é MUITO sortudo");
        } if (i >= 4 && i <= 10){
            System.out.println("Você é sortudo");
        } else if (i > 10){
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}
