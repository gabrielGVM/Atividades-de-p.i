package com.mycompany.encapsulamento;

/**
 *
 * @author gabri
 */
public class ContaBancaria {
    private Double saldo = 0.0;
    private String nomeTitular = " ";
    
    void depositar(Double valorDeposito){
        saldo +=  valorDeposito;
    }
    
    void sacar(Double  valorSaque){
        saldo -= valorSaque;
    }
    
    Double pegarSaldo(){
        return saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
