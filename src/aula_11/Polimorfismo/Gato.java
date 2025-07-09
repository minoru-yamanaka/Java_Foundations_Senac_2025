package aula_11.Polimorfismo;

// Gato.java
public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}
