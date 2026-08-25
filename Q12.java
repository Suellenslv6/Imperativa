import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Leitura
        int[] numeros = new int[1000]; // tamanho máximo arbitrário
        int tamanho = 0;

        System.out.print("Digite um número (-1 para encerrar): ");
        int valor = s.nextInt();

        while (valor != -1) {
            numeros[tamanho] = valor;
            tamanho++;
            System.out.print("Digite um número (-1 para encerrar): ");
            valor = s.nextInt();
        }

        // Chamada das funções
        int quantidade = contarQuantidade(numeros, tamanho);
        int soma = calcularSoma(numeros, tamanho);
        double media = calcularMedia(numeros, tamanho);
        int maior = encontrarMaior(numeros, tamanho);
        int menor = encontrarMenor(numeros, tamanho);
        int qtdPares = contarPares(numeros, tamanho);
        int qtdImpares = contarImpares(numeros, tamanho);

        // Exibição
        System.out.printf("Quantidade de números: %d%n", quantidade);
        System.out.printf("Soma: %d%n", soma);
        System.out.printf("Média: %.1f%n", media);
        System.out.printf("Maior número: %d%n", maior);
        System.out.printf("Menor número: %d%n", menor);
        System.out.printf("Quantidade de pares: %d%n", qtdPares);
        System.out.printf("Quantidade de ímpares: %d%n", qtdImpares);

        s.close();
    }

    public static int contarQuantidade(int[] numeros, int tamanho) {
        return tamanho;
    }

    public static int calcularSoma(int[] numeros, int tamanho) {
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += numeros[i];
        }
        return soma;
    }

    public static double calcularMedia(int[] numeros, int tamanho) {
        return (double) calcularSoma(numeros, tamanho) / tamanho;
    }

    public static int encontrarMaior(int[] numeros, int tamanho) {
        int maior = numeros[0];
        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static int encontrarMenor(int[] numeros, int tamanho) {
        int menor = numeros[0];
        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static int contarPares(int[] numeros, int tamanho) {
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarImpares(int[] numeros, int tamanho) {
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }
}