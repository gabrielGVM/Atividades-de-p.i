package com.mycompany.lista06;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miniguiti
 */
public class Teste {

    public static void main(String[] args) {
        // Métodos que mais usaremos:

        // add: adiciona na lista
        // size: retorna o tamanho da lista
        // get: retorna o valor de acordo com a posição/indice
        // remove: remove de acordo com objeto ou indice
        List listaEstranha = new ArrayList();

        listaEstranha.add("Giuliana");
        listaEstranha.add(42);
        listaEstranha.add(false);
        listaEstranha.add(42.10);

        // Não é uma boa prática criar uma lista que aceita qualquer tipo
        // Isso pode gerar vários problema na hora de trabalhar com os objetos
        System.out.println(listaEstranha);

        //Lista com tipo
        List<String> nomes = new ArrayList();
        nomes.add("Giuliana");
        nomes.add("William");
        nomes.add("Carlos");

        System.out.println(nomes);

        // Sobre o .equals com lista:
        //Errado: esse SEMPRE retorna false, estou comparando List<String> com String
        nomes.equals("Giuliana");

        //Certo: esse pode retornar true se o nome da posição 1 for Giuliana!
        nomes.get(1).equals("Giuliana");

        //Percorrendo listas
        for (int i = 0; i < nomes.size(); i++) {
            String nomeDaVez = nomes.get(i);

            //Se o nome da vez for Giuliana, remove da lista
            if (nomeDaVez.equals("Giuliana")) {
                System.out.println("Achei e removi!");
                nomes.remove(i);
            }

        }

        System.out.println("Nomes: " + nomes);

        // Também podemos criar lista de outros tipos
        List<Integer> numerosInteiros = new ArrayList();

        List<Animacao> animacoes = new ArrayList();

        Animacao animacao01 = new Animacao("Procurando Nemo", 2003, 2.30);
        Animacao animacao02 = new Animacao("Shrek", 2005, 2.10);

        animacoes.add(animacao01);
        animacoes.add(animacao02);
        animacoes.add(new Animacao("Pica Pau", 2000, 1.20));

        String nomeProcurar = "Shrek";

        Boolean existe = false;

        for (int i = 0; i < animacoes.size(); i++) {

            Animacao animacaoDaVez = animacoes.get(i);

            if (animacaoDaVez.getNome().equalsIgnoreCase(nomeProcurar)) {
                System.out.println(nomeProcurar + " existe na lista");
                existe = true;
            } else {
                System.out.println(existe ? " Achou" : "Não achou");
            }
        }

        //Outra maneira de fazer for (fore)
        for (Animacao animacaoDaVez : animacoes) {
            if (animacaoDaVez.getNome().equals(nomeProcurar)) {
                System.out.println("Achei no enhanced for");
            }
        }

        //Maneiras de remover itens
        //animacoes.remove(animacao01);
        animacoes.remove(2);

        
    }
}
