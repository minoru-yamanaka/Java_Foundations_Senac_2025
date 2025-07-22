package agenda;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        do {
            System.out.print("Digite o nome do contato: ");
            nome = scanner.nextLine().trim();
            if (nome.isEmpty()) {
                System.out.println("Nome não pode ser vazio. Tente novamente.");
            }
        } while (nome.isEmpty());

        String telefone;
        do {
            System.out.print("Digite o telefone do contato (somente números): ");
            telefone = scanner.nextLine().trim();

            boolean telefoneValido = true;
            if (telefone.length() < 10 || telefone.length() > 11) {
                telefoneValido = false;
            } else {
                for (int i = 0; i < telefone.length(); i++) {
                    if (!Character.isDigit(telefone.charAt(i))) {
                        telefoneValido = false;
                        break;
                    }
                }
            }

            if (!telefoneValido) {
                System.out.println("Telefone inválido! Deve conter apenas números e ter entre 10 e 11 dígitos.");
            }

        } while (telefone.length() < 10 || telefone.length() > 11 || !telefone.chars().allMatch(Character::isDigit));

        String email;
        do {
            System.out.print("Digite o email do contato: ");
            email = scanner.nextLine().trim();

            boolean emailValido = email.contains("@") && email.contains(".") && email.indexOf('@') < email.lastIndexOf('.');

            if (!emailValido) {
                System.out.println("Email inválido! Tente novamente.");
            }

        } while (!(email.contains("@") && email.contains(".") && email.indexOf('@') < email.lastIndexOf('.')));

        PessoaAgenda contato = new PessoaAgenda(nome, telefone, email);

        System.out.println("\nContato cadastrado com sucesso:");
        contato.exibirContato();

        scanner.close();
    }
}
