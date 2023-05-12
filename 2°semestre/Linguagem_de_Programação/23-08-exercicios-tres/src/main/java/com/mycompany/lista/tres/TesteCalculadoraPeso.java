package com.mycompany.lista.tres;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TesteCalculadoraPeso {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu sexo (M ou F): ");
        String sexo = leitor.nextLine();
        
        System.out.println("Digite sua altura: ");
        Double altura = leitor.nextDouble();
        
        CalculadoraPeso peso = new CalculadoraPeso();
        
        peso.calculaPesoIdeal(sexo,altura);
    }
    
}
