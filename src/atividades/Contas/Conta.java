package atividades.Contas;

// Conta.java
// Esta é a classe abstrata base para todos os tipos de conta.

public abstract class Conta {
    protected double saldo; // O saldo da conta, protegido para acesso pelas classes filhas

    /**
     * Construtor para criar uma nova conta.
     * @param saldoInicial O saldo inicial da conta.
     */
    public Conta(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
            System.out.printf("Conta criada com sucesso! Saldo inicial: R$ %.2f\n", this.saldo);
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial não pode ser negativo. Conta criada com saldo R$ 0.00.");
        }
    }

    /**
     * Deposita um valor na conta. Este método é comum a todas as contas.
     * @param valor O valor a ser depositado.
     */
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso. Novo saldo: R$ %.2f\n", valor, this.saldo);
        } else {
            System.out.println("O valor para depósito deve ser positivo.");
        }
    }

    /**
     * Saca um valor da conta. Este método é comum a todas as contas,
     * mas pode ser sobrescrito por classes filhas se houver regras específicas.
     * @param valor O valor a ser sacado.
     * @return true se o saque foi bem-sucedido, false caso contrário.
     */
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor para saque deve ser positivo.");
            return false;
        }
        if (this.saldo >= valor) {
            this.saldo -= valor;
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

    /**
     * Método abstrato que deve ser implementado por cada subclasse
     * para exibir o tipo específico da conta.
     */
    public abstract void exibirTipoConta();

    public static void main(String[] args) {
        System.out.println();
    }
}
