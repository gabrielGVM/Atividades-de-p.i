
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número real:");
        Double numero01 = leitor.nextDouble();
        System.out.println("Digite outro número real:");
        Double numero02 = leitor.nextDouble();      
        Double soma = numero01 + numero02;
        Double menos = numero01 - numero02;
        Double vezes = numero01 * numero02;
        Double divisao = numero01 / numero02;
        System.out.println("Soma dos dois primeiros:" + soma);
        System.out.println("Subtração dos dois primeiros:" + menos);
        System.out.println("Multiplicação dos dois primeiros:" + vezes);
        System.out.println("Divisão dos dois primeiros:" + divisao);
        
        
    }
    
}
