package aula_10;

// A classe do João: A Caixa de Brinquedos Aberta
class CaixaDeBrinquedosDoJoao {
    // Este brinquedo é PÚBLICO! Qualquer um pode ver e pegar.
    public String brinquedoVisivel = "Carrinho Veloz";
    public int quantidadeBrinquedos = 10; // A quantidade também é pública

    // João pode brincar com seu brinquedo visível
    public void brincar() {
        System.out.println("João está brincando com o " + brinquedoVisivel);
    }
}

// A classe da Maria: O Cofre de Segredos
class CofreDeSegredosDaMaria {
    // Este segredo é PRIVADO! Só a Maria pode mexer nele.
    private String meuSegredo = "Meu unicórnio de pelúcia!";
    private int idadeMaria = 7; // A idade também é privada

    // Maria pode contar seu segredo (se ela quiser)
    public void contarSegredo() {
        System.out.println("Maria diz: 'Meu segredo é: " + meuSegredo + "'");
    }

    // Método PÚBLICO para "perguntar" a idade da Maria (Getter)
    public int qualSuaIdade() {
        return idadeMaria; // Maria decide te dizer a idade dela
    }

    // Método PÚBLICO para "mudar" a idade da Maria (Setter), mas com regra!
    public void mudarIdade(int novaIdade) {
        if (novaIdade > idadeMaria && novaIdade < 15) { // Maria só aceita idades que fazem sentido
            this.idadeMaria = novaIdade;
            System.out.println("Maria agora tem " + idadeMaria + " anos. Uhuu!");
        } else {
            System.out.println("Ops! Maria não quer ter " + novaIdade + " anos. Idade não mudou.");
        }
    }
}

// Classe principal para testar
public class ExemploPublicPrivate {
    public static void main(String[] args) {

        System.out.println("--- A Caixa de Brinquedos do João (PUBLIC) ---");
        CaixaDeBrinquedosDoJoao caixaJoao = new CaixaDeBrinquedosDoJoao();
        //CaixaDeBrinquedosDoJoao **caixaJoao2** = new CaixaDeBrinquedosDoJoao();
        //VARIÁVEL: caixaJoao QUE ESTÁ DENTRO DA
        //CLASSE: CaixaDeBrinquedosDoJoao
        //ASSIM CADA VEZ QU EU ADD UMA NOVA VAR PARA caixaJoao SE CRIA
        //INSTÂNCIA: new CaixaDeBrinquedosDoJoao()

        // Posso ver o brinquedo do João diretamente!
        System.out.println("Amigo vê: O brinquedo do João é um " + caixaJoao.brinquedoVisivel);

        // Posso até MUDAR o brinquedo do João diretamente!
        caixaJoao.brinquedoVisivel = "Avião de papel amassado";
        System.out.println("Amigo mudou para: " + caixaJoao.brinquedoVisivel);

        // João brinca com o que está na caixa dele agora
        caixaJoao.brincar();

        // Posso ver e mudar a quantidade de brinquedos também
        System.out.println("Quantidade de brinquedos do João: " + caixaJoao.quantidadeBrinquedos);
        caixaJoao.quantidadeBrinquedos = 5; // Ops, sumiram 5 brinquedos!
        System.out.println("Agora tem: " + caixaJoao.quantidadeBrinquedos);

        System.out.println("\n--- O Cofre de Segredos da Maria (PRIVATE) ---");
        CofreDeSegredosDaMaria cofreMaria = new CofreDeSegredosDaMaria();

        // Tentar ver o segredo da Maria diretamente? Não consigo! (Isso daria ERRO!)
        // System.out.println("Tentei ver o segredo: " + cofreMaria.meuSegredo); // Descomente para ver o erro!
        // Tentar mudar a idade da Maria diretamente? Não consigo! (Isso daria ERRO!)
        // cofreMaria.idadeMaria = 10; // Descomente para ver o erro!

        // A única forma de a Maria contar o segredo é se ELA quiser, usando o método público dela.
        cofreMaria.contarSegredo();

        // Para saber a idade da Maria, eu PERGUNTO a ela.
        System.out.println("Perguntei: 'Maria, qual sua idade?' Maria responde: " + cofreMaria.qualSuaIdade() + " anos.");

        // Para MUDAR a idade da Maria, eu PEÇO a ela para mudar, e ela decide se aceita a nova idade.
        cofreMaria.mudarIdade(8); // Maria aceita, pois faz sentido!
        cofreMaria.mudarIdade(4); // Maria não aceita, pois é mais nova do que já é
        cofreMaria.mudarIdade(20); // Maria não aceita, pois é muito velha!

        System.out.println("Idade final da Maria (perguntando novamente): " + cofreMaria.qualSuaIdade() + " anos.");
    }
}