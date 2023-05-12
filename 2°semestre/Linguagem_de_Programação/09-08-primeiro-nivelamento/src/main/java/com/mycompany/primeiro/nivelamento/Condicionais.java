package com.mycompany.primeiro.nivelamento;

/**
 *
 * @author gabri
 */
public class Condicionais {
    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 42;
        if (numero01 > numero02) {
            System.out.println(numero01 + " é maior que " + numero02 );
        } else if(numero01 < numero02) {
            System.out.println(numero01 + " é menor que " + numero02 );
        } else{
            System.out.println(numero01 + " é igual que " + numero02 );
        }
        
//      Boolean bloqueado = true;
//      
//        if (bloqueado) {
//            
//        } fazer assim garante que não tenha reduncancias nos booleans 

        String nome01 = "João";
        String nome02 = "Jorge";
        
//        .equals() para strings 
        if (nome01.equals(nome02)) {
            System.out.println("São iguais");
        } else  {
             System.out.println("São diferentes");
        }
    }
}

//sistemas de if continuam iguais= > maior/ < menor / || ou / == igual 
// >= maior igual / <= menor igual / && e / ! negação/ != diferente

//.equals é sensitive case, porém tem .equalsIgnoreCase();
