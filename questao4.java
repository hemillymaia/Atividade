//Questão 4
public class SomaSerie {
    public static void main(String[] args) {
        double soma = 0;

        int numerador = 1000;
        for (int i = 1; i <= 50; i++) {
            soma += (double) numerador / i;
            numerador -= 3;
        }

        System.out.printf("A soma dos 50 primeiros termos é: %.2f\n", soma);
    }
}
