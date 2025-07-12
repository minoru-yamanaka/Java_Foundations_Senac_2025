A interface `Transportavel` é um **contrato** que define o que as classes `Carro` e `Moto` **devem fazer** (transportar pessoas e carga), sem dizer como.

**Como foi usada:** `Carro` e `Moto` "assinaram" esse contrato (`implements Transportavel`) e, por isso, foram **obrigadas a criar** os métodos `transportarPessoas()` e `transportarCarga()` com suas próprias lógicas.

**Por que foi usada:**
1.  **Garante comportamento:** Obriga classes a terem certas funcionalidades.
2.  **Permite polimorfismo:** Trata objetos diferentes (`Carro`, `Moto`) de forma genérica como `Transportavel`.
3.  **Flexibilidade:** Facilita adicionar novos tipos de veículos que também transportam, sem mudar o código existente.
---

## Veículo vs. Transportável: A Diferença Crucial

Pense neles da seguinte forma:

### `Veiculo`: É um "O quê" (Categoria, Tipo)

* **`Veiculo` é uma CLASSE (superclasse).**
* Representa o que algo **É**. Um `Carro` **É UM** `Veiculo`. Uma `Moto` **É UM** `Veiculo`.
* Define características e comportamentos **comuns a todos os veículos**. Por exemplo: todo veículo tem uma `marca` e um `ano`, todo veículo pode `ligar()` e `desligar()`.
* É sobre a **natureza** do objeto.

### `Transportavel`: É um "Pode Fazer" (Capacidade, Habilidade)

* **`Transportavel` é uma INTERFACE.**
* Representa o que algo **PODE FAZER** ou que **TEM A CAPACIDADE** de fazer. Um `Carro` **PODE TRANSPORTAR**. Uma `Moto` **PODE TRANSPORTAR**. Um `Ônibus` **PODE TRANSPORTAR**.
* Define um **contrato de comportamento**. Qualquer coisa que seja `Transportavel` **deve saber** como `transportarPessoas()` e `transportarCarga()`. Não importa o que o objeto "é" (um carro, uma moto, um navio), importa que ele "pode" fazer isso.
* É sobre a **funcionalidade** ou **habilidade** do objeto.

---

### Resumindo:

* **`Veiculo` (Classe):** Define o **tipo principal** dos nossos objetos (são veículos). É a base que dá características e comportamentos fundamentais para todos eles. É uma relação de **"É UM"**.
* **`Transportavel` (Interface):** Define uma **habilidade específica** que certos veículos podem ter. Permite agrupar objetos que compartilham uma **capacidade**, mesmo que sejam de tipos diferentes na hierarquia de classes. É uma relação de **"PODE FAZER"**.

Você pode ter um `Veiculo` que não seja `Transportavel` (talvez um veículo de brinquedo). E, teoricamente, você poderia ter algo `Transportavel` que não seja um `Veiculo` (como uma `Mochila` que pode `transportarCarga`), embora não tenhamos exemplificado isso aqui.

Essa distinção entre "o que é" (classe/herança) e "o que pode fazer" (interface/implementação) é fundamental no desenvolvimento orientado a objetos e ajuda a criar sistemas mais flexíveis e modulares.