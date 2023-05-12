package com.sptech.encapsulamento;

/**
 *
 * @author miniguiti
 */
public class ContaBancaria {
    // Private: nenhuma outra classe acessa mais esses atributos
    // Assim eles estão protegidos, e só são alterados através de métodos
    private Double saldo = 0.0; // Começa com 0 para não deixar nulo
    private String nomeTitular;
    
    void depositar(Double valorDeposito){
        if(valorDeposito > 0){
            saldo += valorDeposito;            
        }
    }
         
    void sacar(Double valorSaque){
        if(valorSaque <= 0){
            System.out.println("Valor inválido!");            
        }else{
            saldo -= valorSaque;
        }  
    }
    
    // Get & Set para acessar os atributos já que são private
    // Não precisa do setSaldo, já que o depositar e sacar já altera o saldo
    // aplicando as regras necessárias
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
