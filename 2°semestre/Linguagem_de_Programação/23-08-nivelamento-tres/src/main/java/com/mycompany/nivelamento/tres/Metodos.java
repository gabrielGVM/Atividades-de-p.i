package com.mycompany.nivelamento.tres;

/**
 *
 * @author gabri
 */
public class Metodos {
    public static void main(String[] args) {
        
        //nosso proprio objeto
        
        //estamos instanciando (ccriar um objeto a partir do objeit) a
        //classe utilitaria
        //invocando um metodo (chamando)
        Utilitaria util = new Utilitaria();
        util.exibirLinha();
        
        //a variavel não precisa ter o mesmo nome que o argumento, mas 
        //precisa ser do mesmo tipo
        String nome = "Valentim";
        util.exibirNome("Gabriel");
        util.exibirNome(nome);
        
        System.out.println("exibindo nome decorado");
        util.exibirNomeDecorado("timtim");
        
        System.out.println("Calculadora");
        
        Calculadora calc = new Calculadora();
        Double soma = calc.somar();
        System.out.println(soma);
        
        
        Double soma1 = calc.somar(10.0, 20.0);
        System.out.println("Retorno sobrecarregado = " + soma1);
        
        if(calc.isNumeropar(16.0)){
            System.out.println("É PAR");
        } else {
            System.out.println("NÃO É PAR");
        }
    }
}
