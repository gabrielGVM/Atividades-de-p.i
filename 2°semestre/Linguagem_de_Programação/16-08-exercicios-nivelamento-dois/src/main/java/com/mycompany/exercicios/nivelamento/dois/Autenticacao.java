package com.mycompany.lista.de.exercicios02;

import java.util.Scanner;

public class Autenticacao {
    public static void main(String[] args) {
        
        System.out.println("Insira seu nome de usuário: ");
        Scanner leitor = new Scanner(System.in);
        String usuario = leitor.next();
        
        System.out.println("Insira sua senha: ");
        String senha = leitor.next();
        
        if (!usuario.equals("admin")){
            System.out.println("Login e/ou senha inválidos");
        } else if (!senha.equals("#Bandtec")){
            System.out.println("Login e/ou senha inválidos");
        } else if (usuario.equals("admin") && senha.equals("#Bandtec")){
            System.out.println("Login realizado com sucesso!");
        }
    }
}
