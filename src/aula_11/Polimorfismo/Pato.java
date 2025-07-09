package aula_11.Polimorfismo;

// Pato.java
public class Pato extends Animal {
    public Pato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Quack!");
    }
}

