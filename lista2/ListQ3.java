package lista2;
import java.util.Scanner;

public class ListQ3 {
    public static void main(String[] args) {
        int[] V = new int[10];
        Scanner s = new Scanner(System.in);

        // Leitura dos 10 valores
        for (int i = 0; i < V.length; i++) {
            System.out.print("Digite um valor: ");
            V[i] = s.nextInt();
        }

        // Impressão apenas dos elementos pares
       
        for (int i = 0; i < V.length; i++) {
            if (V[i] % 2 == 0) {
                System.out.println("Elementos pares são : " + V[i]);
            }
        }

        s.close();
    }
}

