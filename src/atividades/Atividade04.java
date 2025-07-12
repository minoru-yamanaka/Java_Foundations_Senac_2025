package atividades;

public class Atividade04 {
    public static void main(String[] args) {
        // --- Atividade 4: Loops (for e while) ---
        System.out.println("--- Atividade 4: Loops (for e while) ---");

        // Loop for: Imprime os números de 1 a 5 e verifica se é par ou ímpar.
        System.out.println("--- Loop For ---");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é ímpar");
            }
        }

        // Loop while: Imprime os números de 0 a 4.
        System.out.println("--- Loop While ---");
        int contador = 0;
        while (contador < 5) {
            System.out.println(contador);
            contador++;
        }
        System.out.println("\n"); // Adiciona uma linha em branco
    }
}
