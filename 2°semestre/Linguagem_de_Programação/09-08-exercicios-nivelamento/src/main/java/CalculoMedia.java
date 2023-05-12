
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class CalculoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();
        System.out.println("Digite sua primeira nota:");
        Integer nota01 = leitor.nextInt();
        System.out.println("Digite sua segunda nota:");
        Integer nota02 = leitor.nextInt();
        Integer soma = nota01 + nota02;
        Integer media = soma / 2;
        System.out.println("Olá, " + nome + " sua média foi de: " + media);
    }
}
