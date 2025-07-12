package atividades;

public class Atividade03 {
    public static void main(String[] args) {
        // --- Atividade 3: Condicionais (if/else) ---
        System.out.println("--- Atividade 3: Condicionais (if/else) ---");
        // Declare uma variável int chamada nota e atribua um valor entre 0 e 100 a ela.
        int nota = 75; // Experimente mudar este valor para 45, 60, 70, 80 para testar todos os caminhos.

        // Usa uma estrutura if/else if/else para verificar a nota.
        if (nota >= 70) {
            System.out.println("Aprovado!");
        } else if (nota >= 50 && nota < 70) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
        System.out.println("\n"); // Adiciona uma linha em branco
    }
}
