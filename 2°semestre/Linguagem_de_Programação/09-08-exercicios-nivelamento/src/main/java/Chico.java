
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Chico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos minutos, redondos, você passou se "
                + "aquecendo?");
        Integer aquecer = leitor.nextInt();
        System.out.println("Quantos minutos você fez exercícios aeróbicos?");
        Integer aero = leitor.nextInt();
        System.out.println("Quantos minutos você fez exercícios de "
                + "musculação?");
        Integer musculo = leitor.nextInt();
        
        Integer peso01 = aquecer * 12;
        Integer peso02 = aero * 20;
        Integer peso03 = musculo * 25;
        Integer peso04 = peso01 + peso02 + peso03;
        
        Integer tempo = aquecer + aero + musculo;
        
        System.out.println("Olá, Jorge. Você fez um total de " + tempo 
                + " minutos de exercícios e perdeu cerca de " + peso04 + 
                " calorias ");
    }
}
