package com.mycompany.banco.de.dados;

/**
 *
 * @author gabri
 */
public class Filme {
    private Integer id;
    private String nome;
    private Integer anoLancamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLançamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return  String.format("Filme: \nid: %d\n nome "
                + "%s\n anoLancamento: %d",
                id, nome, anoLancamento);
    }
}
