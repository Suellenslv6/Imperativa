import java.util.Scanner;

public class v11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double[] v = new double[n];

        System.out.println("Digite os " + n + " valores do vetor:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += v[i];
        }
        double media = soma / n;

        double somaQuadrados = 0;
        for (int i = 0; i < n; i++) {
            somaQuadrados += Math.pow(v[i] - media, 2);
        }

        double desvioPadrao = Math.sqrt(somaQuadrados / (n - 1));

        System.out.println("Media: " + media);
        System.out.println("Desvio padrao: " + desvioPadrao);

        sc.close();
    }
}