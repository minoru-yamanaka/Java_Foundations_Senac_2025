package aula_11.Heranca;

// TesteHeranca.java
public class TesteHeranca {
    public static void main(String[] args) {
        Cachorro bob = new Cachorro("Bob", "Labrador");
        Gato misty = new Gato("Misty", "Branco");

        System.out.println("--- Dados do Cachorro ---");
        System.out.println("Nome: " + bob.nome + ", Espécie: " + bob.especie + ", Raça: " + bob.raca);
        bob.fazerSom(); // Chama o método sobrescrito do Cachorro
        bob.comer();     // Chama o método herdado do Animal
        bob.latir();

        System.out.println("\n--- Dados do Gato ---");
        System.out.println("Nome: " + misty.nome + ", Espécie: " + misty.especie + ", Cor do Pelo: " + misty.corPelo);
        misty.fazerSom(); // Chama o método sobrescrito do Gato
        misty.comer();     // Chama o método herdado do Animal
        misty.arranhar();
    }
}