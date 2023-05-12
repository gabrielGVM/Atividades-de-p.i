package com.mycompany.introducao.poo;

/**
 *
 * @author gabri
 */
public class TesteBilheteUnico {
    public static void main(String[] args) {
    //    criando objetos do tipo bilhete unico, ou seja instancianodo
        BilheteUnico bilhete01 = new BilheteUnico();
        BilheteUnico bilhete02 = new BilheteUnico();
        
        bilhete01.isEstudante = true;
        bilhete01.nomeTitular = "Magal";
        bilhete01.saldo = 1050.10;
        
        bilhete02.isEstudante = false;
        bilhete02.nomeTitular = "Brandão";
        bilhete02.saldo =  1.00;
        
        System.out.println("Usando Bilhete01");
        bilhete01.usar();
        
        System.out.println("Usando bilhete02");
        bilhete02.usar();
        
        
        System.out.println("Carregando bilhete01");
        bilhete01.carregar(10.50);
        System.out.println("Carregando bilhete02");
        bilhete02.carregar(50.00);
        
        System.out.println(bilhete01);
        System.out.println(bilhete02);

    }
}
