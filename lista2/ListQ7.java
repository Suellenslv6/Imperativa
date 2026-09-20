package lista2;
import java.util.Scanner;

public class ListQ7 {
    public static void main(String[] args) {
        int[] V = new int[20];
        int[] X = new int[20];
        int[] Z = new int[40];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < V.length; i++) {
            System.out.println("Digite os valores: ");
            V[i] = s.nextInt();
        }

        for (int i = 0; i < X.length; i++) {
            System.out.println("Digite os valores: ");
            X[i] = s.nextInt();
        }

        Z = Intercalar(V, X, Z);

        System.out.print("O vetor intercalado é: ");
        for (int i = 0; i < Z.length; i++) {
            System.out.print(Z[i] + " ");
        }
    }

    public static int[] Intercalar(int[] V, int[] X, int[] Z) {
        for (int i = 0; i < V.length; i++) {
            Z[2 * i] = V[i];
            Z[2 * i + 1] = X[i];
        }
        return Z;
    }
}