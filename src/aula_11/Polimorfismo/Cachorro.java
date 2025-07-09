package aula_11.Polimorfismo;

// Cachorro.java
public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}
