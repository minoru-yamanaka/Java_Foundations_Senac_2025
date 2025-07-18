# Aula 04 parte 01

```java
    public class ConversorTemperatura {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                // Entrada
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
        
                // Conversões
                double fahrenheit = (celsius * 9 / 5) + 32;
                double kelvin = celsius + 273.15;
        
                // Saída
                System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
                System.out.println("Temperatura em Kelvin: " + kelvin + " K");
        
                scanner.close();
            }
        }   
```

### 🧠 O que significa `Scanner scanner = new Scanner(System.in);`

Esse comando cria um **objeto da classe `Scanner`**, que serve para **ler dados digitados pelo usuário no teclado**.

- `Scanner` é uma classe da biblioteca Java que permite capturar entradas (como números, textos etc.).
- `System.in` indica que a entrada virá do **teclado** (entrada padrão do sistema).
- `scanner` é o nome que você deu para esse objeto, e com ele você pode usar métodos como `.nextDouble()`, `.nextLine()`, `.nextInt()` etc.

🔍 É como se você estivesse dizendo:  
_"Ei Java, prepare-se para ouvir o que o usuário vai digitar!"_

---

### 🌡️ O que significa `double celsius = scanner.nextDouble();`

Esse comando faz duas coisas:

1. **Espera o usuário digitar um número com casas decimais** (como 25.5).
2. **Armazena esse número na variável `celsius`**, que será usada depois para conversão.

- `nextDouble()` é um método do `Scanner` que lê um número do tipo `double`.
- Se o usuário digitar, por exemplo, `30.0`, esse valor será guardado na variável `celsius`.

---

### 🖨️ Maneiras de dar "imprint" (mostrar algo na tela)

Você pode usar o `System.out.println()` para imprimir informações no console. Aqui vão algumas variações:

```java
System.out.println("Olá, mundo!"); // Imprime texto simples
System.out.print("Digite seu nome: "); // Imprime sem pular linha
System.out.printf("Temperatura: %.2f °C\n", celsius); // Imprime com formatação
```

📌 Dica:
- `println` → imprime e pula para a próxima linha.
- `print` → imprime e continua na mesma linha.
- `printf` → imprime com formatação (como casas decimais, alinhamento etc.).

