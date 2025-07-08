package aula_02_ao_08;

import java.util.Scanner;

public class f_Input {
    public static void main(String[] args) {
        System.out.println("Iniciando o programa de saudação...");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Por favor, digite seu nome: ");
        String nome = leitor.nextLine();
        leitor.close();

        System.out.println("Olá, " + nome + "! Bem-vindo(a) ao mundo Java!");
        System.out.println("Programa finalizado. Até mais!");
    }
}

// 🔍 Resumo prático:
// Scanner = ferramenta que escuta.
// .nextLine() = comando que captura o que foi digitado.

// 🧠 Cada linha tem um papel específico:
// Scanner leitor = ...: você cria o leitor.
// System.out.print(...): você pede o nome.
// String nome = ...: você recebe o que foi digitado.
// leitor.close();: você encerra o leitor corretamente.