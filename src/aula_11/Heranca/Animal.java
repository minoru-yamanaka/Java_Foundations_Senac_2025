package aula_11.Heranca;

// Animal.java (Superclasse / Classe Pai)
public class Animal {
    public String nome;
    public String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public void fazerSom() {
        System.out.println("Fazendo algum som...");
    }

    public void comer() {
        System.out.println(this.nome + " está comendo.");
    }
}





