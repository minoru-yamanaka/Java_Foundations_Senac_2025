package interfaces;

// Classe principal de teste
public class Main {
    public static void main(String[] args) {
        // Criando os objetos

        Medico pediatra = new Pediatra();
        Medico cardiologista = new Cardiologista();
        Medico dermatologista = new Dermatologista();

        // Usando os métodos da interface e da classe abstrata
        pediatra.imprimirEspecialidade();
        pediatra.atenderPaciente();

        cardiologista.imprimirEspecialidade();
        cardiologista.atenderPaciente();

        dermatologista.imprimirEspecialidade();
        dermatologista.atenderPaciente();
    }
}

