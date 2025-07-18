package atividades.separar;

// Classe principal
class Main {
    public static void main(String[] args) {
        Carrinho Carrinho01 = new Carrinho();
        Carrinho01.modelo = "Civic";
        Carrinho01.ligar(); // herdado de Veiculo
        Carrinho01.abrirPortaMalas(); // específico do Carro
    }
}
