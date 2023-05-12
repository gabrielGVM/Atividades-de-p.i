package com.mycompany.lista.tres;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TesteCalcularMedia {
    
    public static void main(String[] args) {
        
        CalcularMedia media = new CalcularMedia();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite as notas: ");
        Double nota1 = leitor.nextDouble();
        Double nota2 = leitor.nextDouble();
        
        Double resultado = media.realizarMedia(nota1, nota2);
        
        System.out.println("Sua média foi: " + resultado);
        
        
    }
    
}
