package atividades.CalculadoraIMC;

import java.util.Scanner;

public class Imccalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de IMC ---");

        // 1. Pede o peso do usuário
        System.out.print("Digite seu peso em quilogramas (ex: 70.5): ");
        double peso = scanner.nextDouble();

        // 2. Pede a altura do usuário
        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        // Verifica se a altura é válida para evitar divisão por zero
        if (altura <= 0) {
            System.out.println("Erro: A altura deve ser um valor positivo.");
            scanner.close();
            return; // Encerra o programa
        }

        // 3. Calcula o IMC
        double imc = peso / (altura * altura);

        // 4. Exibe o valor do IMC
        System.out.printf("\nSeu IMC é: %.2f\n", imc); // %.2f formata para 2 casas decimais

        // 5. Interpreta o resultado do IMC
        System.out.print("Classificação: ");
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25.0 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.0 && imc < 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc < 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        scanner.close(); // Fecha o scanner para liberar recursos
    }
}
