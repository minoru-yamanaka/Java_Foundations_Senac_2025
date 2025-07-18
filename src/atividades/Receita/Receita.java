package atividades.Receita;
public class Receita {


        // Retorna a lista de ingredientes
        public static String ingredientes() {
            String ingrediente01 = "Ovo";
            String ingrediente02 = "Água fervendo";
            return "Para fazer o " + ingrediente01 + " frito preciso de " + ingrediente02;
        }

        // Descreve as ações a serem feitas com os ingredientes
        public static String acoes01() {
            return "1. Quebre o ovo em uma frigideira.";
        }

        public static String acoes02() {
            return "2. Adicione um pouco de óleo.";
        }

        public static String acoes03() {
            return "3. Frite até dourar.";
        }

        public static String acoes04() {
            System.out.println();
            return "4. Sirva quente.";
        }

    public static void main(String[] args) {
        // Chamada dos métodos
        System.out.println(acoes01());
        System.out.println(acoes02());
        System.out.println(acoes03());
        System.out.println(acoes04());

    }



}

