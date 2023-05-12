
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();
        System.out.println("Olá, " + nome + ", digite seu ano de nascimento;");
        Integer ano = leitor.nextInt();
        Integer idade = 2030 - ano;
        System.out.println("Em 2030 você terá: " + idade);
    }
}
