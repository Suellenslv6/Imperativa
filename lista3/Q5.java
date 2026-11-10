import java.util.Scanner;

public class Q5 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(decimalPBinario(n));
    }

    public static String decimalPBinario(int n) {
        if (n < 2) {
            return String.valueOf(n);
        }
        return decimalPBinario(n / 2) + (n % 2);
    }
}