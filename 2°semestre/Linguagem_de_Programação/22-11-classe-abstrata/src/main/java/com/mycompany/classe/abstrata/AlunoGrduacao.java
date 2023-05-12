package com.mycompany.classe.abstrata;

/**
 *
 * @author gabri
 */
public class AlunoGrduacao extends Aluno {
    private Double notaIntegrada;
    private Double notaContinuadas;

    public AlunoGrduacao(Double notaIntegrada, Double notaContinuadas, String nome, String ra) {
        super(nome, ra);
        this.notaIntegrada = notaIntegrada;
        this.notaContinuadas = notaContinuadas;
    }

    @Override
    public Double calcularMedia() {
       return (notaContinuadas * 0.4) + (notaIntegrada * 0.6); 
    }
    
    

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }

    public Double getNotaContinuadas() {
        return notaContinuadas;
    }

    public void setNotaContinuadas(Double notaContinuadas) {
        this.notaContinuadas = notaContinuadas;
    }
    
    
}
