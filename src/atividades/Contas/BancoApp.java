package atividades.Contas;
// BancoApp.java
// Esta é a classe principal que demonstra o uso das diferentes contas.

import java.util.InputMismatchException; // Importa a classe para tratar exceções de entrada de dados inválida
import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class BancoApp { // Declaração da classe principal BancoApp

    public static void main(String[] args) { // Método principal de execução do programa
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do console

        System.out.println("--- Demonstração de Herança e Classes Abstratas ---"); // Imprime um cabeçalho para a demonstração

        // Criando instâncias das diferentes contas
        // Note que estamos usando o tipo 'Conta' para as variáveis,
        // mas instanciando as subclasses. Isso é polimorfismo.
        Conta contaCorrente = new ContaCorrente(500.00); // Cria uma nova ContaCorrente com saldo inicial de R$ 500.00
        Conta contaPoupanca = new ContaPoupanca(1500.00); // Cria uma nova ContaPoupanca com saldo inicial de R$ 1500.00
        Conta contaConjunta = new ContaConjunta(2000.00); // Cria uma nova ContaConjunta com saldo inicial de R$ 2000.00

        // Demonstração de métodos comuns (herdados da classe Conta)
        System.out.println("\n--- Operações Comuns ---"); // Imprime um cabeçalho para as operações comuns

        // Depositar em Conta Corrente
        contaCorrente.exibirTipoConta(); // Chama o método específico da subclasse para exibir o tipo de conta
        contaCorrente.depositar(100.00); // Chama o método depositar da ContaCorrente
        System.out.printf("Saldo atual da Conta Corrente: R$ %.2f\n", contaCorrente.getSaldo()); // Exibe o saldo atual da ContaCorrente

        System.out.println("\n"); // Imprime uma linha em branco para espaçamento

        // Sacar de Conta Poupança
        contaPoupanca.exibirTipoConta(); // Chama o método específico da subclasse para exibir o tipo de conta
        contaPoupanca.sacar(200.00); // Chama o método sacar da ContaPoupanca
        System.out.printf("Saldo atual da Conta Poupança: R$ %.2f\n", contaPoupanca.getSaldo()); // Exibe o saldo atual da ContaPoupanca

        System.out.println("\n"); // Imprime uma linha em branco para espaçamento

        // Operações na Conta Conjunta
        contaConjunta.exibirTipoConta(); // Chama o método específico da subclasse para exibir o tipo de conta
        contaConjunta.depositar(50.00); // Chama o método depositar da ContaConjunta
        contaConjunta.sacar(2500.00); // Tenta sacar um valor maior que o saldo da ContaConjunta
        System.out.printf("Saldo atual da Conta Conjunta: R$ %.2f\n", contaConjunta.getSaldo()); // Exibe o saldo atual da ContaConjunta

        System.out.println("\n--- Interação com o Usuário (Exemplo com Conta Corrente) ---"); // Imprime um cabeçalho para a interação do usuário

        // Exemplo de interação com o usuário para uma das contas (Conta Corrente)
        int opcao; // Declara uma variável para armazenar a opção do usuário
        do { // Inicia um loop do-while para o menu de interação
            System.out.println("\n--- Menu da Conta Corrente ---"); // Imprime o cabeçalho do menu
            System.out.println("1. Depositar"); // Opção para depositar
            System.out.println("2. Sacar"); // Opção para sacar
            System.out.println("3. Ver Saldo"); // Opção para ver o saldo
            System.out.println("4. Sair do Menu da Conta Corrente"); // Opção para sair do menu
            System.out.print("Escolha uma opção: "); // Solicita que o usuário escolha uma opção

            try { // Inicia um bloco try-catch para tratamento de exceções
                opcao = scanner.nextInt(); // Lê a opção inteira digitada pelo usuário

                switch (opcao) { // Inicia uma estrutura switch para lidar com as opções
                    case 1: // Caso a opção seja 1 (Depositar)
                        System.out.print("Digite o valor para depositar: R$ "); // Solicita o valor do depósito
                        double valorDeposito = scanner.nextDouble(); // Lê o valor do depósito
                        contaCorrente.depositar(valorDeposito); // Chama o método depositar da conta corrente
                        break; // Sai do switch
                    case 2: // Caso a opção seja 2 (Sacar)
                        System.out.print("Digite o valor para sacar: R$ "); // Solicita o valor do saque
                        double valorSaque = scanner.nextDouble(); // Lê o valor do saque
                        contaCorrente.sacar(valorSaque); // Chama o método sacar da conta corrente
                        break; // Sai do switch
                    case 3: // Caso a opção seja 3 (Ver Saldo)
                        System.out.printf("Seu saldo atual na Conta Corrente é: R$ %.2f\n", contaCorrente.getSaldo()); // Exibe o saldo atual
                        break; // Sai do switch
                    case 4: // Caso a opção seja 4 (Sair)
                        System.out.println("Saindo do menu da Conta Corrente."); // Informa que está saindo
                        break; // Sai do switch
                    default: // Caso a opção seja inválida
                        System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4."); // Informa que a opção é inválida
                }
            } catch (InputMismatchException e) { // Captura a exceção se a entrada não for um número
                System.out.println("Entrada inválida. Por favor, digite um número para a opção."); // Informa sobre a entrada inválida
                scanner.next(); // Limpa o buffer do scanner para evitar loop infinito
                opcao = 0; // Define opcao como 0 para continuar o loop do-while
            } catch (Exception e) { // Captura outras exceções inesperadas
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage()); // Informa sobre o erro inesperado
                opcao = 0; // Define opcao como 0 para continuar o loop do-while
            }

        } while (opcao != 4); // O loop continua enquanto a opção não for 4 (Sair)

        scanner.close(); // Fecha o objeto Scanner para liberar recursos
        System.out.println("\nDemonstração concluída."); // Imprime uma mensagem de conclusão da demonstração
    }
}
