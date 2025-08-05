package com.desafios.desafio1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.println("================================");
        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("================================");

        System.out.println("Qual é o seu nome? ");
        var nome = scanner.next();
        conta.setNome(nome);
        System.out.println("Qual é o seu número da conta? ");
        var numeroConta = scanner.nextInt();
        conta.setNumuroDaConta(numeroConta);
        System.out.println("Qual é o seu saldo inicial? ");
        var saldoInicial = scanner.nextDouble();
        conta.setSaldo(saldoInicial);
        conta.definirChequeEspecial();

        int option = 0;
        while (option != 7) {
            System.out.println("\n Qual é a operação que deseja fazer? ");

            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se a conta está usando o cheque especial");
            System.out.println("7 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.printf("%s seu saldo é de R$ %s", nome, conta.consultarSaldo());
                }
                case 2 -> {
                    System.out.printf("%s seu cheque especial é de R$ %s \n", nome, conta.consultarChequeEspecial());
                }
                case 3 -> {
                    System.out.println("Qual é o valor que deseja depositar? ");
                    var deposito = scanner.nextDouble();
                    conta.consultarChequeEspecial();
                    conta.depositar(deposito);
                    System.out.println("Valor depositado com sucesso!");
                }
                case 4 -> {
                    System.out.println("Qual é o valor que deseja sacar? ");
                    var saque = scanner.nextDouble();

                    conta.sacar(saque);

                }
                case 5 -> {
                    System.out.println("Qual é o valor do boleto? ");
                    var boleto = scanner.nextDouble();

                    conta.pagarBoleto(boleto);
                }
                case 6 -> {
                    String resultado = conta.estaUsandoChequeEspecial();
                    System.out.println(resultado);

                }
            }
        }

    }

}
