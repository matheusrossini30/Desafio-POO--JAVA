package com.desafios.desafio1;
import java.util.Scanner;

public class ContaBancaria {

    private String nome;
    private int numuroDaConta;
    private double saldo;
    private double chequeEspecial;
    private double limiteChequeEspecial;

    public ContaBancaria(String nome, int numuroDaConta, double saldo) {
        this.nome = nome;
        this.numuroDaConta = numuroDaConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {

    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumuroDaConta() {
        return numuroDaConta;
    }

    public void setNumuroDaConta(int numuroDaConta) {
        this.numuroDaConta = numuroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void definirChequeEspecial() {
        if (saldo <= 500.0) {
            chequeEspecial = 50.0;
        } else {
            chequeEspecial = saldo / 2;
        }
        limiteChequeEspecial = chequeEspecial;
    }

    public double consultarChequeEspecial() {
        return this.chequeEspecial; // apenas retorna o que ainda tem
    }

    public double depositar(double deposito) {
        if (deposito > 0) {
            System.out.println("Valor depositado: R$ " + deposito);
            this.saldo += deposito;

        } else {
            System.out.println("Valor de deposito deve ser maior que zero ");
        }
        return this.saldo;

    }

    public double sacar(double saque) {
        var scanner = new Scanner(System.in);
        if (saque <= this.saldo) {
            System.out.println("Valor sacado com sucesso!");
            return this.saldo -= saque;
        } else if (saque > this.saldo && saque <= this.saldo + chequeEspecial) {
            System.out.println("Você deseja utilizar o seu cheque especial (s/n)? ");
            String resposta = scanner.next();
            while (!"s".equalsIgnoreCase(resposta) && !"n".equalsIgnoreCase(resposta)) {
                System.out.println("Resposta inválida! Digite uma resposta válida (s/n): ");
                resposta = scanner.next();
            }
            if ("s".equalsIgnoreCase(resposta)) {
                double valorUsadoDoCheque = saque - this.saldo;
                chequeEspecial -= valorUsadoDoCheque;
                this.saldo = 0;
                System.out.println("O valor sacado foi coberto com o cheque especial!");
                System.out.println("Saldo atual: " + this.saldo);
                System.out.println("Cheque especial restante: " + this.chequeEspecial);
            } else {
                System.out.println("Você não tem saldo suficiente para realizar o saque!");
            }

        } else {
            System.out.println("Você não tem saldo suficiente para realizar o saque!");
        }

        return this.saldo;
    }

    public double pagarBoleto(double boleto) {
        var scanner = new Scanner(System.in);
        if (boleto <= this.saldo) {
            System.out.println("Boleto pago com sucesso!");
            return this.saldo -= boleto;

        } else if (boleto > this.saldo && boleto <= this.saldo + chequeEspecial) {

            System.out.println("Você deseja utilizar o seu cheque especial (s/n)? ");
            String resposta = scanner.next();

            while (!"s".equalsIgnoreCase(resposta) && !"n".equalsIgnoreCase(resposta)) {
                System.out.println("Resposta inválida! Digite uma resposta válida (s/n): ");
                resposta = scanner.next();
            }

            if ("s".equalsIgnoreCase(resposta)) {
                double valorUsadoDoCheque = boleto - this.saldo;
                this.chequeEspecial -= valorUsadoDoCheque; // diminui o que foi usado
                this.saldo = 0;

                System.out.println("O valor do boleto foi coberto com o cheque especial!");
                System.out.println("Saldo atual: " + this.saldo);
                System.out.println("Cheque especial restante: " + this.chequeEspecial);
            } else {
                System.out.println("Pagamento cancelado. Saldo insuficiente.");
            }

        } else {
            System.out.println("Saldo insuficiente para pagar o boleto, mesmo com cheque especial.");
        }

        return this.saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public String estaUsandoChequeEspecial() {
        if (chequeEspecial < limiteChequeEspecial) {
            double valorUtilizado = limiteChequeEspecial - chequeEspecial;
            double taxa = valorUtilizado * 0.20;

            return String.format(
                    "Você está utilizando R$%.2f do cheque especial.\nUma taxa de R$%.2f será aplicada.",
                    valorUtilizado, taxa);
        } else {
            return "Você não está utilizando o cheque especial.";
        }
    }

}
