package aula_11.Interfaces;
// https://www.youtube.com/watch?v=2bZl62vNU0A&t=10s
public class Main {
    public static void main(String[] args){

        System.out.println("Aula de interfaces!");
        Gato g = new Gato("Tereza", "tigrada");
        g.fazerSom();
        g.fazerSom("comer");

        Cachorro c = new Cachorro("Totó", 15);
        c.fazerSom();
        c.fazerSom("Totó", 15);

    }
}
