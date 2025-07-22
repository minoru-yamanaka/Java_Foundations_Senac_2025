package Super;

// Superclasse
class Animal {
    String nome;

    // Construtor da superclasse
    public Animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom() {
        System.out.println("O animal faz um som genérico.");
    }
}

// Subclasse
class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome); // Chama o construtor da superclasse Animal
    }

    @Override
    public void fazerSom() {
        super.fazerSom(); // Chama o método da superclasse (opcional)
        System.out.println(nome + " late: Au Au!");
    }
}

// Classe principal para testar
public class SuperAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        cachorro.fazerSom();
    }
}
