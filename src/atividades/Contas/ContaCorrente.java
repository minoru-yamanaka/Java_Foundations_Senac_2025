package atividades.Contas;

// ContaCorrente.java
// Esta classe representa uma conta corrente, herdando de Conta.

public class ContaCorrente extends Conta {

    /**
     * Construtor para criar uma Conta Corrente.
     * @param saldoInicial O saldo inicial da conta corrente.
     */
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial); // Chama o construtor da classe pai (Conta)
        System.out.println("Conta Corrente criada.");
    }

    /**
     * Implementação do método abstrato para exibir o tipo da conta.
     */
    @Override // Indica que este método está sobrescrevendo um método da classe pai
    public void exibirTipoConta() {
        System.out.println("Tipo de Conta: Conta Corrente");
    }

    // Você poderia adicionar métodos específicos da Conta Corrente aqui,
    // como limite de cheque especial, por exemplo.
    // Ex: private double limiteChequeEspecial;
    // Ex: public void setLimiteChequeEspecial(double limite) { ... }
}

