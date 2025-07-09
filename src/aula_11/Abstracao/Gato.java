package aula_11.Abstracao;

// Gato.java
public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    // Implementação do método abstrato fazerSom()
    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}