package com.mycompany.lista.de.exercicios02;

public class ContadorVariado {
    public static void main(String[] args) {
        
        Double numero = 0.15;
        
        for (int i = 0; i  <=  32; i++){
            String frase = String.format("%.2f", numero);
            System.out.println(frase);
            numero = numero + 0.15;
        }
    }
}
