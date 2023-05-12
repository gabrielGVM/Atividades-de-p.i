
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor unitário do produto?");
        Double preco = leitor.nextDouble();
        System.out.println("Quantidade vendida?");
        Integer qtd = leitor.nextInt();
        System.out.println("Qual o valor pago?");
        Double pago = leitor.nextDouble();  
        Double total = preco * qtd ;
        Double troco = pago - total;
        System.out.println("O valor a ser devolvido será de: R$:" + troco);
    }
   
}
