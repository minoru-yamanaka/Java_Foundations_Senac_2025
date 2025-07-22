package ContaBancaria;

public class Main {
    public static void main(String[] args) {
        // Criando uma nova conta
        Conta conta = new Conta("Minoru Yamanaka", 12345, 1000.00);

        // Alterando o saldo usando o setter
        conta.setSaldo(conta.getSaldo() + 500.00); // depósito de 500

        // Imprimindo os dados da conta
        conta.imprimirDados();
    }
}
