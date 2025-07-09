package aula_11.Abstracao;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    // Implementação obrigatória do método abstrato
    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}