package com.mycompany.lista.tres;

/**
 *
 * @author gabri
 */
public class DescontoProgressivo {
    
    Double desconto(Double valor, Integer unidade){
        
        Double desc = 0.00;
        
        if(unidade == 1){
            desc = valor * 0.9;
        } else if (unidade == 2) {
            desc = valor * 0.8;
        } else if (unidade >= 3){
            desc = valor * 0.7;
        }
        
        return desc;
        
    }
    
    void exibirNota(Double valor, Integer unidade){
        
        System.out.println("-------------------------");
        String frase = String.format("Valor do produto: R$%.2f", valor);
        System.out.println(frase);
        System.out.println("Quantidade: " + unidade);
        System.out.println("-------------------------");
        String frase2 = String.format("Valor com desconto: R$%.2f", desconto(valor,unidade));
        System.out.println(frase2);
    
    }
    
}
