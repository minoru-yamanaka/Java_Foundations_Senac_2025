package aula_11.Polimorfismo;

// TestePolimorfismo.java
import java.util.ArrayList;
import java.util.List;

public class TestePolimorfismo {
    // Função que demonstra o polimorfismo
    public static void fazerAnimalFazerSom(Animal animal) {
        System.out.print(animal.nome + " faz: ");
        animal.fazerSom(); // O método chamado depende do tipo real do objeto
    }

    public static void main(String[] args) {
        // Criando objetos de diferentes tipos de animais
        Animal doguinho = new Cachorro("Buddy"); // Objeto Cachorro referenciado como Animal
        Animal gatinho = new Gato("Pérola");     // Objeto Gato referenciado como Animal
        Animal patinho = new Pato("Donald");     // Objeto Pato referenciado como Animal

        // Chamando a mesma função com diferentes tipos de objetos
        fazerAnimalFazerSom(doguinho);
        fazerAnimalFazerSom(gatinho);
        fazerAnimalFazerSom(patinho);

        System.out.println("\n--- Animais na fazenda ---");
        // Você também pode ter uma lista de animais e iterar sobre ela
        List<Animal> animaisNaFazenda = new ArrayList<>();
        animaisNaFazenda.add(new Cachorro("Max"));
        animaisNaFazenda.add(new Gato("Luna"));
        animaisNaFazenda.add(new Pato("Daisy"));

        for (Animal animal : animaisNaFazenda) {
            fazerAnimalFazerSom(animal);
        }
    }
}