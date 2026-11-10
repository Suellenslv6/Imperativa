import java.util.Scanner;

public class Q10 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(multiplica(n, k));
    }
    public static int multiplica(int n, int k){
        if (k == 0){
            return 1;
        }
        return n * multiplica(n, k - 1);
    }
}
