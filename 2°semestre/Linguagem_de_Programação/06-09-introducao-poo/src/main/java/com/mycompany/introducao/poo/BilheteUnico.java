package com.mycompany.introducao.poo;

/**
 *
 * @author gabri
 */
//a classe é um molde para a criação de um objeto
public class BilheteUnico {

    //atributus igual a caracteristas
    Double saldo;
    String nomeTitular;
    Boolean isEstudante;

    //Metodos = comportamentos
    void usar() {
        if (isEstudante) {
            if (saldo >= 2.20) {
                saldo -= 2.20;
                System.out.println(nomeTitular + " Você usou seu bilhete, Saldo: " + saldo);
            } else {
                if (saldo >= 4.40) {
                    saldo -= 4.40;     
                } else {
                                    System.out.println(" Você não tem saldo");
                }
            }
        }
    }

    void carregar(Double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Carregado,. Saldo: " + saldo);
        } else {
            System.out.println("Valor inválido");
        }
    }    
}
