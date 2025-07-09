Vamos refazer a aula de POO, mas agora com exemplos práticos e simples em **Java**. Os conceitos são os mesmos, mas a sintaxe e algumas nuances mudam.

-----

## O que é Programação Orientada a Objetos (POO) em Java?

A Programação Orientada a Objetos (POO) em Java segue o mesmo paradigma: organizar o código em **objetos** que combinam **dados** (atributos) e **comportamentos** (métodos). Java é uma linguagem puramente orientada a objetos, o que significa que praticamente tudo o que você faz em Java envolve classes e objetos.

Pense no Java como uma ferramenta que te ajuda a modelar o mundo real, criando "plantas" (classes) para construir "coisas" (objetos) que interagem entre si. Isso torna seu código mais organizado, fácil de entender, reutilizável e de dar manutenção.

-----

## Os 4 Pilares da POO em Java

Os 4 pilares são a base da POO em Java. Dominá-los é fundamental.

-----

### 1\. Encapsulamento

**Conceito:** O encapsulamento é a prática de **restringir o acesso direto aos dados (atributos)** de um objeto e permitir que eles sejam acessados e modificados apenas por meio de **métodos públicos** (getters e setters). Isso protege a integridade dos dados e esconde a complexidade interna do objeto.

**Analogia Simples:** Imagine seu celular. Você interage com ele usando os botões e a tela, mas não tem acesso direto aos chips, bateria ou circuitos internos. O celular **encapsula** sua complexidade, oferecendo uma interface simples para você usá-lo.

**Exemplo Prático (Java):**

Vamos criar uma classe `Carro` onde o atributo `combustivel` é encapsulado.

```java
// Carro.java
public class Carro {
    public String marca;
    public String modelo;
    private double combustivel; // Atributo privado (encapsulado)

    // Construtor
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = 50.0; // Valor inicial
    }

    // Método público para abastecer
    public void abastecer(double quantidade) {
        if (quantidade > 0) {
            this.combustivel += quantidade;
            System.out.println("Abastecido com " + quantidade + " litros. Combustível atual: " + String.format("%.2f", this.combustivel) + " litros.");
        } else {
            System.out.println("Quantidade de abastecimento inválida.");
        }
    }

    // Método público para dirigir
    public void dirigir(double distancia) {
        double consumo = distancia / 10.0; // Exemplo: 10 km por litro
        if (this.combustivel >= consumo) {
            this.combustivel -= consumo;
            System.out.println("Dirigiu " + distancia + " km. Combustível restante: " + String.format("%.2f", this.combustivel) + " litros.");
        } else {
            System.out.println("Combustível insuficiente para essa distância.");
        }
    }

    // Método getter para acessar o combustível (leitura)
    public double getCombustivel() {
        return this.combustivel;
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla");

        // Não podemos acessar 'combustivel' diretamente de fora
        // System.out.println(meuCarro.combustivel); // Isso causaria um erro de compilação

        // Usamos os métodos públicos para interagir
        meuCarro.dirigir(200);
        meuCarro.abastecer(30);
        meuCarro.dirigir(400);
        System.out.println("Combustível atual (via método): " + String.format("%.2f", meuCarro.getCombustivel()) + " litros.");
    }
}
```

Em Java, usamos os modificadores de acesso:

* `private`: O atributo/método só pode ser acessado dentro da própria classe. Isso é fundamental para o encapsulamento.
* `public`: O atributo/método pode ser acessado de qualquer lugar.

No exemplo, `combustivel` é `private`, e `abastecer()`, `dirigir()`, e `getCombustivel()` são `public`, permitindo uma interação controlada com o estado do carro.

-----

### [2\. Abstração](Abstracao)

**Conceito:** Abstração é o processo de **ocultar a complexidade dos detalhes de implementação** e mostrar apenas as funcionalidades essenciais. Em Java, isso é frequentemente alcançado usando **classes abstratas** e **interfaces**. Ela define "o que" um objeto faz, sem se preocupar com "como" ele faz.

**Analogia Simples:** Quando você usa um aplicativo de banco no seu celular, você vê opções como "consultar saldo" ou "fazer PIX". Você não precisa saber os milhares de linhas de código que rodam por trás para que essas operações funcionem. O aplicativo te oferece uma **abstração** das complexidades do sistema bancário.

**Exemplo Prático (Java):**

Vamos criar uma abstração para um `Animal` usando uma classe abstrata.

```java
// Animal.java (Classe Abstrata)
public abstract class Animal { // 'abstract' indica que é uma classe abstrata
    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    // Método abstrato: deve ser implementado pelas subclasses
    public abstract void fazerSom();

    // Método concreto: implementado na classe abstrata e herdado pelas subclasses
    public void comer() {
        System.out.println(this.nome + " está comendo.");
    }
}

// Cachorro.java
public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome); // Chama o construtor da superclasse
    }

    // Implementação do método abstrato fazerSom()
    @Override // Boa prática para indicar que o método está sendo sobrescrito
    public void fazerSom() {
        System.out.println("Au au!");
    }
}

// Gato.java
public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    // Implementação do método abstrato fazerSom()
    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}

// TesteAbstracao.java
public class TesteAbstracao {
    public static void main(String[] args) {
        // Animal animalGenerico = new Animal("Bicho"); // Erro: Não pode instanciar classe abstrata

        Cachorro rex = new Cachorro("Rex");
        Gato felix = new Gato("Felix");

        System.out.print(rex.nome + ": ");
        rex.fazerSom();
        rex.comer();

        System.out.print(felix.nome + ": ");
        felix.fazerSom();
        felix.comer();
    }
}
```

A classe `Animal` é **abstrata** porque contém o método `fazerSom()` que também é `abstract`. Isso significa que qualquer classe que herdar de `Animal` **DEVE** implementar seu próprio `fazerSom()`. A classe `Animal` define o comportamento básico ("um animal faz som" e "um animal come"), mas deixa os detalhes específicos do som para as subclasses.

-----

### 3\. Herança

**Conceito:** Herança é um mecanismo que permite que uma nova classe (chamada **subclasse** ou classe filha) **herde** atributos e métodos de uma classe existente (chamada **superclasse** ou classe pai). Isso promove a **reutilização de código** e estabelece uma relação "é um tipo de".

**Analogia Simples:** Pense em uma receita de bolo base. Você pode ter uma receita de "Bolo Simples" (superclasse) e depois criar variações como "Bolo de Chocolate" ou "Bolo de Cenoura" (subclasses) que herdam os passos básicos do "Bolo Simples" e adicionam seus próprios ingredientes e passos específicos.

**Exemplo Prático (Java):**

Continuando com o exemplo de `Animal`:

```java
// Animal.java (Superclasse / Classe Pai)
public class Animal {
    public String nome;
    public String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public void fazerSom() {
        System.out.println("Fazendo algum som...");
    }

    public void comer() {
        System.out.println(this.nome + " está comendo.");
    }
}

// Cachorro.java (Subclasse / Classe Filha)
public class Cachorro extends Animal { // 'extends' indica herança
    public String raca;

    public Cachorro(String nome, String raca) {
        super(nome, "Cachorro"); // Chama o construtor da superclasse
        this.raca = raca;
    }

    @Override // Indica que estamos sobrescrevendo um método da superclasse
    public void fazerSom() {
        System.out.println("Au au!");
    }

    public void latir() {
        System.out.println(this.nome + " está latindo: Au au!");
    }
}

// Gato.java (Subclasse / Classe Filha)
public class Gato extends Animal {
    public String corPelo;

    public Gato(String nome, String corPelo) {
        super(nome, "Gato");
        this.corPelo = corPelo;
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }

    public void arranhar() {
        System.out.println(this.nome + " está arranhando.");
    }
}

// TesteHeranca.java
public class TesteHeranca {
    public static void main(String[] args) {
        Cachorro bob = new Cachorro("Bob", "Labrador");
        Gato misty = new Gato("Misty", "Branco");

        System.out.println("--- Dados do Cachorro ---");
        System.out.println("Nome: " + bob.nome + ", Espécie: " + bob.especie + ", Raça: " + bob.raca);
        bob.fazerSom(); // Chama o método sobrescrito do Cachorro
        bob.comer();     // Chama o método herdado do Animal
        bob.latir();

        System.out.println("\n--- Dados do Gato ---");
        System.out.println("Nome: " + misty.nome + ", Espécie: " + misty.especie + ", Cor do Pelo: " + misty.corPelo);
        misty.fazerSom(); // Chama o método sobrescrito do Gato
        misty.comer();     // Chama o método herdado do Animal
        misty.arranhar();
    }
}
```

Em Java, a palavra-chave `extends` é usada para indicar que uma classe herda de outra. `super()` é usado para chamar o construtor da superclasse. O `@Override` é uma anotação que ajuda o compilador a verificar se você está realmente sobrescrevendo um método da superclasse.

-----

### 4\. Polimorfismo

**Conceito:** Polimorfismo significa "muitas formas". Em Java, ele permite que objetos de diferentes classes (que compartilham uma herança comum ou uma interface) sejam tratados como objetos de um tipo comum. Isso significa que você pode chamar o mesmo método em objetos de classes diferentes e obter comportamentos distintos, dependendo do tipo real do objeto.

**Analogia Simples:** Pense em um botão de "Imprimir" em um software. Se você tem um documento de texto, ele imprime texto. Se tem uma imagem, ele imprime uma imagem. O botão é o mesmo, a ação é "imprimir", mas o comportamento é **polimórfico** (muda) dependendo do tipo de arquivo.

**Exemplo Prático (Java):**

Continuando com o exemplo de `Animal` e suas subclasses.

```java
// Animal.java (Usamos a classe Animal do exemplo de Herança, não a abstrata,
// ou a abstrata com implementação, para simplificar o exemplo)
// Para este exemplo, usaremos a classe Animal definida para Herança,
// ou podemos voltar para a abstrata, garantindo que `fazerSom` seja implementado
// em todas as subclasses.

// Classe Animal (pode ser abstrata ou não, para polimorfismo, o importante
// é que as subclasses implementem o método 'fazerSom')
public class Animal {
    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom() {
        System.out.println("Fazendo algum som genérico...");
    }
}

// Cachorro.java
public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}

// Gato.java
public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}

// Pato.java
public class Pato extends Animal {
    public Pato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Quack!");
    }
}

// TestePolimorfismo.java
import java.util.ArrayList;
import java.util.List;

public class TestePolimorfismo {
    // Função que demonstra o polimorfismo
    public static void fazerAnimalFazerSom(Animal animal) {
        System.out.print(animal.nome + " faz: ");
        animal.fazerSom(); // O método chamado depende do tipo real do objeto
    }

    public static void main(String[] args) {
        // Criando objetos de diferentes tipos de animais
        Animal doguinho = new Cachorro("Buddy"); // Objeto Cachorro referenciado como Animal
        Animal gatinho = new Gato("Pérola");     // Objeto Gato referenciado como Animal
        Animal patinho = new Pato("Donald");     // Objeto Pato referenciado como Animal

        // Chamando a mesma função com diferentes tipos de objetos
        fazerAnimalFazerSom(doguinho);
        fazerAnimalFazerSom(gatinho);
        fazerAnimalFazerSom(patinho);

        System.out.println("\n--- Animais na fazenda ---");
        // Você também pode ter uma lista de animais e iterar sobre ela
        List<Animal> animaisNaFazenda = new ArrayList<>();
        animaisNaFazenda.add(new Cachorro("Max"));
        animaisNaFazenda.add(new Gato("Luna"));
        animaisNaFazenda.add(new Pato("Daisy"));

        for (Animal animal : animaisNaFazenda) {
            fazerAnimalFazerSom(animal);
        }
    }
}
```

Neste exemplo, a função `fazerAnimalFazerSom` aceita um parâmetro do tipo `Animal`. No entanto, quando chamamos `animal.fazerSom()`, Java utiliza o **polimorfismo** para determinar qual implementação específica de `fazerSom()` deve ser executada com base no **tipo real do objeto** (se é um `Cachorro`, `Gato` ou `Pato`). Isso permite escrever código mais genérico e flexível.

-----
