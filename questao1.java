//Questão 1

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AudienciaCanais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> audiencias = new HashMap<>();
        int canal;

        System.out.println("Digite o número do canal (0 para encerrar):");
        while ((canal = scanner.nextInt()) != 0) {
            System.out.print("Quantidade de pessoas assistindo o canal " + canal + ": ");
            int pessoas = scanner.nextInt();
            audiencias.put(canal, audiencias.getOrDefault(canal, 0) + pessoas);
        }

        int totalPessoas = audiencias.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("\nAudiência por canal:");
        for (Map.Entry<Integer, Integer> entry : audiencias.entrySet()) {
            double porcentagem = (entry.getValue() * 100.0) / totalPessoas;
            System.out.printf("Canal %d: %.2f%%\n", entry.getKey(), porcentagem);
        }
    }
}
