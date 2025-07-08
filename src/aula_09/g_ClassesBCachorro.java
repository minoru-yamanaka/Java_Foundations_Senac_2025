package aula_09;

public class g_ClassesBCachorro {
    // --- Atributos (Características) ---
    String nome; // O cachorro tem um nome
    String raca; // O cachorro tem uma raça
    int idade;   // O cachorro tem uma idade

    // --- Métodos (Comportamentos) ---

    // Método para o cachorro latir
    public void latir() {
        System.out.println(nome + " está latindo: Au! Au!");
    }

    // Método para o cachorro comer
    public void comer(String comida) { // Ele precisa de um "ingrediente": qual comida?
        System.out.println(nome + " está comendo " + comida + ".");
    }

    // Método para o cachorro fazer aniversário
    public void fazerAniversario() {
        idade++; // Aumenta a idade em 1
        System.out.println(nome + " fez aniversário! Agora tem " + idade + " anos.");
    }

    // Construtores
    public g_ClassesBCachorro(String nome, String raca, int idade){
        this.nome =  nome ;
        // O 'nome' à esquerda do '=' é o ATRIBUTO da classe
        // O 'nome' à direita do '=' é o PARÂMETRO
        this.raca = raca;
        this.idade = idade;

        // nome (sozinho): Geralmente se refere ao parâmetro (ou variável local) mais próximo com esse nome.
        // this.nome: Sempre se refere ao atributo da classe (a característica do objeto atual) com esse nome.
    }

    public static void main(String[] args ){
        g_ClassesBCachorro cachorro1 = new g_ClassesBCachorro("Mimi", "RSD", 15);
        cachorro1.latir();
        cachorro1.comer("Ração");
        cachorro1.fazerAniversario();
    }

}