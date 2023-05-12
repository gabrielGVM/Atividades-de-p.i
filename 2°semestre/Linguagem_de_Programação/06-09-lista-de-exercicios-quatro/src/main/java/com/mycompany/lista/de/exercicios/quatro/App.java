package com.mycompany.lista.de.exercicios.quatro;

/**
 *
 * @author gabri
 */
public class App {
    public static void main(String[] args) {
        
//        Instanciar
        
        Bolo bolo01 = new Bolo();
        Bolo bolo02 = new Bolo();
        Bolo bolo03 = new Bolo();
        
        bolo01.sabor = "morango";
        bolo01.valor = 45.00;
        bolo01.quantidadeVendida = 0;
        
        bolo02.sabor = "chocolate";
        bolo02.valor = 35.00;
        bolo02.quantidadeVendida = 0;
        
        bolo03.sabor = "abacaxi";
        bolo03.valor = 50.00;
        bolo03.quantidadeVendida = 0;
        
        System.out.println("Bolo 01");
        bolo01.comprarBolo(40);
        
    }
}
