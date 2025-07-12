package atividades.Veiculos;

// Carro.java
// Subclasse Carro que herda e implementa a interface
class Carro extends Veiculo implements Transportavel {
    int numeroPortas;

    public Carro(String marca, int ano, int numeroPortas) {
        super(marca, ano);
        this.numeroPortas = numeroPortas;
        System.out.println("-> Um Carro foi criado: " + marca + " com " + numeroPortas + " portas.");
    }

    public void abrirPortaMalas() {
        System.out.println("O porta-malas do carro " + marca + " está sendo aberto.");
    }

    // Implementação dos métodos da interface Transportavel
    @Override
    public void transportarPessoas(int quantidade) {
        System.out.println("O carro " + marca + " está transportando " + quantidade + " pessoas.");
    }

    @Override
    public void transportarCarga(double pesoKg) {
        System.out.println("O carro " + marca + " está transportando " + pesoKg + " kg de carga.");
    }
}
