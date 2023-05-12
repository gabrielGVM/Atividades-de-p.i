package com.mycompany.lista.de.exercicios02;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
               
        System.out.println("Insira um número: ");
        Scanner leitor = new Scanner(System.in);
        Integer tabuada = leitor.nextInt();
        Integer x = 0;
        
    for(x = 0; x <= 10; x++) {
            System.out.println("Tabuada do " + tabuada);
            System.out.print(x + " x " + tabuada + " = ");
            System.out.println(x * tabuada);
        }
    }
}