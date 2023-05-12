package com.mycompany.herancas;

/**
 *
 * @author gabri
 */
public class Aluno {
    private String ra;
    private String nome;
    protected Double nota01;
    protected Double nota02;

    public Aluno(String ra, String nome, Double nota01, Double nota02) {
        this.ra = ra;
        this.nome = nome;
        this.nota01 = nota01;
        this.nota02 = nota02;
    }
    
    public Double calcularMedia(){
        return (nota01 + nota02) / 2;
    }
    

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Double getNota01() {
        return nota01;
    }

    public void setNota01(Double nota01) {
        this.nota01 = nota01;
    }

    public Double getNota02() {
        return nota02;
    }

    public void setNota02(Double nota02) {
        this.nota02 = nota02;
    }

    @Override
    public String toString() {
        return String.format("RA: %s\n Nome: %s\n Nota01: %.1f\n Nota02: %.1f", this.ra, this.nome, this.nota01,
        this.nota02);
    }
}
