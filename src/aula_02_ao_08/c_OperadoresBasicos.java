package aula_02_ao_08;//Operadores Básicos
//Operadores são símbolos que realizam operações em variáveis e valores.
//Operadores Aritméticos:
//        + (Adição)
//        - (Subtração)
//        * (Multiplicação)
//        / (Divisão)
//        % (Módulo - retorna o resto da divisão)

//Operadores de Comparação (retornam boolean):
//        == (Igual a)
//        != (Diferente de)
//        > (Maior que)
//        < (Menor que)
//        >= (Maior ou igual a)
//        <= (Menor ou igual a)

//Operadores Lógicos:
//        && (E lógico)
//        || (Ou lógico)
//        ! (Não lógico)


public class c_OperadoresBasicos {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Aritméticos
        System.out.println("a + b = " + (a + b)); // 15
        System.out.println("a - b = " + (a - b)); // 5
        System.out.println("a * b = " + (a * b)); // 50
        System.out.println("a / b = " + (a / b)); // 2
        System.out.println("a % b = " + (a % b)); // 0

        // Comparação
        System.out.println("a > b? " + (a > b));   // true
        System.out.println("a == b? " + (a == b)); // false

        // Lógicos
        boolean condicao1 = (a > 8);   // true
        boolean condicao2 = (b < 3);   // false
        System.out.println("condicao1 && condicao2: " + (condicao1 && condicao2)); // false
        System.out.println("condicao1 || condicao2: " + (condicao1 || condicao2)); // true
        System.out.println("!condicao1: " + (!condicao1)); // false
    }
}