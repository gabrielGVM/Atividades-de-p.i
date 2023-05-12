package com.mycompany.lista06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteFruta {

    public static void main(String[] args) {

        List<String> fruta = new ArrayList();
        fruta.add("morango");
        fruta.add("manga");
        fruta.add("uva");
        fruta.add("banana");
        fruta.add("laranja");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma fruta");
        String frutaUser = leitor.nextLine();

        Boolean isFruta = false;

        for (int i = 0; i < fruta.size(); i++) {

            if (fruta.get(i).equals(frutaUser.toLowerCase())) {
                isFruta = true;

            }

        }
        if (isFruta) {
            System.out.println("A fruta " + frutaUser + " existe na lista.");

        } else {
            System.out.println("A fruta " + frutaUser + " não existe na lista.");

        }

    }

}
