import java.util.Scanner;

public class Q8 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(soma(n));

        sc.close();
    }

    public static int soma(int n) {
        if (n == 1) {
            return 1;
        }
        return n * soma(n - 1);
    }
}

