package com.mycompany.nivelamento.dois;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author gabri
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        //        Math.random();;
        // Random random = new Random();
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 101);
        //Double numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 101);
        
        System.out.println(numeroAleatorio);

    }
}
