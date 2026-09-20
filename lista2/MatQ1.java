import java.util.Scanner;

public class MatQ1 {
    public static void main(String[]args){
       int[][] M = new int[4][4];
       Scanner s = new Scanner(System.in);

       for(int i = 0; i < M.length; i++){
        for(int j = 0; j < M.length; j++){
            System.out.println("Digite os números da matriz");
            M[i][j] = s.nextInt();
        }
       }
       int contar = Maiores(M);
       System.out.println("Os números maiores são:" + Maiores);
    }
     public static int Maiores(int[][] M){
        int cont = 0;
        for(int i = 0; i < M.length; i++){
        for(int j = 0; j < M.length; j++){
            if (M[i][j] > 10)
                cont++
        }
     }
        return cont;
    }
}
