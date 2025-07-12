package atividades.Contas;

// ContaConjunta.java
// Esta classe representa uma conta conjunta, herdando de Conta.

public class ContaConjunta extends Conta {

    /**
     * Construtor para criar uma Conta Conjunta.
     * @param saldoInicial O saldo inicial da conta conjunta.
     */
    public ContaConjunta(double saldoInicial) {
        super(saldoInicial); // Chama o construtor da classe pai (Conta)
        System.out.println("Conta Conjunta criada.");
    }

    /**
     * Implementação do método abstrato para exibir o tipo da conta.
     */
    @Override // Indica que este método está sobrescrevendo um método da classe pai
    public void exibirTipoConta() {
        System.out.println("Tipo de Conta: Conta Conjunta");
    }

    // Em um sistema real, uma Conta Conjunta teria mais lógica
    // para gerenciar múltiplos titulares, mas para o propósito de
    // demonstrar herança, esta estrutura é suficiente.
}

