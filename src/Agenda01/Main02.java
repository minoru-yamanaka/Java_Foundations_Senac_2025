package Agenda01;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do contato:");
        String nome = scanner.nextLine();

        System.out.println("Digite o telefone do contato:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o email do contato:");
        String email = scanner.nextLine();

        Pessoa contato = new Pessoa(nome, telefone, email);

        System.out.println("\nContato cadastrado:");
        contato.exibirContato();

        scanner.close();
    }
}