package teste;

// Superclasse
class Animal {
    protected String nome;
    protected int idade;

    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método polimórfico
    public void apresentar() {
        System.out.println("Sou um animal genérico.");
    }

    public void fazerSom() {
        System.out.println("Som genérico de animal.");
    }
}

// Subclasse Cachorro
class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o cachorro " + nome + ", tenho " + idade + " anos.");
    }

    @Override
    public void fazerSom() {
        System.out.println("Cachorro: Au au!");
    }
}

// Subclasse Gato
class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o gato " + nome + ", tenho " + idade + " anos.");
    }

    @Override
    public void fazerSom() {
        System.out.println("Gato: Miau!");
    }
}

// Subclasse Vaca
class Vaca extends Animal {
    public Vaca(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void apresentar() {
        System.out.println("Sou a vaca " + nome + ", tenho " + idade + " anos.");
    }

    @Override
    public void fazerSom() {
        System.out.println("Vaca: Muuuuu!");
    }
}

// Classe principal
//public class ImprimirAnimal {
//    public static void main(String[] args) {
//        // Polimorfismo com atributos
//        Animal cachorro = new Cachorro("Rex", 5);
//        Animal gato = new Gato("Mingau", 3);
//        Animal vaca = new Vaca("Mimosa", 7);
//
//        // Chamada polimórfica dos métodos
//        cachorro.apresentar();
//        cachorro.fazerSom();
//
//        gato.apresentar();
//        gato.fazerSom();
//
//        vaca.apresentar();
//        vaca.fazerSom();
//    }
//}
