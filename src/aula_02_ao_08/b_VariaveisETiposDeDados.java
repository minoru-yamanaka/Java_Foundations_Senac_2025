package aula_02_ao_08;//Variáveis e Tipos de Dados Básicos
//Variáveis são contêineres para armazenar dados. Em Java, toda variável deve ter um tipo de dado definido.
//
//Tipos de Dados Primitivos Comuns:
//int: Para números inteiros (ex: 10, -5, 1000).
//double: Para números de ponto flutuante (com casas decimais) (ex: 3.14, 0.5, -2.7).
//boolean: Para valores verdadeiros ou falsos (ex: true, false).
//char: Para um único caractere (ex: 'A', 'b', '7').
//String: Para sequências de caracteres (textos) (ex: "Hello", "Java é legal!").
// Note que String é uma classe, não um tipo primitivo, mas é usada com muita frequência.

public class b_VariaveisETiposDeDados {
    public static void main(String[] args) {
        // Declarando e inicializando variáveis
        int idade = 30;
        double preco = 19.99;
        boolean isJavaFun = true;
        char primeiraLetra = 'J';
        String saudacao = "Olá, Programador!";

        // Imprimindo os valores das variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Preço: " + preco);
        System.out.println("Java é divertido? " + isJavaFun);
        System.out.println("Primeira letra: " + primeiraLetra);
        System.out.println("Saudação: " + saudacao);

        // Modificando uma variável
        idade = 31;
        System.out.println("Nova idade: " + idade);
    }
}