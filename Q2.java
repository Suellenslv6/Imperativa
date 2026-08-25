import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Leitura
        double[] alturas = new double[10];
        int[] sexos = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.print("Digite o sexo (1-Mulher, 2-Homem): ");
            sexos[i] = s.nextInt();
            System.out.print("Digite a altura (em metros): ");
            alturas[i] = s.nextDouble();
        }

        // Chamada das funções
        double maior = maiorAltura(alturas);
        double menor = menorAltura(alturas);
        double mediaHomens = mediaAlturaHomens(alturas, sexos);
        int qtdMulheres = quantidadeMulheres(sexos);

        // Exibição
        System.out.printf("Maior altura: %.2f m%n", maior);
        System.out.printf("Menor altura: %.2f m%n", menor);
        System.out.printf("Média de altura dos homens: %.2f m%n", mediaHomens);
        System.out.println("Número de mulheres: " + qtdMulheres);

        s.close();
    }

    public static double maiorAltura(double[] alturas) {
        double maior = alturas[0];
        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] > maior) {
                maior = alturas[i];
            }
        }
        return maior;
    }

    public static double menorAltura(double[] alturas) {
        double menor = alturas[0];
        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] < menor) {
                menor = alturas[i];
            }
        }
        return menor;
    }

    public static double mediaAlturaHomens(double[] alturas, int[] sexos) {
        double soma = 0;
        int contador = 0;

        for (int i = 0; i < alturas.length; i++) {
            if (sexos[i] == 2) {
                soma += alturas[i];
                contador++;
            }
        }

        if (contador == 0) {
            return 0;
        }

        return soma / contador;
    }

    public static int quantidadeMulheres(int[] sexos) {
        int contador = 0;
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 1) {
                contador++;
            }
        }
        return contador;
    }
}