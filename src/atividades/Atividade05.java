package atividades;

public class Atividade05 {
    public static void main(String[] args) {
        // --- Atividade 5: Arrays (Vetores) ---
        System.out.println("--- Atividade 5: Arrays (Vetores) ---");
        // Declara um array de String chamado frutas e inicializa-o.
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva"};

        System.out.println("--- Minhas Frutas Favoritas ---");
        // Usa um loop for-each para percorrer o array e imprimir cada fruta.
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Acessa e imprime a fruta que está na segunda posição do array (índice 1).
        // Lembre-se que arrays em Java são baseados em índice 0.
        System.out.println("A fruta na segunda posição é: " + frutas[1]);
    }
}
