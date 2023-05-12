package com.mycompany.lista.de.exercicios02;

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        Integer numeroDigitado = 100;
        while (numeroDigitado != 0){
            System.out.println("Coloque um número: ");
            numeroDigitado = leitor.nextInt();
            soma += numeroDigitado;
        } 
            System.out.println(soma);
        
    }
}
