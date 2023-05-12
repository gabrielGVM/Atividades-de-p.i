package com.mycompany.lista.de.exercicios.quatro;

/**
 *
 * @author gabri
 */
public class Empregado {
    String nome;
    String cargo;
    Double salario;
    
    void reajustarSalario(Double reajuste){
         reajuste = salario * 1.15 ; 
        System.out.println(nome + " seu salário teve reajuste de 15%, chegando assim a: " + reajuste + " seu cargo é de " + cargo);
    }
}
