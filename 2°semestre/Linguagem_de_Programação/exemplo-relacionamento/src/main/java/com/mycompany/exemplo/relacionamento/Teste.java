package com.mycompany.exemplo.relacionamento;

/**
 *
 * @author gabri
 */
public class Teste {
    public static void main(String[] args) {
        Contato c1 = new Contato("Giuliana", "(11) 123456789");
        Contato c2 = new Contato("William", "(11) 987654325");
        Contato c3 = new Contato("Gabriel", "(11) 147852696");
        Contato c4 = new Contato("Larissa", "(11) 256987441");
        
        Grupo g1 = new Grupo("Trabalho");
        Grupo g2 = new Grupo("Amigos");
        
        g1.adiciona(c1);
        g1.adiciona(c2);
        g2.adiciona(c1);
        g2.adiciona(c3);
        g2.adiciona(c4);
        
        System.out.println(g1);
        System.out.println(g2);
    }
}
