package aula_11.Heranca;

// Gato.java (Subclasse / Classe Filha)
public class Gato extends Animal {
    public String corPelo;

    public Gato(String nome, String corPelo) {
        super(nome, "Gato");
        this.corPelo = corPelo;
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }

    public void arranhar() {
        System.out.println(this.nome + " está arranhando.");
    }
}