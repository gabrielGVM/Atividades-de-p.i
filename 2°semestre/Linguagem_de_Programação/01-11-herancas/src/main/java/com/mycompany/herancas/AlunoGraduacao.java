package com.mycompany.herancas;

/**
 *
 * @author gabri
 */
public class AlunoGraduacao extends Aluno {
    private Double notaIntegrada;
    private Double notaContinuada;

    public AlunoGraduacao(String ra, String nome, Double nota01, Double nota02, Double notaIntegrada,
    Double notaContinuada) {
        super(ra, nome, nota01, nota02);
        this.notaIntegrada = notaIntegrada;
        this.notaContinuada = notaContinuada;
    }

    @Override
    public Double calcularMedia() {
        return (nota01 + super.getNota02() + this.notaIntegrada + this.notaContinuada) / 4; 
    }  

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    @Override
    public String toString() {
        return String.format("RA: %s\n Nome: %s\n Nota01: %.1f\n Nota02: %.1f\n Integrada: %.1f \nContinuada: %.1f\n",
        this.getRa(), this.getNome(), this.nota01,
        this.nota02, this.notaIntegrada, this.notaContinuada);
    }
    
    
}
