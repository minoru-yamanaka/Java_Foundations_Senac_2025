package atividades.Calculadora;

// Este arquivo contém o código para uma calculadora simples em Java.
// Para compilar e executar, salve este código como Calculadora.java
// e use os seguintes comandos no terminal:
// javac Calculadora.java
// java Calculadora

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Calculadora {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do console
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora Simples em Java ---");

        // Solicita e lê o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble(); // Usa double para permitir números decimais

        // Solicita e lê o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicita e lê a operação desejada
        System.out.print("Escolha a operação (+, -, *, /): ");
        String operacao = scanner.next(); // Lê a operação como uma String

        double resultado = 0; // Variável para armazenar o resultado

        // Usa uma estrutura switch para realizar a operação com base na escolha do usuário
        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println("Resultado da soma: " + resultado);
                break; // Sai do switch após a execução do caso
            case "-":
                resultado = numero1 - numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case "/":
                // Verifica se o divisor é zero para evitar erro de divisão por zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                // Mensagem para operações não reconhecidas
                System.out.println("Operação inválida. Por favor, use +, -, * ou /.");
                break;
        }

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
        System.out.println("\nCalculadora finalizada.");
    }
}
