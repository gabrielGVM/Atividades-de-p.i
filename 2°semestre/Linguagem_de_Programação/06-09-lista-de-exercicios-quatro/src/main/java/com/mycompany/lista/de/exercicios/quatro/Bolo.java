package com.mycompany.lista.de.exercicios.quatro;

/**
 *
 * @author gabri
 */
public class Bolo {
    String sabor ;
    Double valor;
    Integer quantidadeVendida =0;
    
    void comprarBolo(Integer quantidadeDesejada){
        Integer validacao = quantidadeDesejada + quantidadeVendida;
        if(validacao > 100){
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo");
      }else{
            quantidadeVendida += quantidadeDesejada;
            System.out.println("Compra realizada");
        }
    }
    
    void exibirRelatorio(){
        System.out.println("O bolo sabor " + sabor + ", foi comprado " + quantidadeVendida + "vezes hoje, totalizando R$: " + 
                valor * quantidadeVendida);
    }
}
