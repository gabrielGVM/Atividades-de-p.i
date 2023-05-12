package com.mycompany.agregacao.carrinho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Carrinho {

    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Integer getQuantidade() {
        return produtos.size();
    }

    public void adicionar(Produto p) {
        if (p != null) {
            produtos.add(p);
        }
    }

    public Boolean existePorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoDaVez = produtos.get(i);
            if (produtos.get(i).getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public Integer getQuantidadePorCategorias(String nomeCategoria){
        Integer quantidadeEncontrada = 0;
        for (Produto produtoDaVez : produtos) {
            if (produtoDaVez.getCategoria().equals(nomeCategoria)) {
                quantidadeEncontrada ++;
            }
        }
        return quantidadeEncontrada;
    }
    
    public void limpar(){
        produtos.clear();    //primeira maneira      
        produtos.removeAll(produtos); //segunda maneira
        produtos = new ArrayList(); //terceira maneira
    }
    
    public Produto getPorNome(String nome){
        for (Produto produtoDaVez : produtos) {
            if (produtoDaVez.getNome().equals(nome)) {
                return produtoDaVez;
            }
        }
        return null;
    }
    
    public Double getValorTotal(){
        Double valorTotal = 0.0;
        for (Produto produto : produtos) {
            valorTotal += valorTotal + produto.getPreco();
        }
        return valorTotal;
    }
}
