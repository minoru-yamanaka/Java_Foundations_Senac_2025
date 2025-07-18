package atividades.Input;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Entrada de dados
        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();
        System.out.print("Digite a idade do aluno: ");
        String idade = input.nextLine();
        // Saída de dados
        System.out.println(nome);
        System.out.println(idade);
    }
}
