package atividades.Input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Entrada de dados
        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();
        // Saída de dados
        System.out.println(nome);
    }



}
