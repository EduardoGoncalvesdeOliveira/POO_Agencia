package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {

    Scanner scanner = new Scanner(System.in);
    public String nome;
    public long cpf, rg, telefone;

    public void cadastrarCliente() {

        System.out.println("---------- Cadastro Cliente ----------");
        System.out.println("Informe seu NOME");
        nome = scanner.nextLine();
        System.out.println("Informe seu CPF");
        cpf = scanner.nextLong();
        System.out.println("Informe seu RG");
        rg = scanner.nextLong();
        System.out.println("Informe seu TELEFONE");
        telefone = scanner.nextLong();
        scanner.nextLine();
        System.out.println("----------------------------------------");
    }
}
