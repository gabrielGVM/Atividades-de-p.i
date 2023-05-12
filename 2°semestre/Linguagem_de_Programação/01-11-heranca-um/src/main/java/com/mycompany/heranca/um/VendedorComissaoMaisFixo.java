package com.mycompany.heranca.um;

/**
 *
 * @author gabri
 */
public class VendedorComissaoMaisFixo extends VendedorComissao {
    private Double salarioFixo;

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double venda, Double taxa, Double salarioFixo) {
        super(codigo, nome, venda, taxa);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public Double calcularSalario() {
        return (this.salarioFixo + super.getTaxa()) * super.getVenda(); 
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }    

    @Override
    public String toString() {
        return String.format("Seu código é: %d\n Seu nome: %s\n Suas vendas: %.2f\n Suas Taxas: %.2f\n, "
                + "Salário Fixo: %.2f", 
                this.getCodigo(), this.getNome(), this.venda, this.taxa, this.salarioFixo); 
    }
    
    
}
