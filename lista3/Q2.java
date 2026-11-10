import java.util.Locale;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // para ler 19.99 com ponto
        int s = sc.nextInt();

        for (int k = 1; k <= s; k++) {
            int n = sc.nextInt();
            double[] precos = new double[n];
            for (int j = 0; j < n; j++) {
                precos[j] = sc.nextDouble();
            }

            selectionSort(precos, n);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (i > 0) sb.append(" ");
                sb.append(String.format(Locale.US, "%.2f", precos[i]));
            }

            System.out.println("Precos ordenados da secao " + k + ": " + sb);
            System.out.println("Preco mais barato da secao " + k + ": "
                    + String.format(Locale.US, "%.2f", precos[0]));
            System.out.println("Preco mais caro da secao " + k + ": "
                    + String.format(Locale.US, "%.2f", precos[n - 1]));
        }

        sc.close();
    }

    public static void selectionSort(double[] v, int n) {
        int i, j, mim;
        double aux;
        for (i = 0; i < n - 1; i++) {
            mim = i;
            for (j = i + 1; j < n; j++) {
                if (v[j] < v[mim]) {
                    mim = j;
                }
            }
            if (mim != i) {
                aux = v[i];
                v[i] = v[mim];
                v[mim] = aux;
            }
        }
    }
}