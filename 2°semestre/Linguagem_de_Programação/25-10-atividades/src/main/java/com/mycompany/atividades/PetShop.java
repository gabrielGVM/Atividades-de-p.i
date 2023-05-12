package com.mycompany.atividades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class PetShop {
    private String nome;
    private Double faturamento;
    private List<Pet> pets;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamento = 0.0;
        this.pets = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void darBanho(Pet pet, Double valor){
        
    }
    
    public void darBanho(Pet pet, Double valor, Double valorDesconto){
        
    }

        @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PetShop{");
        sb.append("nome=").append(nome);
        sb.append(", faturamento=").append(faturamento);
        sb.append(", pets=").append(pets);
        sb.append('}');
        return sb.toString();
    }
}
