import java.util.Random;

public class MatQ8 {
    public static void main(String[] args) {
        int n = 4;
        int[][] original = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                original[i][j] = random.nextInt(20) + 1; // valores entre 1 e 20
            }
        }

        int[][] triangularInferior = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    triangularInferior[i][j] = 0; // zera acima da diagonal principal
                } else {
                    triangularInferior[i][j] = original[i][j];
                }
            }
        }

        System.out.println("Matriz original:");
        imprimeMatriz(original);

        System.out.println("Matriz triangular inferior:");
        imprimeMatriz(triangularInferior);
    }

    public static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}

