package com.mycompany.lista.de.exercicios02;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Se você prefere pizza de mussarela digite 5, se prefere pizza de calabresa digite 25"
                + " e se prefere de quatro queijos digite 50: ");
        Integer numeroDigitado = leitor.nextInt();
       
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;
        
        for (int i = 0; i <= 10; i++){
            if (numeroDigitado == 5){
                mussarela ++;
                numeroDigitado = leitor.nextInt();
            }if (numeroDigitado == 25){
                calabresa ++;
                numeroDigitado = leitor.nextInt();
            }if (numeroDigitado == 50){
                quatroQueijos ++;
                numeroDigitado = leitor.nextInt();
            } 
        }
        System.out.println("Esses são os votos em mussarela: " + mussarela);
        System.out.println("Esses são os votos em calabresa: " + calabresa);
        System.out.println("Esses são os votos em quatro queijos: " + quatroQueijos);
        
        if(mussarela > (calabresa & quatroQueijos)){
            System.out.println("A pizza mais votada foi a de mussarela");
        }else if(calabresa > (mussarela & quatroQueijos)){
            System.out.println("A pizza mais votada foi a de calabresa");
        }else if(quatroQueijos > (mussarela & calabresa)){
            System.out.println("A pizza mais votada foi a de quatro queijos");
        }
    }
}
