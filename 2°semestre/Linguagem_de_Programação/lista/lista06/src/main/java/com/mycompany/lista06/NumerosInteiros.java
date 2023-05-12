package com.mycompany.lista06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosInteiros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        NumerosInteiros num = new NumerosInteiros();

        System.out.println("Digite um número inteiro:");
        Integer numUsuario = leitor.nextInt();

        List<Integer> numInteiros = new ArrayList();
        numInteiros.add(numUsuario);

        while (numUsuario != 0) {
            System.out.println("Digite um número inteiro:");
            numUsuario = leitor.nextInt();

            numInteiros.add(numUsuario);

        }
        Integer soma = 0;
        Integer menor = 10000;
        Integer maior = 0;

        for (int i = 0; i < numInteiros.size() - 1; i++) {

            if (numInteiros.get(i) % 2 == 0) {
                System.out.println(numInteiros.get(i) + " é par");

            } else if (numInteiros.get(i) % 2 == 1) {
                System.out.println(numInteiros.get(i) + " é ímpar");

            }

            soma += numInteiros.get(i);
            if (numInteiros.get(i) < menor) {
                menor = numInteiros.get(i);

            }
            if (numInteiros.get(i) > maior) {
                maior = numInteiros.get(i);
            }

        }

        System.out.println("Soma de todos os números: " + soma);
        System.out.println("Menor número da lista: " + menor);
        System.out.println("Maior número da lista: " + maior);

    }

}
