package com.mycompany.lista.de.exercicios.quatro;

/**
 *
 * @author gabri
 */
public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado01 = new Empregado();
        Empregado empregado02 = new Empregado();
        
        empregado01.nome = "João";
        empregado01.cargo = "Analista de Sistemas";
        empregado01.salario = 5.400;
        
        empregado02.nome = "Fernanda";
        empregado02.cargo = "Desenvolvedora";
        empregado02.salario = 4.000;
        
        empregado01.reajustarSalario(1.15);
        
        empregado02.reajustarSalario(1.15);
    }
}
