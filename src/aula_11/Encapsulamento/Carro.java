package aula_11.Encapsulamento;

// Carro.java
public class Carro {
    public String marca;
    public String modelo;
    private double combustivel; // Atributo privado (encapsulado)

    // Construtor
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = 50.0; // Valor inicial
    }

    // Método público para abastecer
    public void abastecer(double quantidade) {
        if (quantidade > 0) {
            this.combustivel += quantidade;
            System.out.println("Abastecido com " + quantidade + " litros. Combustível atual: " + String.format("%.2f", this.combustivel) + " litros.");
        } else {
            System.out.println("Quantidade de abastecimento inválida.");
        }
    }

    // Método público para dirigir
    public void dirigir(double distancia) {
        double consumo = distancia / 10.0; // Exemplo: 10 km por litro
        if (this.combustivel >= consumo) {
            this.combustivel -= consumo;
            System.out.println("Dirigiu " + distancia + " km. Combustível restante: " + String.format("%.2f", this.combustivel) + " litros.");
        } else {
            System.out.println("Combustível insuficiente para essa distância.");
        }
    }

    // Método getter para acessar o combustível (leitura)
    public double getCombustivel() {
        return this.combustivel;
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla");

        // Não podemos acessar 'combustivel' diretamente de fora
        // System.out.println(meuCarro.combustivel); // Isso causaria um erro de compilação

        // Usamos os métodos públicos para interagir
        meuCarro.dirigir(200);
        meuCarro.abastecer(30);
        meuCarro.dirigir(400);
        System.out.println("Combustível atual (via método): " + String.format("%.2f", meuCarro.getCombustivel()) + " litros.");
    }
}
