import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(pell(n));

        sc.close();
    }

    public static long pell(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return 2 * pell(n - 1) + pell(n - 2);
    }
}
}
