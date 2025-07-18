package atividades.aula05;

public class Carro {
    // Atributos da classe Carro
    String cor;
    String modelo;
    int ano;

    // Método da classe Carro
    void ligar() {
        System.out.println("O carro " + modelo + " está ligado.");
    }

    // Método principal para execução
    public static void main(String[] args) {
        // Criação de um objeto da classe Carro
        Carro meuCarro01 = new Carro();

        // Definindo valores para os atributos
        meuCarro01.cor = "Vermelho";
        meuCarro01.modelo = "Civic";
        meuCarro01.ano = 2022;

        // Chamando o método ligar()
        meuCarro01.ligar();
    }
}
