package com.desafios.desafio3;

public class Pet {

    private final String nome;
    

    private boolean limpo;


    public Pet(String nome) {
        this.nome = nome;
        this.limpo = false;
    }

    public boolean isClean() {
        return limpo;
    }

    public void setClean(boolean limpo) {
        this.limpo = limpo;
    }

    public String getNome() {
        return nome;
    }

}
