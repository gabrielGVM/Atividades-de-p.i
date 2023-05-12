package com.mycompany.atividades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void cancelarMatricula(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno alunoDaVez = alunos.get(i);
            if (alunoDaVez.getRa().equals(ra)) {
                alunoDaVez.setAtivo(false);
                System.out.println("\n\nCancelando matricula: "
                        + ra);
            }
        }
    }

    public void exibirAlunos() {
        System.out.println("\n\nExibindo todos os alunos: ");
        for (int i = 0; i < alunos.size(); i++) {
            Aluno alunoDaVez = alunos.get(i);
            System.out.println(alunoDaVez);
        }
    }

    public void exibirAlunosPorSemestre(Integer semestre) {
        System.out.println("\n\n Exibindo os alunos do "
                + semestre
                + "º semestre");
        for (int i = 0; i < alunos.size(); i++) {
            Aluno alunoDaVez = alunos.get(i);
            if (alunoDaVez.getSemestre() == semestre) {
                System.out.println(alunoDaVez);
            }
        }
    }
}
