package com.mycompany.lista.sete;

/**
 *
 * @author gabri
 */
public class Medicamento {
    private Integer id;
    private String nomeMedicamento;
    private Double quantidadeEstoque;
    private Double valorVenda;

    public Medicamento(Integer id, String nomeMedicamento, Double quantidadeEstoque, Double valorVenda) {
        this.id = id;
        this.nomeMedicamento = nomeMedicamento;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorVenda = valorVenda;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    public Double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "id=" + id + ", nomeMedicamento=" 
                + nomeMedicamento + ", quantidadeEstoque=" 
                + quantidadeEstoque + ", valorVenda="
                + valorVenda + '}';
    }
    
    
}
