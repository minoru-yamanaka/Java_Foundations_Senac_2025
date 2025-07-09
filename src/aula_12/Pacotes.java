package aula_12;

import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pacotes {

    public static void main(String[] args) {
        // 📐 Math
        double raiz = Math.sqrt(25);        // 5.0
        int maior = Math.max(10, 20);       // 20
        double aleatorio = Math.random();   // Entre 0.0 e 1.0

        System.out.println("Raiz: " + raiz);
        System.out.println("Maior: " + maior);
        System.out.println("Aleatório: " + aleatorio);

        // 🎲 Random
        Random sorteio = new Random();
        int dado = sorteio.nextInt(6) + 1;  // Número de 1 a 6
        boolean chance = sorteio.nextBoolean();

        System.out.println("Dado: " + dado);
        System.out.println("Chance: " + chance);

        // ✂️ String
        String nome = "Minoru";
        System.out.println("Maiúsculas: " + nome.toUpperCase());
        System.out.println("Primeira letra: " + nome.charAt(0));
        System.out.println("Contém 'no'? " + nome.contains("no"));

        // 📅 LocalDate
        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = LocalDate.of(1990, 5, 10);
        System.out.println("Hoje: " + hoje);
        System.out.println("Data de nascimento: " + nascimento);

        // 🕰️ DateTimeFormatter
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = hoje.format(formato);
        System.out.println("Data formatada: " + dataFormatada);
    }
}
