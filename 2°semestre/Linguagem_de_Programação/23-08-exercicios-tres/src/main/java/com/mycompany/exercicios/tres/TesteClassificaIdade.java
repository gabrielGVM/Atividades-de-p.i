package com.mycompany.lista.tres;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TesteClassificaIdade {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        ClassificaIdade clasIdade = new ClassificaIdade();
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        
        
        clasIdade.faixa(idade);
        
    }
    
}
