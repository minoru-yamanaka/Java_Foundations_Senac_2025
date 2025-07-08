package aula_14;// Importa a classe Scanner, que permite ler dados digitados pelo usuário no teclado
import java.util.Scanner;

// Define a classe principal chamada 'a_Calculadora'
public class z_Calculadora {

    // Método que realiza a soma de dois números
    public static double somar(double a, double b) {
        return a + b; // Retorna o resultado da soma
    }

    // Método que realiza a subtração de dois números
    public static double subtrair(double a, double b) {
        return a - b; // Retorna o resultado da subtração
    }

    // Método que realiza a multiplicação de dois números
    public static double multiplicar(double a, double b) {
        return a * b; // Retorna o resultado da multiplicação
    }

    // Método que realiza a divisão de dois números
    public static double dividir(double a, double b) {
        // Verifica se o divisor é zero para evitar erro de divisão
        if (b == 0) {
            System.out.println("Erro: divisão por zero!"); // Exibe mensagem de erro
            return 0; // Retorna zero como valor padrão
        }
        return a / b; // Retorna o resultado da divisão
    }

    // Método principal, onde o programa começa a ser executado
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do usuário via teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA ==="); // Exibe título do programa

        // Solicita ao usuário o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble(); // Lê o primeiro número digitado

        // Solicita ao usuário o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble(); // Lê o segundo número digitado

        // Solicita ao usuário o operador da operação matemática
        System.out.println("Escolha a operação: +  -  *  /");
        String operador = scanner.next(); // Lê o operador digitado

        double resultado = 0; // Inicializa a variável que armazenará o resultado

        // Estrutura de decisão que escolhe qual operação executar com base no operador
        switch (operador) {
            case "+": // Se o operador for '+'
                resultado = somar(num1, num2); // Chama o método de soma
                break;
            case "-": // Se o operador for '-'
                resultado = subtrair(num1, num2); // Chama o método de subtração
                break;
            case "*": // Se o operador for '*'
                resultado = multiplicar(num1, num2); // Chama o método de multiplicação
                break;
            case "/": // Se o operador for '/'
                resultado = dividir(num1, num2); // Chama o método de divisão
                break;
            default: // Se o operador for inválido
                System.out.println("Operador inválido."); // Exibe mensagem de erro
                scanner.close(); // Fecha o scanner para liberar o recurso
                return; // Encerra o programa
        }

        // Exibe o resultado da operação escolhida
        System.out.println("Resultado: " + resultado);

        scanner.close(); // Fecha o scanner após o uso
    }
}
