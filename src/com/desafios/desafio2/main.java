package com.desafios.desafio2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("================================");
        System.out.println("Bem-vindo ao sistema do carro");
        System.out.println("================================");

        System.out.println("Qual é a marca: ");
        var marca = scanner.next();
        carro.setMarca(marca);
        System.out.println("Qual é o modelo:  ");
        var modelo = scanner.next();
        carro.setModelo(modelo);
        System.out.println("Qual é o ano: ");
        var ano = scanner.nextInt();
        carro.setAno(ano);
        System.out.println("Qual é a cor do carro: ");
        var cor = scanner.next();
        carro.setCor(cor);

        System.out.println("\nO carro está deligado e em ponto morto");

        int option = 0;
        while (option != 9) {
            System.out.println("\n Qual é a operação que deseja fazer? ");

            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir a velocidade");
            System.out.println("5 - Virar para a esquerda/direita");
            System.out.println("6 - Verificar velocidade");
            System.out.println("7 - Trocar a Marcha");
            System.out.println("8 - Verificar dados do carro");
            System.out.println("9 - Sair");
            option = scanner.nextInt();
            if (option <= 9 && option >= 1) {

                switch (option) {
                    case 1 -> {
                        System.out.printf("\n \n", carro.ligarCarro());
                    }
                    case 2 -> {
                        System.out.printf("\n  \n", carro.desligarCarro());

                    }
                    case 3 -> {
                        System.out.printf("\n  \n", carro.acelerar());

                    }
                    case 4 -> {
                        System.out.printf("\n  \n", carro.diminuirVelocidade());
                    }
                    case 5 -> {
                        System.out.printf("\n  \n", carro.virar());
                    }
                    case 6 -> {
                        System.out.printf("\n Você está a %skm/h \n", carro.verificarVelocidade());
                    }
                    case 7 -> {
                        System.out.printf("\n %s \n", carro.trocarMarcha());
                    }
                    case 8 -> {
                        System.out.printf("\n %s \n", carro.verificarDados());
                    }

                }
                
            } else {
                System.out.println("Opção invalida, escolha uma opção válida");
                option = scanner.nextInt();
            }

        }
    }

}
