package Calculadora01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("=== CALCULADORA ===");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = calc.somar(num1, num2);
                break;
            case 2:
                resultado = calc.subtrair(num1, num2);
                break;
            case 3:
                resultado = calc.multiplicar(num1, num2);
                break;
            case 4:
                resultado = calc.dividir(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
