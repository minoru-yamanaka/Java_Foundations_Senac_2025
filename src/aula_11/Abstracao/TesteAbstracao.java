package aula_11.Abstracao;

public class TesteAbstracao {
    public static void main(String[] args) {
        // Remover os imports desnecessários
        Cachorro rex = new Cachorro("Rex");  // Sem aula_11.
        Gato felix = new Gato("Felix");      // Sem aula_11.

        System.out.print(rex.nome + ": ");
        rex.fazerSom();
        rex.comer();

        System.out.print(felix.nome + ": ");
        felix.fazerSom();
        felix.comer();
    }
}