package com.mycompany.nivelamento.dois;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Lacos {
    public static void main(String[] args) {
        System.out.println("for - 0 a 10");
        
        for(int i =0; i <= 10; i++){
            System.out.println(i);
        }
        
                for(int i =10; i >= 0; i--){
            System.out.println(i);
        }
                
         Scanner leitor = new Scanner(System.in);
         System.out.println("Advinhem o numero");
         Integer numeroDigitar = leitor.nextInt();
         
         while(numeroDigitar != 42){
             System.out.println("Errou!!");
             System.out.println("Digite outro:");
             numeroDigitar = leitor.nextInt();
         }
    }
}
