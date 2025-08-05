package com.desafios.desafio2;

import java.util.Scanner;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private boolean ligadoOuDesligado;
    private String marcha = "Ponto morto";
    private int velocidade = 0;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigadoOuDesligado() {
        return ligadoOuDesligado;
    }

    public void setLigadoOuDesligado(boolean ligadoOuDesligado) {
        this.ligadoOuDesligado = ligadoOuDesligado;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarcha() {
        return marcha;
    }

    public boolean ligarCarro() {
        if (!this.ligadoOuDesligado) {
            this.ligadoOuDesligado = true;
            System.out.println("\nO carro foi ligado!");
            return true;
        } else {
            System.out.println("\nO carro já está ligado!");
            return false;
        }
    }

    public boolean desligarCarro() {
        if (!this.ligadoOuDesligado) {
            System.out.println("\nO carro já está desligado!");
            return false;
        }

        if (this.velocidade == 0 && this.marcha.equals("Ponto morto")) {
            this.ligadoOuDesligado = false;
            System.out.println("\nO carro foi desligado!");
            return true;
        } else {
            System.out.println(
                    "\nO carro não pode ser desligado! A velocidade deve estar em 0 km/h e a marcha em ponto morto.");
            return false;
        }
    }

    public Object[] acelerar() {
        if (!ligadoOuDesligado) {
            System.out.println("\nO carro não está ligado!");
            System.out.println("Você quer ligar o carro? (S/N)");
            Scanner scanner = new Scanner(System.in);
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("S")) {
                ligarCarro();
            } else {
                return new Object[] {};
            }
        }

        switch (marcha) {
            case "Ponto morto" -> {
                System.out.println("Você não pode acelerar com a marcha em ponto morto! Mude para outra marcha.");
                trocarMarcha();
                if (marcha.equals("Primeira")) {
                    System.out.printf("Você está a %skm/h\n", this.velocidade += 1);
                }
            }

            case "Marcha ré" -> {
                System.out.println("Você só pode ir até 20km/h com a marcha ré!");
                if (this.velocidade >= 20) {
                    System.out.println("Velocidade limite atingida na marcha ré. Troque a marcha.");
                    trocarMarcha();
                } else {
                    System.out.printf("Você está a %skm/h\n", this.velocidade += 1);
                }
            }

            case "Primeira" -> {
                if (this.velocidade >= 20) {
                    System.out.println("Velocidade limite atingida na primeira marcha. Troque a marcha.");
                    trocarMarcha();
                } else {
                    System.out.printf("Você está a %skm/h\n", this.velocidade += 1);
                }
            }

            case "Segunda" -> {
                if (this.velocidade >= 40) {
                    System.out.println("Velocidade limite atingida na segunda marcha. Troque a marcha.");
                    trocarMarcha();
                } else {
                    System.out.printf("Você está a %skm/h\n", this.velocidade += 1);
                }
            }

            case "Terceira" -> {
                if (this.velocidade >= 60) {
                    System.out.println("Velocidade limite atingida na terceira marcha. Troque a marcha.");
                    trocarMarcha();
                } else {
                    System.out.printf("Você está a %skm/h\n", this.velocidade += 1);
                }
            }

            case "Quarta" -> {
                if (this.velocidade >= 80) {
                    System.out.println("Velocidade limite atingida na quarta marcha. Troque a marcha.");
                    trocarMarcha();
                } else {
                    System.out.printf("Você está a %skm/h\n", this.velocidade += 1);
                }
            }

            case "Quinta" -> {
                if (this.velocidade >= 100) {
                    System.out.println("Velocidade limite atingida na quinta marcha. Troque a marcha.");
                    trocarMarcha();
                } else {
                    System.out.printf("Você está a %skm/h\n", this.velocidade += 1);
                }
            }

            case "Sexta" -> {
                if (this.velocidade >= 120) {
                    System.out.println("Velocidade máxima atingida na sexta marcha. Reduza ou mantenha.");
                } else {
                    System.out.printf("Você está a %skm/h\n", this.velocidade += 1);
                }
            }

            default -> {
                System.out.println("Marcha inválida. Não é possível acelerar.");
            }
        }

        return new Object[] { this.velocidade, this.marcha };
    }

    public Object[] diminuirVelocidade() {
        if (!this.ligadoOuDesligado) {
            System.out.println("\nO carro está desligado! Não é possível reduzir a velocidade.");
            return new Object[] { this.velocidade, this.marcha };
        }

        if (this.velocidade <= 0) {
            this.velocidade = 0;
            System.out.println("\nO carro já está parado.");
            return new Object[] { this.velocidade, this.marcha };
        }

        // Diminui a velocidade de 1 em 1
        this.velocidade -= 1;
        System.out.printf("Velocidade reduzida para %skm/h\n", this.velocidade);

        // Sugere reduzir a marcha se necessário
        switch (this.marcha) {
            case "Sexta" -> {
                if (velocidade < 100) {
                    System.out.println("Você pode reduzir para Quinta.");
                }
            }
            case "Quinta" -> {
                if (velocidade < 80) {
                    System.out.println("Você pode reduzir para Quarta.");
                }
            }
            case "Quarta" -> {
                if (velocidade < 60) {
                    System.out.println("Você pode reduzir para Terceira.");
                }
            }
            case "Terceira" -> {
                if (velocidade < 40) {
                    System.out.println("Você pode reduzir para Segunda.");
                }
            }
            case "Segunda" -> {
                if (velocidade < 20) {
                    System.out.println("Você pode reduzir para Primeira.");
                }
            }
            case "Primeira" -> {
                if (velocidade == 0) {
                    System.out.println("Você pode colocar em Ponto morto.");
                }
            }
        }

        return new Object[] { this.velocidade, this.marcha };
    }

    public String trocarMarcha() {
        Scanner scanner = new Scanner(System.in);

        if (!this.ligadoOuDesligado) {
            System.out.println("O carro está desligado. Ligue o carro antes de trocar a marcha.");
            return this.marcha;
        }

        switch (marcha) {
            case "Ponto morto" -> {
                System.out.println("Para qual marcha quer trocar?");
                System.out.println("1 - Primeira");
                System.out.println("2 - Marcha ré");
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1 -> this.marcha = "Primeira";
                    case 2 -> this.marcha = "Marcha ré";
                    default -> System.out.println("Opção inválida!");
                }
            }

            case "Marcha ré" -> {
                System.out.println("Para qual marcha quer trocar?");
                System.out.println("1 - Primeira");
                System.out.println("2 - Ponto morto");
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1 -> this.marcha = "Primeira";
                    case 2 -> this.marcha = "Ponto morto";
                    default -> System.out.println("Opção inválida!");
                }
            }

            case "Primeira" -> {
                System.out.println("Para qual marcha quer trocar?");
                System.out.println("1 - Segunda");
                System.out.println("2 - Ponto morto");
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1 -> this.marcha = "Segunda";
                    case 2 -> this.marcha = "Ponto morto";
                    default -> System.out.println("Opção inválida!");
                }
            }

            case "Segunda" -> {
                System.out.println("Para qual marcha quer trocar?");
                System.out.println("1 - Terceira");
                System.out.println("2 - Primeira");
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1 -> this.marcha = "Terceira";
                    case 2 -> this.marcha = "Primeira";
                    default -> System.out.println("Opção inválida!");
                }
            }

            case "Terceira" -> {
                System.out.println("Para qual marcha quer trocar?");
                System.out.println("1 - Quarta");
                System.out.println("2 - Segunda");
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1 -> this.marcha = "Quarta";
                    case 2 -> this.marcha = "Segunda";
                    default -> System.out.println("Opção inválida!");
                }
            }

            case "Quarta" -> {
                System.out.println("Para qual marcha quer trocar?");
                System.out.println("1 - Quinta");
                System.out.println("2 - Terceira");
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1 -> this.marcha = "Quinta";
                    case 2 -> this.marcha = "Terceira";
                    default -> System.out.println("Opção inválida!");
                }
            }

            case "Quinta" -> {
                System.out.println("Para qual marcha quer trocar?");
                System.out.println("1 - Sexta");
                System.out.println("2 - Quarta");
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1 -> this.marcha = "Sexta";
                    case 2 -> this.marcha = "Quarta";
                    default -> System.out.println("Opção inválida!");
                }
            }

            case "Sexta" -> {
                System.out.println("Para qual marcha quer trocar?");
                System.out.println("1 - Quinta");
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1 -> this.marcha = "Quinta";
                    default -> System.out.println("Opção inválida!");
                }
            }

            default -> System.out.println("Marcha atual desconhecida: " + this.marcha);
        }

        System.out.println("Marcha atual: " + this.marcha);
        return this.marcha;
    }

    public String virar() {
        if (!this.ligadoOuDesligado) {
            return "O carro está desligado! Ligue o carro antes de virar.";
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPara onde deseja virar?");
        System.out.println("1 - Esquerda");
        System.out.println("2 - Direita");
        int opcao = scanner.nextInt();

        return switch (opcao) {
            case 1 -> "Você virou à esquerda.";
            case 2 -> "Você virou à direita.";
            default -> "Opção inválida. O carro seguiu em frente.";
        };
    }

    public int verificarVelocidade(){
        if (!this.ligadoOuDesligado) {
             System.out.println("O carro está desligado! Ligue o carro antes de virar.");
        }
        return this.velocidade;
    }

    public String verificarDados(){
        return "Marca: " + this.marca +"\n"+" Modelo: " + this.modelo + "\n"+" Ano : " + this.ano + "\n"+" Cor: " +this.cor+"\n" + "Marcha: " + this.marcha + "\n" + " Ligado: " + this.ligadoOuDesligado;
    }
}
