package atividades.Input;

import java.util.Scanner;

public class Input3 {

    public static String metodoPegaNome() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();
        return nome;
    }

    public static String metodoPegaIdade() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a idade do aluno: ");
        String idade = input.nextLine();
        return idade;
    }

    public static void main(String[] args) {
//        System.out.println("Nome: " + metodoPegaNome());
//        System.out.println("Idade: " + metodoPegaIdade());

        System.out.println("O aluno: " + metodoPegaNome() + " tem " + metodoPegaIdade() + "anos.");
    }
}