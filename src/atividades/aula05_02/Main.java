package atividades.aula05_02;

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Carro
        atividades.aula05_02.Carro meuCarro01 = new Carro();

        // Definindo valores para os atributos
        meuCarro01.cor = "Vermelho";
        meuCarro01.modelo = "Civic";
        meuCarro01.ano = 2022;

        // Chamando o método ligar()
        meuCarro01.ligar();
    }
}
