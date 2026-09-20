package lista2;
import java.util.Scanner;

public class ListQ4 {
     public static void main(String[] args) {
        String[] nomes = new String[15];
        Scanner s = new Scanner(System.in);
 
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = s.nextLine();
        }
 
        
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
 
        s.close();
    }
}

