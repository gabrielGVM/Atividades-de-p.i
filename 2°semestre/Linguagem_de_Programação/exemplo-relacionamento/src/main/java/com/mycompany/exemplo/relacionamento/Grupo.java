package com.mycompany.exemplo.relacionamento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList();
    }
    
    public void adiciona (Contato c){
        contatos.add(c);
          System.out.println("Adicionei o contato " + c.getNome());
    }
    
        public void remove (Contato c){
        contatos.remove(c);
            System.out.println("Removi o contato " + c.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }    

    @Override
    public String toString() {
        return String.format("\nNome do grupo: %s\n Lista de contatos: %s", nome, contatos);
    }
    
    
}
