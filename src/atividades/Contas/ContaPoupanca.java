package atividades.Contas;

// ContaPoupanca.java
// Esta classe representa uma conta poupança, herdando de Conta.

public class ContaPoupanca extends Conta {

    /**
     * Construtor para criar uma Conta Poupança.
     * @param saldoInicial O saldo inicial da conta poupança.
     */
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial); // Chama o construtor da classe pai (Conta)
        System.out.println("Conta Poupança criada.");
    }

    /**
     * Implementação do método abstrato para exibir o tipo da conta.
     */
    @Override // Indica que este método está sobrescrevendo um método da classe pai
    public void exibirTipoConta() {
        System.out.println("Tipo de Conta: Conta Poupança");
    }

    // Você poderia adicionar métodos específicos da Conta Poupança aqui,
    // como calcular rendimento, por exemplo.
    // Ex: public void calcularRendimento(double taxa) {
    //        this.saldo += this.saldo * taxa;
    //        System.out.printf("Rendimento aplicado. Novo saldo: R$ %.2f\n", this.saldo);
    //    }
}

