package aula_11.Abstracao;

// Animal.java (Classe Abstrata)
abstract public class Animal { // 'abstract' indica que é uma classe abstrata
    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    // Método abstrato: deve ser implementado pelas subclasses
    public abstract void fazerSom();

    // Método concreto: implementado na classe abstrata e herdado pelas subclasses
    public void comer() {
        System.out.println(this.nome + " está comendo.");
    }
}
