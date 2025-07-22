package Encapsulamento02;

public class Pessoa {
    private String nome;
    private int idade;

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Setter do nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter da idade
    public int getIdade() {
        return idade;
    }

    // Setter da idade
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }
}
