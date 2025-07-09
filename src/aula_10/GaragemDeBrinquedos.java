package aula_10;

class CarroDeBrinquedo {
    // --- Atributos (Características do Carro) ---
    // Agora são PRIVADOS! Só o manual de instruções (a própria classe)
    // pode mexer neles diretamente.
    private String cor;
    private String modelo;
    private int velocidadeAtual; // Uma nova característica, também privada

    // --- Construtor (Como "Montar" um Carro Novo) ---
    // Este é o único jeito de CRIAR um CarroDeBrinquedo novo.
    // Ele é PÚBLICO para que você possa pedir para montar um carro.
    public CarroDeBrinquedo(String corInicial, String modeloInicial) {
        this.cor = corInicial;         // Define a cor inicial do carro
        this.modelo = modeloInicial;   // Define o modelo inicial do carro
        this.velocidadeAtual = 0;      // Todo carro novo começa parado
        System.out.println("Um novo carro de brinquedo " + modelo + " de cor " + cor + " foi montado e está parado!");
    }

    // --- Métodos (Comportamentos do Carro) ---

    // Método PÚBLICO: O carro sabe acelerar.
    public void acelerar() {
        velocidadeAtual += 10; // Aumenta a velocidade em 10
        System.out.println(modelo + " de cor " + cor + " está acelerando! Velocidade: " + velocidadeAtual + " km/h.");
    }

    // Método PÚBLICO: O carro sabe frear.
    public void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10; // Diminui a velocidade em 10
            System.out.println(modelo + " está freando. Velocidade: " + velocidadeAtual + " km/h.");
        } else {
            velocidadeAtual = 0;
            System.out.println(modelo + " já está parado.");
        }
    }

    // --- Getters (Para "Perguntar" as Características) ---
    // São PÚBLICOS, assim você pode perguntar sobre o carro, mas não pode mudar o valor.

    public String getCor() {
        return this.cor; // Devolve a cor atual do carro
    }

    public String getModelo() {
        return this.modelo; // Devolve o modelo atual do carro
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual; // Devolve a velocidade atual do carro
    }

    // --- Setters (Para "Mudar" as Características, mas com Controle!) ---
    // São PÚBLICOS, mas permitem que a CLASSE defina regras para a mudança.

    public void setCor(String novaCor) {
        // Regra: Só aceita cores que não são vazias!
        if (novaCor != null ) {
            this.cor = novaCor;
            System.out.println(this.modelo + " mudou para a cor " + this.cor + ".");
        } else {
            System.out.println("Cor inválida para o " + this.modelo + ". A cor não mudou.");
        }
    }

    // Não vamos permitir que o modelo seja alterado depois de criado,
    // então NÃO TEMOS um setModelo(). Isso é controle!

    // Não vamos permitir setar a velocidade diretamente,
    // só podemos acelerar ou frear.
    // public void setVelocidadeAtual(int novaVelocidade) { ... }
}

// --- Garagem Principal (Onde "Brincamos" com os Carros) ---
public class GaragemDeBrinquedos {
    public static void main(String[] args) {

        System.out.println("--- Montando Carros Novos ---");
        // Usamos o CONSTRUTOR para montar nossos carros.
        // É a ÚNICA forma de criar um objeto CarroDeBrinquedo.
        CarroDeBrinquedo carroVermelho = new CarroDeBrinquedo("Vermelho", "Esportivo");
        CarroDeBrinquedo carroAzul = new CarroDeBrinquedo("Azul", "Off-Road");

        System.out.println("\n--- Interagindo com o Carro Vermelho ---");
        // Usando GETTERS para "perguntar" sobre o carro (atributos privados)
        System.out.println("Carro 1: Cor: " + carroVermelho.getCor() + ", Modelo: " + carroVermelho.getModelo() + ", Velocidade: " + carroVermelho.getVelocidadeAtual());

        carroVermelho.acelerar(); // Acelera o carro vermelho
        carroVermelho.acelerar(); // Acelera mais um pouco
        System.out.println("Velocidade do carro vermelho agora: " + carroVermelho.getVelocidadeAtual() + " km/h.");

        // Usando SETTER para "mudar" a cor (atributo privado)
        carroVermelho.setCor("Preto"); // Cor válida
        carroVermelho.setCor("");      // Cor inválida, o setter impede a mudança!

        System.out.println("\n--- Interagindo com o Carro Azul ---");
        System.out.println("Carro 2: Cor: " + carroAzul.getCor() + ", Modelo: " + carroAzul.getModelo() + ", Velocidade: " + carroAzul.getVelocidadeAtual());

        carroAzul.acelerar();
        carroAzul.frear();
        carroAzul.frear(); // Tenta frear quando já está parado

        System.out.println("\n--- Tentando o que NÃO PODE (ERROS se descomentar) ---");
        // Tentar acessar diretamente um atributo PRIVADO (ERRO DE COMPILAÇÃO!)
        // System.out.println(carroVermelho.cor);

        // Tentar mudar diretamente um atributo PRIVADO (ERRO DE COMPILAÇÃO!)
        // carroAzul.velocidadeAtual = 100;

        // Tentar mudar o modelo (não temos um setter para ele, pois não queremos que ele mude!)
        // carroVermelho.setModelo("Conversível"); // Não existe esse método!
    }
}