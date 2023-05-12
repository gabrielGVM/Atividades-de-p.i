package com.mycompany.lista.tres;

/**
 *
 * @author gabri
 */
public class CalculadoraPeso {
    
    void calculaPesoIdeal(String sexo, Double altura){
    
       Double resultado = 0.00; 
        
        if (sexo.equals("M")){
            resultado = (72.7 * altura) - 58;
        } else if (sexo.equals("F")){
            resultado = (62.1 * altura) - 44.7;
        }
        
        System.out.println("O seu peso ideal é: " + resultado);
    
    }
    
    
    
    
}
