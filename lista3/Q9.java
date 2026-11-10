import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(somaInversos(n));

        sc.close();
    }

    public static double somaInversos(int n) {
        if (n == 1) {
            return 1.0;
        }
        return 1.0 / n + somaInversos(n - 1);
    }
}
