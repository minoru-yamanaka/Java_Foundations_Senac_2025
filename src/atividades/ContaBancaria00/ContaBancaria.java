package atividades.ContaBancaria00;

// ContaBancaria.java
// Esta classe representa uma conta bancária simples.

public class ContaBancaria {
    private static double saldo; // O saldo da conta, mantido como privado para encapsulamento

    /**
     * Construtor para criar uma nova conta bancária.
     * @param saldoInicial O saldo inicial da conta.
     */
    public ContaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
            System.out.printf("Conta criada com sucesso! Saldo inicial: R$ %.2f\n", this.saldo);
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial não pode ser negativo. Conta criada com saldo R$ 0.00.");
        }
    }

    /**
     * Deposita um valor na conta.
     *
     * @param valor O valor a ser depositado.
     * @return
     */
    public double depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor; // Adiciona o valor ao saldo
            System.out.printf("Depósito de R$ %.2f realizado com sucesso. Novo saldo: R$ %.2f\n", valor, this.saldo);
        } else {
            System.out.println("O valor para depósito deve ser positivo.");
        }
        return valor;
    }

    /**
     * Saca um valor da conta.
     * @param valor O valor a ser sacado.
     * @return true se o saque foi bem-sucedido, false caso contrário.
     */
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor para saque deve ser positivo.");
            return false;
        }
        if (this.saldo >= valor) { // Verifica se há saldo suficiente
            this.saldo -= valor; // Subtrai o valor do saldo
            System.out.printf("Saque de R$ %.2f realizado com sucesso. Novo saldo: R$ %.2f\n", valor, this.saldo);
            return true;
        } else {
            System.out.printf("Saldo insuficiente. Saldo atual: R$ %.2f. Valor solicitado: R$ %.2f\n", this.saldo, valor);
            return false;
        }
    }

    /**
     * Retorna o saldo atual da conta.
     * @return O saldo atual.
     */
    public double getSaldo() {
        return this.saldo;
    }

    public static void main(String[] args) {
        System.out.println(saldo);
        ContaBancaria Conta001 = new ContaBancaria(100);
        System.out.println( Conta001.depositar(100) );
        System.out.println( Conta001.sacar(55.5) );
        System.out.println(Conta001.getSaldo());
        System.out.println( Conta001.sacar(200) );
    }
}
