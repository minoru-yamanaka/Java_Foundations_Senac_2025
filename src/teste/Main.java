package teste;

public class Main {
    // Classe principal
    public static void main(String[] args) {
            // Polimorfismo com atributos
            Animal cachorro = new Cachorro("Rex", 5);
            Animal gato = new Gato("Mingau", 3);
            Animal vaca = new Vaca("Mimosa", 7);

            // Chamada polimórfica dos métodos
            cachorro.apresentar();
            cachorro.fazerSom();

            gato.apresentar();
            gato.fazerSom();

            vaca.apresentar();
            vaca.fazerSom();
    }
}

