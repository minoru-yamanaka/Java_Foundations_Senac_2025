package encapsulamento;

public class Paciente {
    // Atributos privados: não podem ser acessados diretamente
    private String nome;
    private int idade;

    // Construtor
    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos públicos para acessar os atributos (getters)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Métodos públicos para modificar os atributos (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0) { // regra de validação
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }
}
