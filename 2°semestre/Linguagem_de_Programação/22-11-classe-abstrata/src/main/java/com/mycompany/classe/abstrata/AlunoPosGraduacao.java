package com.mycompany.classe.abstrata;

/**
 *
 * @author gabri
 */
public class AlunoPosGraduacao extends Aluno {
    private Double notaArtigo;
    private Double notaProjeto;

    public AlunoPosGraduacao(Double notaArtigo, Double notaProjeto, String nome, String ra) {
        super(nome, ra);
        this.notaArtigo = notaArtigo;
        this.notaProjeto = notaProjeto;
    }

    @Override
    public Double calcularMedia() {
        return (notaArtigo + notaProjeto) / 2;
    }
    
    

    public Double getNotaArtigo() {
        return notaArtigo;
    }

    public void setNotaArtigo(Double notaArtigo) {
        this.notaArtigo = notaArtigo;
    }

    public Double getNotaProjeto() {
        return notaProjeto;
    }

    public void setNotaProjeto(Double notaProjeto) {
        this.notaProjeto = notaProjeto;
    }
    
    
}
