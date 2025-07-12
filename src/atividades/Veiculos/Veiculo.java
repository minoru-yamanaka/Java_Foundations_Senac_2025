package atividades.Veiculos;

// Superclasse
class Veiculo {
    String marca;
    int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
        System.out.println("-> Um Veículo foi criado: " + marca + " do ano " + ano + ".");
    }

    public void ligar() {
        System.out.println("O veículo " + marca + " está ligando...");
    }

    public void desligar() {
        System.out.println("O veículo " + marca + " está desligando.");
    }
}