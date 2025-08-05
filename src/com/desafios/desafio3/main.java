package com.desafios.desafio3;

import java.util.Scanner;

public class main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static MaquinaDeBanho maquinaDeBanho = new MaquinaDeBanho();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        int option = -1;

        do {
            System.out.println("===== Escolha uma das opções abaixo =====");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer maquina com água");
            System.out.println("3 - Abastecer maquina com shampoo");
            System.out.println("4 - Verificar água da maquina");
            System.out.println("5 - Verificar shampoo da maquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da maquina");
            System.out.println("9 - Limapar a maquina");
            System.out.println("0 - Sair");
            String entrada = scanner.nextLine();

            try {
                option = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número de 0 a 9.");
                continue;
            }

            switch (option) {
                case 1 -> maquinaDeBanho.tomarBanho();
                case 2 -> setAgua();
                case 3 -> setShampoo(); 
                case 4 -> verificarAgua();
                case 5 -> verificarShampoo();
                case 6 -> verificandoPetNaMaquina();
                case 7 -> setPetInPetMachine();
                case 8 -> maquinaDeBanho.removerPet();
                case 9 -> maquinaDeBanho.lavarMaquina();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção invalida");
            }

        } while (true);

    }

    private static void setAgua(){
        System.out.println("Tentando colocar água na maquina");
        maquinaDeBanho.addAgua();
    }
    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na maquina");
        maquinaDeBanho.addShampoo();
    }


    private static void verificarAgua(){
        var quantidadeAgua = maquinaDeBanho.getAgua();
        System.out.println("Quantidade de shampoo na maquina: " + quantidadeAgua + " litro(s)");

    }
    private static void verificarShampoo(){
        var quantidadeShampoo = maquinaDeBanho.getShampoo();
        System.out.println("Quantidade de shampoo na maquina: " + quantidadeShampoo + " litro(s)");

    }


    private static void verificandoPetNaMaquina(){
        var temPet = maquinaDeBanho.temPet();
        System.out.println(temPet ? "Tem pet na maquina" : "Não tem pet na maquina");

    }



    public static void setPetInPetMachine() {
        var nome = "";

        while (nome == null || nome.isEmpty()) {
            System.out.println("Informe o nome do pet: ");
            nome = scanner.next();
        }

        var pet = new Pet(nome);
        maquinaDeBanho.setPet(pet);
        System.out.println("O pet " + pet.getNome() + "foi colocado na maquina");
    }



}
