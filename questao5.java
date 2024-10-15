//Questão 5

import java.util.ArrayList;
import java.util.Scanner;

class Medico {
    String nome;
    String especialidade;
    String crm;

    public Medico(String nome, String especialidade, String crm) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Especialidade: " + especialidade + ", CRM: " + crm;
    }
}

public class CadastroMedicos {
    public static void main(String[] args) {
        ArrayList<Medico> medicos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos médicos deseja cadastrar? ");
        int total = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < total; i++) {
            System.out.println("Médico " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Especialidade: ");
            String especialidade = scanner.nextLine();
            System.out.print("CRM: ");
            String crm = scanner.nextLine();
            medicos.add(new Medico(nome, especialidade, crm));
        }

        System.out.println("\nMédicos cadastrados:");
        for (Medico medico : medicos) {
            System.out.println(medico);
        }
    }
}
