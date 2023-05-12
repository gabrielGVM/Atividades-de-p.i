package com.mycompany.nivelamento.dois;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Interpolacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // no javascript era assim ${}
        // java é diferente
        
        String nome = "Gabriel Valentim";
        Integer idade = 19;
        Double altura = 1.755;
        
        //%s representa a string, %d representa inteiros, %.2f representa double
        
        System.out.println(String.format("Meu nome é %s, tenho %d de idade, e %.2f de altura"
                , nome
                , idade
                , altura));
    }
}
