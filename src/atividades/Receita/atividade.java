package atividades.Receita;

public class atividade { // Nome da classe corrigido para "Atividade" (convenção PascalCase)

    // O método 'receita' deve ser 'void' porque ele executa ações (imprime)
    // e não retorna nenhum valor String.
    public static void receitaDeMacarronada() { // Renomeado o método para ser mais descritivo
        System.out.println("--- Receita de Macarronada Servida em um Prato ---");

        // Ingredientes
        String ingrediente1 = "1/2 Pacote de macarrão";
        String ingrediente2 = "1 pacote de molho de tomate";
        String ingrediente3 = "1 Litro de água";
        String ingrediente4 = "1 fio de óleo";
        String ingrediente5 = "1 colher de sal";
        String ingrediente6 = "1/4 de cebola";
        String ingrediente7 = "1 dente de alho";
        String ingrediente8 = "1 pacote de queijo ralado";

        // Utensílios
        String utensilio1 = "Fogão";
        String utensilio2 = "Panela";
        String utensilio3 = "Concha";
        String utensilio4 = "Escorredor";
        String utensilio5 = "Faca";
        String utensilio6 = "Prato";

        System.out.println("\nIngredientes Necessários:");
        System.out.println("- " + ingrediente1);
        System.out.println("- " + ingrediente2);
        System.out.println("- " + ingrediente3);
        System.out.println("- " + ingrediente4);
        System.out.println("- " + ingrediente5);
        System.out.println("- " + ingrediente6);
        System.out.println("- " + ingrediente7);
        System.out.println("- " + ingrediente8);

        System.out.println("\nUtensílios Necessários:");
        System.out.println("- " + utensilio1);
        System.out.println("- " + utensilio2);
        System.out.println("- " + utensilio3);
        System.out.println("- " + utensilio4);
        System.out.println("- " + utensilio5);
        System.out.println("- " + utensilio6);


        System.out.println("\n--- Modo de Preparo ---");

        System.out.println("1 - Pegar o " + utensilio1 + " e a " + utensilio2 + ".");
        System.out.println("2 - Colocar " + ingrediente3 + " na " + utensilio2 + ".");
        System.out.println("3 - Adicionar um " + ingrediente4 + " na " + utensilio2 + ".");
        System.out.println("4 - Adicionar uma " + ingrediente5 + " na " + utensilio2 + ".");
        System.out.println("5 - Ligar o " + utensilio1 + ".");
        System.out.println("6 - Colocar a " + utensilio2 + " no " + utensilio1 + " até a água ferver.");
        System.out.println("7 - Com a " + utensilio5 + ", cortar a cebola (" + ingrediente6 + ") e o alho (" + ingrediente7 + ").");
        System.out.println("8 - Quando a água ferver, adicionar o " + ingrediente1 + " na " + utensilio2 + ".");
        System.out.println("9 - Aguardar o cozimento do macarrão até ficar 'al dente'.");
        System.out.println("10 - Desligar o " + utensilio1 + ".");
        System.out.println("11 - Escorrer o macarrão usando o " + utensilio4 + ".");
        System.out.println("12 - Colocar o macarrão escorrido no " + utensilio6 + ".");

        System.out.println("\n--- Preparando o Molho ---");
        System.out.println("13 - Ligar novamente o " + utensilio1 + ".");
        System.out.println("14 - Colocar a " + utensilio2 + " (limpa) no " + utensilio1 + ".");
        System.out.println("15 - Adicionar um " + ingrediente4 + " na " + utensilio2 + ".");
        System.out.println("16 - Refogar a cebola picada na " + utensilio2 + ".");
        System.out.println("17 - Adicionar e refogar o alho picado na " + utensilio2 + ".");
        // Corrigido: Adicionar o molho de tomate, não o macarrão novamente
        System.out.println("18 - Adicionar o " + ingrediente2 + " (molho de tomate) na " + utensilio2 + ".");
        System.out.println("19 - Esperar o molho ferver, mexendo ocasionalmente.");
        System.out.println("20 - Desligar o " + utensilio1 + ".");

        System.out.println("\n--- Finalização ---");
        System.out.println("21 - Adicionar uma " + utensilio3 + " do molho no " + utensilio6 + " de macarrão.");
        System.out.println("22 - Se desejar, polvilhar com " + ingrediente8 + ".");
        System.out.println("\nBom apetite!");
    }

    public static void main(String[] args) {
        // Chamada direta do método, pois ele não retorna valor.
        receitaDeMacarronada();
    }
}