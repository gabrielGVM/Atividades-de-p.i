package com.mycompany.lista.de.exercicios02;

public class Potencia {
    public static void main(String[] args)
    {
        int numeroBase = 5;
        int numeroExpoente = 2;
        int resultado = 1;
  
        for (numeroExpoente = 2; numeroExpoente != 0; numeroExpoente--) {
            resultado = resultado * numeroBase;
        }
        System.out.println("O resultado é =  " + resultado);
    }
}
