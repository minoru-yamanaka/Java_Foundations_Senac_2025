package ContaBancaria;

// Interface que define o comportamento de uma agência
interface Agencia {
    void imprimirDados();
}

// Classe Conta que implementa a interface Agencia
public class Conta implements Agencia {
    private String titular;
    private int numero;
    private double saldo;

    // Construtor
    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    // Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método da interface
    @Override
    public void imprimirDados() {
        System.out.println("=== Dados da Conta ===");
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
    }
}
