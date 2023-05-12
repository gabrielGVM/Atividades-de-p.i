package com.mycompany.classe.abstrata;

/**
 *
 * @author gabri
 */
public class Teste {
    public static void main(String[] args) {
        AlunoGrduacao a1 = new AlunoGrduacao(10.0, 5.0, "Bob", "123");
        AlunoGrduacao a2 = new AlunoGrduacao(5.0, 10.0, "Bob 2", "321");
        
        System.out.println(a1.calcularMedia());
        System.out.println(a2.calcularMedia());
    }
}
