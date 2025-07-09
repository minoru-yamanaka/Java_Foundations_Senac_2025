Vamos explorar essas bibliotecas do Java com uma linguagem simples e exemplos práticos pra sua turma aplicar com tranquilidade. ✨

## 📦 Pacotes e `import`

- Pacotes são grupos de classes (como pastas organizadas).
- Para usar uma classe de outro pacote, você precisa usar `import`.

```java
import java.util.Random;                // Pacote java.util
import java.time.LocalDate;            // Pacote java.time
```

---

## 🧮 1. `Math` — Biblioteca de Matemática

**Importação**: Já está no pacote padrão `java.lang`, não precisa importar!

```java
double raiz = Math.sqrt(25);        // 5.0
int maior = Math.max(10, 20);       // 20
double aleatorio = Math.random();   // Valor entre 0.0 e 1.0
```

📌 *Dica*: Ideal para operações como potência, trigonometria, arredondamentos.

---

## 🎲 2. `Random` — Gerador de Números Aleatórios

**Importar**: `import java.util.Random;`

```java
Random r = new Random();
int dado = r.nextInt(6) + 1;   // Valor entre 1 e 6
boolean sorte = r.nextBoolean(); // true ou false
```

📌 *Dica*: Ótimo para jogos, sorteios e decisões aleatórias.

---

## ✂️ 3. `String` — Manipulação de Textos

**Importação**: Também no `java.lang`, já disponível!

```java
String nome = "Minoru";
System.out.println(nome.length());          // Tamanho: 6
System.out.println(nome.toUpperCase());     // "MINORU"
System.out.println(nome.charAt(0));         // 'M'
System.out.println(nome.contains("no"));    // true
```

📌 *Dica*: Use em validações, formatações de texto, buscas.

---

## 📅 4. `LocalDate` — Data sem hora

**Importar**: `import java.time.LocalDate;`

```java
LocalDate hoje = LocalDate.now();                  // Data atual
LocalDate futuro = hoje.plusDays(10);              // +10 dias
LocalDate aniversario = LocalDate.of(2025, 7, 15); // Data fixa
```

📌 *Dica*: Ideal pra registrar datas sem se preocupar com horas.

---

## 🕰️ 5. `DateTimeFormatter` — Formatador de Datas

**Importar**: `import java.time.format.DateTimeFormatter;`

```java
LocalDate hoje = LocalDate.now();
DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String dataFormatada = hoje.format(formato);   // "09/07/2025"
System.out.println(dataFormatada);
```

📌 *Dica*: Personaliza a aparência da data, útil pra exibir no padrão brasileiro.

---
