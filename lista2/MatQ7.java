import java.util.Scanner;

public class MatQ7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 3;
        int[][] matriz = new int[n][n];

        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = s.nextInt();
            }
        }

        int somaAcima = 0;
        int somaAbaixo = 0;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    somaAcima += matriz[i][j];
                } else if (i > j) {
                    somaAbaixo += matriz[i][j];
                }

                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }

                if (i + j == n - 1) {
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
        }

        System.out.println("Soma acima da diagonal principal: " + somaAcima);
        System.out.println("Soma abaixo da diagonal principal: " + somaAbaixo);
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundaria: " + somaDiagonalSecundaria);

        sc.close();
    }
}

