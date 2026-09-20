package lista2;

public class Lista2Q1 {
    public static void main(String[]args){
        int[] A = {1,0,5,-2,-5,7};
        int soma = 0;

            soma = soma + A[0] + A[1] + A[5];
        System.out.println("A soma dessas posições é: " + soma);

        for(int i = 0; i < A.length; i++){
            A[4] = 100;
        }
        
        for(int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
    }
    
}
