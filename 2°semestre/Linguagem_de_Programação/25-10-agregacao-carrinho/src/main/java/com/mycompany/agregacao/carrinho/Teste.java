package com.mycompany.agregacao.carrinho;

/**
 *
 * @author gabri
 */
public class Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto("pão", "Padaria", 1.50);
        Carrinho c1 = new Carrinho("Gabriel");
      
        Produto produtoProcurado = c1.getPorNome("Tomate");
        
        if (produtoProcurado == null) {
            System.out.println("Não achei");
        }else{
            System.out.println("Achei");
        }
    }
}
