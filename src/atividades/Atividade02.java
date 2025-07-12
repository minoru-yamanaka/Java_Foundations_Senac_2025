package atividades;

public class Atividade02 {
    public static void main(String[] args) {
        // --- Atividade 2: Operações Matemáticas Básicas ---
        System.out.println("--- Atividade 2: Operações Matemáticas Básicas ---");
        // Declara duas variáveis int.
        int numero1 = 10;
        int numero2 = 5;

        // Declara variáveis para armazenar os resultados das operações.
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        // A divisão de inteiros em Java resulta em um inteiro.
        // Para uma divisão com ponto flutuante, um dos operandos deve ser double.
        double divisao = (double) numero1 / numero2;

        // Imprime cada resultado de forma clara.
        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + subtracao);
        System.out.println("A multiplicação é: " + multiplicacao);
        System.out.println("A divisão é: " + divisao);
        System.out.println("\n"); // Adiciona uma linha em branco
    }
}
