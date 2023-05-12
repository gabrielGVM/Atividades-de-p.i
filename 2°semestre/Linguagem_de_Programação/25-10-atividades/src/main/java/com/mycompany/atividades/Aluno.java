package com.mycompany.atividades;

/**
 *
 * @author gabri
 */
public class Aluno {
    private String ra;
    private String nome;
    private Integer semestre;
    private Boolean ativo;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
        this.semestre = 1;
        this.ativo = true;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return String.format("\nRA: $s \nNome: $s \nSemestre: $d  \nAtivo $b", ra, nome, semestre, ativo);
    }
    
    
    
}
