package Agenda01;

public class Main01 {
    public static void main(String[] args) {
        // Criando um contato
        Pessoa contato1 = new Pessoa("Minoru", "11999999999", "minoru@email.com");

        // Exibindo os dados
        contato1.exibirContato();

        // Atualizando informações
        contato1.setTelefone("11988888888");
        contato1.setEmail("novoemail@email.com");

        System.out.println("\nContato atualizado:");
        contato1.exibirContato();

        Pessoa contato2 = new Pessoa("Minoru", "11999999999", "minoru@email.com");
    }
}