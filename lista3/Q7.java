import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (ehPrimo(n, 2)) {
            System.out.println(n + " eh primo");
        } else {
            System.out.println(n + " nao eh primo");
        }

        sc.close();
    }

    public static boolean ehPrimo(int n, int divisor) {
        if (n < 2) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return ehPrimo(n, divisor + 1);
    }
}