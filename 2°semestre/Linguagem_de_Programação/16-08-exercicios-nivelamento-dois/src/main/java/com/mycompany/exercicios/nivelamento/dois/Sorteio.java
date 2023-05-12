package com.mycompany.lista.de.exercicios02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Boolean validar = false;
        Integer numerosPares = 0;
        Integer numerosImpares = 0;
        
        System.out.println("Insira um número entre 1 e 100: ");
        Integer numeroDigitado = leitor.nextInt();
        
         while (!validar){
                Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 100);
         if(numeroAleatorio % 2 == 0) {
                numerosPares++;
         }else{
                numerosImpares++;
         }
           System.out.println(numeroAleatorio);
           if(numeroDigitado == numeroAleatorio){
               System.out.println("Parabéns, você ganhou!");
               validar = true;
               break;
         }
}

                System.out.println("Quantidade de números pares que foram sortidos: " + numerosPares);
                System.out.println("Quantidade de números ímpares que foram sortidos: " + numerosImpares);
         }
}