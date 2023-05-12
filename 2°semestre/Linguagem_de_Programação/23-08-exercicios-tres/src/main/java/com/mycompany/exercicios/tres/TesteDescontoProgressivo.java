package com.mycompany.lista.tres;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TesteDescontoProgressivo {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao sistema de desconto progressivo!");
        
        System.out.println("Digite o valor unitário do produto: ");
        Double valor = leitor.nextDouble();
        
        System.out.println("Digite a quantidade: ");
        Integer quantidade = leitor.nextInt();
        
        DescontoProgressivo desconto = new DescontoProgressivo();
        
        //desconto.desconto(valor,quantidade);
        
        desconto.exibirNota(valor,quantidade);
        
    }
    
}
