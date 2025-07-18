package interfaces;

// Interface que define comportamento comum a todos os médicos
interface CRM {
    void imprimirEspecialidade(); // método que imprime a especialidade do médico
}

// Superclasse abstrata que implementa a interface
abstract class Medico implements CRM {
    public void atenderPaciente() {
        System.out.println("Médico atendendo paciente.");
    }
}

// Subclasse Pediatra
class Pediatra extends Medico {
    @Override
    public void imprimirEspecialidade() {
        System.out.println("Especialidade: Pediatria");
    }
}

// Subclasse Cardiologista
class Cardiologista extends Medico {
    @Override
    public void imprimirEspecialidade() {
        System.out.println("Especialidade: Cardiologia");
    }
}

// Subclasse Dermatologista
class Dermatologista extends Medico {
    @Override
    public void imprimirEspecialidade() {
        System.out.println("Especialidade: Dermatologia");
    }
}

//// Classe principal de teste
//public class Main {
//    public static void main(String[] args) {
//        // Criando os objetos
//        Medico pediatra = new Pediatra();
//        Medico cardiologista = new Cardiologista();
//        Medico dermatologista = new Dermatologista();
//
//        // Usando os métodos da interface e da classe abstrata
//        pediatra.imprimirEspecialidade();
//        pediatra.atenderPaciente();
//
//        cardiologista.imprimirEspecialidade();
//        cardiologista.atenderPaciente();
//
//        dermatologista.imprimirEspecialidade();
//        dermatologista.atenderPaciente();
//    }
//}
//
