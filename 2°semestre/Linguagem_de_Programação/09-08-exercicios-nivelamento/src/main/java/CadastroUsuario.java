
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Coloque seu Login: ");
        String nome = leitor.nextLine();

        System.out.println("Coloque sua senha: ");
        Integer senha = leitor.nextInt();

        System.out.println("Quantas vezes você pode errar?");
        Integer tentativa = leitor.nextInt();

        System.out.println("Seu login é " + nome + "," + " sua senha é "
                + senha
                + " e você tem " + tentativa + " tentativas restantes! ");
    }
}
