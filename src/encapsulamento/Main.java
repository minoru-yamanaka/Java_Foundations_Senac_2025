package encapsulamento;

public class Main {
    public static void main(String[] args) {
        Paciente p = new Paciente("Maria", 30);

        System.out.println(p.getNome()); // Maria
        System.out.println(p.getIdade()); // 30

        p.setIdade(-5); // "Idade inválida!" – proteção via encapsulamento
    }
}