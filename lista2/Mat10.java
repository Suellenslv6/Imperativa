    import java.util.Scanner;

public class Mat10 {
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

        int[] somaColunas = new int[n];
        for (int j = 0; j < n; j++) {
            int soma = 0;
            for (int i = 0; i < n; i++) {
                soma += matriz[i][j];
            }
            somaColunas[j] = soma;
        }

        System.out.println("Vetor com a soma das colunas:");
        for (int j = 0; j < somaColunas.length; j++) {
            System.out.print(somaColunas[j] + " ");
        }
        System.out.println();

        sc.close();
    }
}

