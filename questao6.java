//Questão 6
import java.util.ArrayList;
import java.util.Scanner;

class Paciente {
    String nome;
    int idade;
    String cpf;

    public Paciente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf;
    }
}

public class CadastroPacientes {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos pacientes deseja cadastrar? ");
        int total = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < total; i++) {
            System.out.println("Paciente " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            pacientes.add(new Paciente(nome, idade, cpf));
        }

        System.out.println("\nPacientes cadastrados:");
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }
}
