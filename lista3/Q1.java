import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        for (int k = 1; k <= p; k++) {
            int n = sc.nextInt();
            int[] vendas = new int[n];
            for (int j = 0; j < n; j++) {
                vendas[j] = sc.nextInt();
            }

            insertionSort(vendas, n);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (i > 0) sb.append(" ");
                sb.append(vendas[i]);
            }

            System.out.println("Vendas ordenadas do produto " + k + ": " + sb);
            System.out.println("Mediana das vendas do produto " + k + ": " + mediana(vendas, n));
        }

        sc.close();
    }

    public static void insertionSort(int[] v, int n) {
        int aux = 0;
        int i, j = 1;
        while (j < n) {
            aux = v[j];
            i = j - 1;
            while ((i >= 0) && v[i] > aux) {
                v[i + 1] = v[i];
                i = i - 1;
            }
            v[i + 1] = aux;
            j = j + 1;
        }
    }

    public static double mediana(int[] v, int n) {
        if (n % 2 == 1) {
            return v[n / 2];
        }
        return (v[n / 2 - 1] + v[n / 2]) / 2.0;
    }
}