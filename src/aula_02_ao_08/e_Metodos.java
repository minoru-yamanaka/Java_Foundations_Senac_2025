package aula_02_ao_08;// Métodos são blocos de código que realizam uma tarefa
// específica. Eles ajudam a organizar o código e torná-lo reutilizável.

public class e_Metodos {

    // Método sem retorno e sem parâmetros
    public static void exibirMensagem() {
        System.out.println("Este é um método que exibe uma mensagem.");
    }

    // Método com parâmetro e sem retorno
    public static void saudarNome(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    // Método com parâmetros e com retorno
    public static int somar(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public static void main(String[] args) {
        // Chamando os métodos
        exibirMensagem();

        saudarNome("Alice");
        saudarNome("Bob");

        int soma = somar(5, 3);
        System.out.println("A soma é: " + soma);

        System.out.println("A soma de 10 e 20 é: " + somar(10, 20));
    }
}

// Entendendo a Assinatura do Método:
//public static: Modificadores de acesso e comportamento (vistos anteriormente).

//public class OlaMundo { // Estamos definindo um "tipo" de robô, chamado OlaMundo
//   public static void main(String[] args) { // Esta é a "tarefa principal" que o robô vai fazer
//        System.out.println("Olá, Mundo!"); // A ordem: "Robô, fale 'Olá, Mundo!' no alto-falante!"
//    }
//}

// int (ou void): Tipo de retorno do método. void significa que o método não retorna nada.
//  Se retornar, o tipo de dado do valor retornado deve ser especificado (ex: int, String, double).

// somar: Nome do método.

//(int num1, int num2): Lista de parâmetros. Dentro dos parênteses,
// você especifica o tipo e o nome de cada parâmetro que o método espera receber.