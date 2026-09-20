import java.util.Scanner;

public class MatQ4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] M = new int[4][4];

        System.out.println("Digite os valores da matriz 4x4:");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

        int maiorValor = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (M[i][j] > maiorValor) {
                    maiorValor = M[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Localizacao: linha " + linhaMaior + ", coluna " + colunaMaior);

        sc.close();
    }
}

