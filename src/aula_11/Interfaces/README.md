### A Diferença entre a Interface e a Classe que a Implementa

A restrição de não ter atributos se aplica à **própria interface**, não às classes que a utilizam.

Pense de novo no nosso exemplo dos super-heróis:

```java
// A INTERFACE só define as ações (o "contrato")
interface SuperHeroi {
    void combaterMal(); // O que um SuperHerói deve ser capaz de fazer
    void salvarPessoas(); // Outra ação que um SuperHerói deve ser capaz de fazer
}

// A CLASSE que implementa a interface pode ter seus próprios atributos e comportamentos
class HomemDeFerro implements SuperHeroi {
    // ATRIBUTOS (estado) específicos do HomemDeFerro
    String nomeVerdadeiro;
    String corDaArmadura;
    int nivelDeTecnologia;

    // Construtor para inicializar os atributos do HomemDeFerro
    public HomemDeFerro(String nomeVerdadeiro, String corDaArmadura, int nivelDeTecnologia) {
        this.nomeVerdadeiro = nomeVerdadeiro;
        this.corDaArmadura = corDaArmadura;
        this.nivelDeTecnologia = nivelDeTecnologia;
    }

    // Implementação dos métodos definidos na interface SuperHeroi
    @Override
    public void combaterMal() {
        System.out.println(nomeVerdadeiro + " combatendo o mal com a armadura " + corDaArmadura + "!");
    }

    @Override
    public void salvarPessoas() {
        System.out.println(nomeVerdadeiro + " usando tecnologia avançada para salvar pessoas.");
    }

    // Um método próprio do HomemDeFerro, que não está na interface
    public void voar() {
        System.out.println(nomeVerdadeiro + " está voando!");
    }
}
```

-----

### Entendendo o Exemplo

Neste exemplo:

* A **interface `SuperHeroi`** continua sendo um contrato puro, sem **atributos de instância**. Ela define apenas as **ações** (`combaterMal()` e `salvarPessoas()`) que qualquer super-herói deve realizar.
* A **classe `HomemDeFerro`**, que **implementa** a interface `SuperHeroi`, é uma classe normal. Como qualquer classe, ela pode ter seus próprios **atributos** (`nomeVerdadeiro`, `corDaArmadura`, `nivelDeTecnologia`) para guardar o estado específico de cada objeto `HomemDeFerro`. Cada Homem de Ferro que você criar terá seu próprio nome, cor de armadura, etc.

-----

### Em Resumo

A regra é:

* **Interfaces**: Definem **comportamentos** (`o que fazer`). Elas são como uma "lista de afazeres" ou um "contrato de serviços". Elas não guardam **estado** (`que informações eu tenho`).
* **Classes que implementam interfaces**: Definem **como fazer** esses comportamentos (a implementação dos métodos da interface) e **podem ter seu próprio estado** (atributos) para guardar informações sobre seus objetos.

Isso faz sentido?