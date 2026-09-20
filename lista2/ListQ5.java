package lista2;
import java.util.Scanner;

public class ListQ5 {
    public static void main(String[]args){
        int[] V = new int[5];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < V.length; i++){
            System.out.print("Digite os números: ");
            V[i] = s.nextInt();
        }
        for(int i = 0; i < V.length; i++){
            if(V[i] % 2 == 0){
                System.out.println("Os números pares são: " + V[i]);
            }
        }
        for(int i = 0; i < V.length; i++){
            if(V[i] % 2 != 0){
                System.out.println("Os números impares são: " + V[i]);
    } 
}
    }}