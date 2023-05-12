package com.mycompany.lista.de.exercicios.quatro;

/**
 *
 * @author gabri
 */
public class Termometro {
    Double temperaturaAtual; 
    Double temperaturaMax;
    Double temperaturaMin;
//    Double fahreinheit =   (temperaturaAtual * 1.8) + 32;
    
    void aumentandoTemperatura(Double valor){
        if(valor > temperaturaMax){
           temperaturaAtual = valor;
            System.out.println("A atual temperatura é:" + valor);
        } else {
            System.out.println("Temperatura atual é de: " + temperaturaAtual);
        }
    }
    
    void diminuiTemperatura(Double valor){
        if(valor < temperaturaMin){
            temperaturaAtual -= valor;
            System.out.println("Temperatura mínima é de " + valor);
        } else {
            System.out.println("Temperatura atual é de: " + valor);
        }
    }
    
//    não consegui fazer para fahreinheit!!!!!!
//    void exibeFahreinheit(){
//    } 
    
}
