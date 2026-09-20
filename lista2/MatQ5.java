import java.util.Scanner;

public class MatQ5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 5;
        int[][] matriz = new int[n][n];

        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = s.nextInt();
            }
        }

        System.out.print("Digite o valor X a ser buscado: ");
        int x = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < n && !encontrado; i++) {
            for (int j = 0; j < n && !encontrado; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Encontrado na linha " + i + ", coluna " + j);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Nao encontrado");
        }

        sc.close();
    }
}

