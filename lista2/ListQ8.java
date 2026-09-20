package lista2;
import java.util.Scanner;

public class ListQ8 {
    public static void main(String[]args){
        int[]V = new int[10];
        int[]X = new int[10];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < V.length; i++){
            System.out.println("Digite os valores: ");
            V[i] = s.nextInt();
        }
        for(int i = 0; i < X.length; i++){
            System.out.println("Digite os valores: ");
            X[i] = s.nextInt();
        }
        for(int i = 0; i < V.length; i++){
            if(V[i] % 2 == 0){
            System.out.println("Os valores pares são: " + V[i]);
            }
        }
        for(int i = 0; i < X.length; i++){
            if(X[i] % 2 != 0){
            System.out.println("Os valores ímpares são: " + X[i]);
            }
        }
    }
}
