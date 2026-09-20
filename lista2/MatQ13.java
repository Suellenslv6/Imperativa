import java.util.Scanner;

public class MatQ13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int filas = 10;
        int poltronasPorFila = 10;
        int[][] teatro = new int[filas][poltronasPorFila];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < poltronasPorFila; j++) {
                teatro[i][j] = -1;
            }
        }

        System.out.print("Numero de tentativas de compra: ");
        int n = sc.nextInt();

        for (int compra = 0; compra < n; compra++) {
            System.out.print("Numero da fila: ");
            int fila = sc.nextInt();
            System.out.print("Numero da poltrona: ");
            int poltrona = sc.nextInt();

            int i = fila - 1;
            int j = poltrona - 1;

            if (teatro[i][j] == -1) {
                teatro[i][j] = 1;
            } else {
                System.out.println("Poltrona ja foi vendida");
            }
        }

        System.out.println("Matriz final:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < poltronasPorFila; j++) {
                System.out.print(teatro[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
