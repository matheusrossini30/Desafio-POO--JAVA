package com.desafios.desafio3;




public class MaquinaDeBanho {

    private  boolean limpo = true;
    private  int agua = 30;
    private  int shampoo = 10;
    private  Pet pet;



    public void tomarBanho() {
        if (this.pet == null) {
            System.out.println("Coloque o pet para iniciar o banho. ");
            return;
        }
        this.agua -= 10;
        this.shampoo -= 2;
        this.pet.setClean(true);
        System.out.println("O pet " + pet.getNome() + "está limpo");

    }

    public void addAgua() {
        if (this.agua == 30) {
            System.out.println("A capacidade de agua está no maximo");
            return;
        }
        this.agua += 2;
    }

    public void addShampoo() {
        if (this.shampoo == 10) {
            System.out.println("A capacidade de shampoo está no maximo");
            return;
        }
        this.shampoo += 2;
    }

    public int getAgua() {
        return this.agua;
    }

    public int getShampoo() {
        return this.shampoo;
    }

    public boolean temPet() {
        return this.pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.limpo) {
            System.out.println(" A maquina está suja, para colocar o pet é necessariop lampa-la");
            return;
        }
        if (temPet()) {
            System.out.println("O pet " + this.pet.getNome() + " já está no banho");
            return;
        }
        this.pet = pet;
    }

    public void removerPet() {
        this.limpo = this.pet.isClean();
        System.out.println("O pet " + this.pet.getNome() + " está limpo");
        this.pet = null;
    }

    public void lavarMaquina() {
        this.agua -= 10;
        this.shampoo -= 2;
        this.limpo = true;
        System.out.println("A maquina está limpa");
    }
}
