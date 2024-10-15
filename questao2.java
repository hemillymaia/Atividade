// Questão 2
import java.util.Scanner;

public class MenuMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Média Aritmética");
            System.out.println("2. Média Ponderada");
            System.out.println("3. Sair");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite duas notas: ");
                    double nota1 = scanner.nextDouble();
                    double nota2 = scanner.nextDouble();
                    double mediaAritmetica = (nota1 + nota2) / 2;
                    System.out.println("Média Aritmética: " + mediaAritmetica);
                    break;
                case 2:
                    System.out.print("Digite três notas e seus respectivos pesos: ");
                    double n1 = scanner.nextDouble();
                    double p1 = scanner.nextDouble();
                    double n2 = scanner.nextDouble();
                    double p2 = scanner.nextDouble();
                    double n3 = scanner.nextDouble();
                    double p3 = scanner.nextDouble();
                    double mediaPonderada = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
                    System.out.println("Média Ponderada: " + mediaPonderada);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }
}
