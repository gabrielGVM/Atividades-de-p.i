
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Elevador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o limite de peso do elevador?");
        Integer peso = leitor.nextInt();
        System.out.println("Qual o limite de pessoas?");
        Integer pessoas = leitor.nextInt();
        System.out.println("Qual o peso da primeira pessoa?");
        Integer peso01 = leitor.nextInt();
        System.out.println("Qual o peso da segunda pessoa?");
        Integer peso02 = leitor.nextInt();
        System.out.println("Qual o peso da terceira pessoa?");
        Integer peso03 = leitor.nextInt();
        Integer soma = peso01+ peso02 + peso03;
        System.out.println("Entraram 3 pessoas no elevador, no qual "
                + "cabem " + pessoas + ".\nO peso total no elevador é de "
                + soma + " sendo que ele suporta " + peso + ".");
    }
}
