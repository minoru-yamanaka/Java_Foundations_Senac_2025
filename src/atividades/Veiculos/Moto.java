package atividades.Veiculos;

// Moto.java
// Subclasse Moto que herda e implementa a interface
class Moto extends Veiculo implements Transportavel {
    boolean temPartidaEletrica;

    public Moto(String marca, int ano, boolean temPartidaEletrica) {
        super(marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;
        System.out.println("-> Uma Moto foi criada: " + marca + " (Partida Elétrica: " + temPartidaEletrica + ").");
    }

    public void empinar() {
        System.out.println("A moto " + marca + " está empinando! Cuidado!");
    }

    // Implementação dos métodos da interface Transportavel
    @Override
    public void transportarPessoas(int quantidade) {
        System.out.println("A moto " + marca + " está transportando " + quantidade + " pessoa(s). (Geralmente 1 ou 2)");
    }

    @Override
    public void transportarCarga(double pesoKg) {
        System.out.println("A moto " + marca + " está transportando " + pesoKg + " kg de carga. (Cuidado com o limite!)");
    }
}