package aula_11.Interfaces;

public class Gato implements Animal {

    public Gato (String nome, String tipo){
    }

    @Override
    public void fazerSom(){
        System.out.println("O gato faz miau!");
    }

    public void fazerSom(String gosta){
        System.out.println("O gato gosta de "+gosta+"!");
    }
}

