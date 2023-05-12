package com.mycompany.lista.tres;

/**
 *
 * @author gabri
 */
public class ClassesSociais {
    
    Double quantidadeSalario(Double salario){
    
        return salario / 1100;
        
        
    }
    
    void classeSocial(Double salario){
        
        
     
        if(salario <= 2090.00){
            System.out.println("Você pertence a classe social: E.");
        } else if(salario >= 2090.01 && salario <= 4180.00){
             System.out.println("Você pertence a classe social: D.");
        } else if(salario >= 4180.01 && salario <= 10450.00){
             System.out.println("Você pertence a classe social: C.");
        } else if(salario >= 10450.01 && salario <= 20900.00){
             System.out.println("Você pertence a classe social: B.");
        } else if(salario >= 20900.01){
            System.out.println("Você pertence a classe social: A.");
        }
        
        
    
    }
    
}
