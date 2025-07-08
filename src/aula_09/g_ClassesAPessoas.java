package aula_09;

public class g_ClassesAPessoas {
    // Atributos (características)
    String nome;
    int idade;

    // Construtor (método especial para criar o objeto)
    public g_ClassesAPessoas(String nomeInformado, int idadeInformada) {
        nome = nomeInformado;
        idade = idadeInformada;
    }

    // Método (ação que a pessoa pode fazer)
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    // Método principal
    public static void main(String[] args) {
        // Criando um objeto do tipo Pessoa
        g_ClassesAPessoas p1 = new g_ClassesAPessoas("Minoru", 25);

        // Chamando um método do objeto
        p1.apresentar();
    }
}

// 🧠 Resumo em linguagem do dia a dia:
//| Conceito   | Como entender                                    |
//| ---------- | ------------------------------------------------ |
//| Classe     | É o molde para criar objetos                     |
//| Atributo   | É o que a coisa tem (ex: nome, idade)            |
//| Construtor | É como montar o objeto                           |
//| Método     | É o que ele faz (ex: se apresentar)              |
//| Objeto     | É a coisa criada (ex: uma pessoa chamada Minoru) |
//| --------------------------------------------------------- |
//🧱 CLASSE — o molde
//Imagine que você quer criar várias pessoas no seu programa.
//Então, você faz um molde chamado Pessoa, que diz:
//Toda pessoa tem nome e idade,
//E pode se apresentar.
//👉 Em Java, esse molde é chamado de classe.
//| --------------------------------------------------------- |
//🧩 ATRIBUTOS — as características
//Agora que você tem o molde, precisa dizer o que cada pessoa vai ter.
//👉 Os atributos são essas características, como nome e idade.
//| --------------------------------------------------------- |
//🧰 CONSTRUTOR — a forma de montar
//Quando você cria uma nova pessoa, precisa dar os valores iniciais (nome e idade).
//👉 O construtor é o que monta esse objeto com os dados certos.
//| --------------------------------------------------------- |
//⚙️ MÉTODO — o que ela pode fazer
//Agora que a pessoa foi criada, ela pode fazer algo. Por exemplo, se apresentar.
//👉 Isso é um método.