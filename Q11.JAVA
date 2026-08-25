import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Leitura
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = s.nextInt();
        }

        // Chamada das funções
        int maior = maiorNumero(numeros);
        int menor = menorNumero(numeros);
        int pares = numerosPares(numeros);
        double media = mediaNumeros(numeros);

        // Exibição
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Quantidade de pares: " + pares);
        System.out.printf("Média: %.1f%n", media);

        s.close();
    }

    public static int maiorNumero(int[] numeros) {
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static int menorNumero(int[] numeros) {
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static int numerosPares(int[] numeros) {
        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public static double mediaNumeros(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return (double) soma / numeros.length;
    }
}