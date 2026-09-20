package lista2;

import java.util.Scanner;

public class ListQ6 {
    public static void main(String[]args){
        String[]V = new String[20];
        int[]Id = new int[20];
        Scanner s = new Scanner(System.in);
        
        for(int i = 0; i < V.length; i++){
            System.out.print("Digite o nome: ");
            V[i] = s.nextLine();
        }
        for(int i = 0; i < Id.length; i++){
            System.out.print("Digite a idade: ");
            Id[i] = s.nextInt();
        }
        double media = IdMedia(Id);
        System.out.println("A média de idade é: " + media);
    }
    public static double IdMedia(int[] Id){
        double soma = 0;
        for(int i = 0; i < Id.length; i++){
            soma = soma + Id[i];
        }
        return soma/Id.length;
    }
}
