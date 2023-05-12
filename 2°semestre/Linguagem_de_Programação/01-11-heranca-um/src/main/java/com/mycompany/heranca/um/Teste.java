package com.mycompany.heranca.um;

/**
 *
 * @author gabri
 */
public class Teste {
    public static void main(String[] args) {
        VendedorComissao vendedor01 = new VendedorComissao(123, "João", 150.5, 20.5);
        VendedorComissaoMaisFixo vendedor02 = new VendedorComissaoMaisFixo(321, "Abraão", 150.5, 20.5, 5000.5);
        
        System.out.println(vendedor01);
        System.out.println(vendedor02);
        
        
    }
}
