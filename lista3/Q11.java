import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        tribonacci(n);

        sc.close();
    }

    public static long tribonacci(int n) {
        long resultado = calcula(n);
        System.out.println(resultado);
        return resultado;
    }

    public static long calcula(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return calcula(n - 1) + calcula(n - 2) + calcula(n - 3);
    }
}

