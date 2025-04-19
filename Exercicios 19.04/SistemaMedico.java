import java.util.ArrayList;

class Medico {
    String nome;
    String especialidade;

    
}

class Paciente {
    String nome;
    int idade;

    
}

public class SistemaMedico {
    public static void main(String[] args) {
        ArrayList<Medico> medicos = new ArrayList<>();
        ArrayList<Paciente> pacientes = new ArrayList<>();

        
        medicos.add(new Medico("Dr. João", "Cardiologia"));
        pacientes.add(new Paciente("Maria", 30));

        
        System.out.println("Médicos cadastrados: " + medicos.size());
        System.out.println("Pacientes cadastrados: " + pacientes.size());
    }
}
