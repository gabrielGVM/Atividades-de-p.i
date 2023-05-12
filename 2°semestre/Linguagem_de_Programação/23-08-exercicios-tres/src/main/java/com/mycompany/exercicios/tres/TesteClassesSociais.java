package com.mycompany.lista.tres;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TesteClassesSociais {
    
    public static void main(String[] args) {
        
        ClassesSociais soc = new ClassesSociais();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua renda: ");
        Double renda = leitor.nextDouble();
        
        Double salMin = soc.quantidadeSalario(renda);
        
        String frase = String.format("Você recebe aproximadamente %.1f salário(s) mínimo(s) \n", salMin);
        
        System.out.println(frase);
        
        
        soc.classeSocial(renda);
        
        
    }
    
}
