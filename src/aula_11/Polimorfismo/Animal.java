package aula_11.Polimorfismo;

// Animal.java (Superclasse / Classe Pai)
public class Animal {
    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom() {
        System.out.println("Fazendo algum som genérico...");
    }
}
