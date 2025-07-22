package agenda;

public class Main01 {
    public static void main(String[] args) {
        // Criando um contato
        PessoaAgenda contato1 = new PessoaAgenda("Minoru Yamanaka", "11999999999", "minoru@email.com");
        // PessoaAgenda contato1 = new PessoaAgenda("paulo", "11999999999", "minoru@email.com");

        PessoaAgenda contato2 = new PessoaAgenda("Kazuo Yamanaka", "11999999999", "kazuo@email.com");
        // Pessoa contato3 = new Pessoa();


        // Exibindo os dados
        contato1.exibirContato();
        contato2.exibirContato();

        // Atualizando informações
        contato1.setNome("paulo");

        contato1.setTelefone("11988888888");
        contato1.setEmail("novoemail@email.com");

        System.out.println("\nContato atualizado:");
        contato1.exibirContato();
    }
}