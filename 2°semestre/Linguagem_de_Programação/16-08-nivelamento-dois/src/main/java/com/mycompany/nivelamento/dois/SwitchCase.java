package com.mycompany.nivelamento.dois;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um dia da semana:");
        Integer dia = leitor.nextInt();
       
        switch(dia){
            case 1: 
                System.out.println("Segundou!!");
                break;
            case 2:
                System.out.println("Terçou!!!");
                break;
            case 3: 
                System.out.println("Quartou!!!!");
                break;
            case 4:
                System.out.println("Quintou!!!");
                break;
            case 5:
                System.out.println("Sextouu!!!");
                break;
            default: 
                System.out.println("numero invalido");
                break;
        }
    }
}
