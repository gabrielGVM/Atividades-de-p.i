
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class BolsaFilho {
    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos filhos de 0 a 3 anos você possui?");
        Integer primeiro = leitor.nextInt();
        System.out.println("Quantos filhos de 4 a 16 anos você possui?");
        Integer segundo = leitor.nextInt();
        System.out.println("Quantos filhos de 17 a 18 anos você possui?");
        Integer terceiro = leitor.nextInt();
        
        Double pequeno = primeiro * 25.12;
        Double medio = segundo * 15.88;
        Double grande = terceiro * 14.44;
        Integer total = primeiro + segundo + terceiro;
        Double dinheiro = pequeno + medio + grande;
        
        System.out.println("Você tem um total de: " + total + " filho(s) "
                + "e vai receber "
                + "RS:" + dinheiro );
        
    }
}
