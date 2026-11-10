import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] filmes = new int[n];
        for (int j = 0; j < n; j++) {
            filmes[j] = sc.nextInt();
        }

        bubbleSort(filmes, n);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(" ");
            sb.append(filmes[i]);
        }

        System.out.println("Avaliacoes ordenadas: " + sb);
        System.out.println("Melhor avaliacao: " + filmes[0]);
        System.out.println("Pior avaliacao: " + filmes[n - 1]);

        sc.close();
    }

    public static void bubbleSort(int[] v, int n) {
        int aux, fim, i;
        for (fim = n - 1; fim > 0; fim--) {
            for (i = 0; i < fim; i++) {
                if (v[i] < v[i + 1]) {
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                }
            }
        }
    }
}