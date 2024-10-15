//Questão 3
import java.util.Scanner;

public class AnalisePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeSoma = 0, maisDe90kg = 0, entreAltura = 0;
        final int TOTAL_PESSOAS = 10;

        for (int i = 1; i <= TOTAL_PESSOAS; i++) {
            System.out.println("Pessoa " + i);
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();
            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();

            idadeSoma += idade;
            if (peso > 90 && altura < 1.60) maisDe90kg++;
            if (altura >= 1.80 && altura <= 1.90) entreAltura++;
        }

        System.out.println("\nMédia das idades: " + (idadeSoma / (double) TOTAL_PESSOAS));
        System.out.println("Total com mais de 90kg e menos de 1.60m: " + maisDe90kg);
        System.out.println("Percentual entre 1.80m e 1.90m: " + (entreAltura * 100.0 / TOTAL_PESSOAS) + "%");
    }
}
