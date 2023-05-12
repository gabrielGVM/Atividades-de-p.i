package com.mycompany.lista.de.exercicios.quatro;

/**
 *
 * @author gabri
 */
public class TestandoTermometro {
    public static void main(String[] args) {
        Termometro termometro01  = new Termometro();
        
        termometro01.temperaturaAtual = 45.46;
        termometro01.temperaturaMax = 50.0;
        termometro01.temperaturaMin = 20.0;
        
        System.out.println("Aumentando temperatura 01 ");
        termometro01.aumentandoTemperatura(66.50);
        
        System.out.println("Baixando temperatura 01");
        termometro01.diminuiTemperatura(15.05);
    }
}
