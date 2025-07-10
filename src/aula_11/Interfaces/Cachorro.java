package aula_11.Interfaces;

public class Cachorro implements Animal{
    String nome = "";

    public Cachorro(String nome, int idade) {
    }

    @Override
    public void fazerSom(){
        System.out.println("O cachorro late");
    }

    public void fazerSom(String nome, int idade){
        System.out.println("O "+nome+ " tem "+idade+"anos");
    }
}
