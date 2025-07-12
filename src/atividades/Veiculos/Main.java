package atividades.Veiculos;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Criando Veículos ---");

        // Criando um objeto Carro
        Carro meuCarro = new Carro("Ford", 2023, 4);
        meuCarro.ligar(); // Método herdado de Veiculo
        meuCarro.abrirPortaMalas(); // Método próprio de Carro
        meuCarro.transportarPessoas(5); // Método da interface Transportavel
        meuCarro.transportarCarga(150.5); // Método da interface Transportavel
        meuCarro.desligar(); // Método herdado de Veiculo
        System.out.println("------------------------\n");

        // Criando um objeto Moto
        Moto minhaMoto = new Moto("Honda", 2024, true);
        minhaMoto.ligar(); // Método herdado de Veiculo
        minhaMoto.empinar(); // Método próprio de Moto
        minhaMoto.transportarPessoas(2); // Método da interface Transportavel
        minhaMoto.transportarCarga(10.0); // Método da interface Transportavel
        minhaMoto.desligar(); // Método herdado de Veiculo
        System.out.println("------------------------\n");

        System.out.println("--- Polimorfismo com Interface ---");
        // Podemos tratar Carro e Moto como Transportavel, pois eles implementam a interface
        Transportavel algoParaTransportar1 = new Carro("Chevrolet", 2020, 2);
        algoParaTransportar1.transportarPessoas(3);

        Transportavel algoParaTransportar2 = new Moto("Yamaha", 2021, false);
        algoParaTransportar2.transportarCarga(5.0);
    }
}
