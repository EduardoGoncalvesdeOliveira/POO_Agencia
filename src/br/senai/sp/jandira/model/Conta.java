package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Conta {

    Scanner scanner = new Scanner(System.in);

    public String decisao;
    private int numeroConta = 1234;

    private double saldo = 9652;

    private String agencia = "000-35-X";

    public void realizarDeposito(Double valor) {
        this.saldo += valor;
        System.out.println("O SALDO da conta é: " + saldo);
    }

    public void realizarSaque(Double valor) {

//        this.saldo -= valor;
        if (valor > this.saldo){

            System.out.println("Você não pode realizar essa ação: Saque maior que o possível! ");
            System.out.println("Deseja sacar tudo da conta? ");
            decisao = scanner.nextLine();

        }else if (decisao.equalsIgnoreCase("s")){
            this.saldo = 0;

        }else{

            System.out.println("O SALDO da conta é: " + saldo);
        }

    }

    public void consultarSaldo() {
        System.out.println("Seu SALDO é: " + this.saldo);
    }
}
