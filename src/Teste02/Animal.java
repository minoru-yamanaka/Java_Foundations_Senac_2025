package Teste02;

// Resumo direto e didático:
// Interface em Java não é uma classe, mas sim um contrato (ou tipo)
// que define métodos que devem ser implementados por quem assume esse contrato.

// Interface
interface SomAnimal {
    void emitirSom();
}

// Classe abstrata
abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método abstrato
    public abstract void apresentar();
}

// Subclasse Cachorro
class Cachorro extends Animal implements SomAnimal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o cachorro " + nome + ", tenho " + idade + " anos.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro: Au au!");
    }
}

// Subclasse Gato
class Gato extends Animal implements SomAnimal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o gato " + nome + ", tenho " + idade + " anos.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Gato: Miau!");
    }
}

// Subclasse Vaca
class Vaca extends Animal implements SomAnimal {
    public Vaca(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void apresentar() {
        System.out.println("Sou a vaca " + nome + ", tenho " + idade + " anos.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Vaca: Muuuuu!");
    }
}

// Classe principal
class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 4);
        Animal gato = new Gato("Mingau", 2);
        Animal vaca = new Vaca("Mimosa", 6);

        // Polimorfismo usando classe abstrata
        cachorro.apresentar();
        ((SomAnimal) cachorro).emitirSom();

        gato.apresentar();
        ((SomAnimal) gato).emitirSom();

        vaca.apresentar();
        ((SomAnimal) vaca).emitirSom();
    }
}

