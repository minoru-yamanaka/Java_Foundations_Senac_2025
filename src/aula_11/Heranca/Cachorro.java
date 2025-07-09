package aula_11.Heranca;

// Cachorro.java (Subclasse / Classe Filha)
public class Cachorro extends Animal { // 'extends' indica herança
    public String raca;

    public Cachorro(String nome, String raca) {
        super(nome, "Cachorro"); // Chama o construtor da superclasse
        this.raca = raca;
    }

    @Override // Indica que estamos sobrescrevendo um método da superclasse
    public void fazerSom() {
        System.out.println("Au au!");
    }

    public void latir() {
        System.out.println(this.nome + " está latindo: Au au!");
    }
}