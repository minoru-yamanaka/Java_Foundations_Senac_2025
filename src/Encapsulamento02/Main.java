package Encapsulamento02;

public class Main {
    public static void main(String[] args) {
        //
        Pessoa p1 = new Pessoa();
        p1.setNome("ana teste");
        p1.setIdade(25);
        //
        Pessoa p2= new Pessoa();
        p2.setNome("Minoru");
        p2.setIdade(25);
        //

        //
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
    }
}


