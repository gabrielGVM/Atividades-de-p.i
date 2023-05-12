package com.mycompany.lista.sete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Teste {

    public static void main(String[] args) {
        List<Medicamento> medicamentos = new ArrayList();
       Scanner leitor = new Scanner(System.in);
       Scanner leitorNext = new Scanner(System.in);

        Integer numeroDigitado;
        do{
            System.out.println("Opção 1 - Cadastrar Medicamento \n" + 
                                              "Opção 2 - Exibir Medicamentos \n" + 
                                              "Opção 3 - Buscar Medicamento por nome \n" + 
                                              "Opcão 4 - SAIR");
            numeroDigitado = leitor.nextInt();
            
            switch (numeroDigitado) {
                case 1:
                    System.out.println("Digite o identificador:");
                    Integer idDigitado = leitor.nextInt();
                    
                    System.out.println("Digite o nome:");
                    String nomeDigitado = leitor.nextLine();
                    String next = leitorNext.nextLine();
                    
                    System.out.println("Digite a quantidade em estoque:");
                    Integer qtdEstoque = leitor.nextInt();
                    
                    System.out.println("Digite o valor:");
                    Double valor = leitor.nextDouble();
                    
                Medicamento medicamentoCadastrado = new Medicamento(idDigitado, nomeDigitado, valor, valor);

                case 2:
                    for (int i = 0; i < medicamentos.size(); i++) {
                        
                    }
                
            }
        } while(numeroDigitado != 4) ;
    }
}
