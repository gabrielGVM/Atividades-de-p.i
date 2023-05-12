package com.mycompany.nivelamento.tres;

/**
 *
 * @author gabri
 */
public class Calculadora {
    //noa e void, tem retorno e é double
    //não esquecer do return!!!!!!!!!!!!!!!!!!!
    //se não falar os numeros, soma 10 em 10, mas pode passar tbm
    
    
    Double somar(){
        return 10.0 + 10.0;
    }
    //metodos sobrecarregados
    //mesmo metodo fazendo mais de uma coisa 
    Double somar(Double um, Double dois){
        return um + dois;
    }
    
    Boolean isNumeropar(Double numero){
        Boolean isPar = numero % 2 ==0;
        return isPar;
    }
}
