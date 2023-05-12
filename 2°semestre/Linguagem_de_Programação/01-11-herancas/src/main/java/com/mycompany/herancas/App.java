package com.mycompany.herancas;

/**
 *
 * @author gabri
 */
public class App {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("1234", "William", 6.8, 8.9);
        AlunoGraduacao graduado = new AlunoGraduacao("14321", "William", 6.8, 8.9, 10.0, 5.5);
        
        System.out.println(aluno);
        System.out.println(graduado);
        System.out.println(String.format ("A media do %s é de: %.1f", 
        aluno.getNome(), aluno.calcularMedia()));
        System.out.println(String.format ("A media do %s é de: %.1f", 
        graduado.getNome(), aluno.calcularMedia()));
        
        
        Faculdade f01 = new Faculdade("SPTECH");
        f01.matricular(aluno);
        f01.matricular(graduado);
        f01.exibirAlunos();
        f01.exibirAlunosGraduacao();
        
    }
   
}
