package com.mycompany.heranca.um;

/**
 *
 * @author gabri
 */
public class VendedorComissao {
    private Integer codigo;
    private String nome;
    protected Double venda;
    protected Double taxa;

    public VendedorComissao(Integer codigo, String nome, Double venda, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.venda = venda;
        this.taxa = taxa;
    }
    
    public Double calcularSalario(){
        return (venda * taxa);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getVenda() {
        return venda;
    }

    public void setVenda(Double venda) {
        this.venda = venda;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return String.format("Seu código é: %d\n Seu nome: %s\n Suas vendas: %.2f\n Suas Taxas: %.2f\n", 
                this.codigo, this.nome, this.venda, this.taxa);
    }
    
    
}
