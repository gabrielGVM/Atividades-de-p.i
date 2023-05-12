package com.mycompany.nivelamento.tres;

/**
 *
 * @author gabri
 */
public class Utilitaria {
    
    //assinatura do metodo que vai ter o retorno void, ou seja nada
    //Nome exibir linha
    //argumentos () 
    //o que tem dentro das {} é o corpo do metodo
    
    void exibirLinha() {
            System.out.println("sfdfsf");
    }
    
    //metodo que recebe argumento
    
    void exibirNome(String nome){
        System.out.println(String.format ("Nome: %s", nome));
    }
    
    void exibirNomeDecorado(String nome){
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
    }
    
}
