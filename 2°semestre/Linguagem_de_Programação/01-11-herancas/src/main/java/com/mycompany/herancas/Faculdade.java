package com.mycompany.herancas;

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

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void excluir(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa().equals(ra)) {
                alunos.remove(i);
            }
        }
    }

    public void exibirAlunos (){
        System.out.println("Exibindo todos os alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
    
    public void exibirAlunosGraduacao(){
        System.out.println("Apenas alunos de graduação:");
        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoGraduacao) {
                System.out.println(aluno);
            }
        }
    }
}
