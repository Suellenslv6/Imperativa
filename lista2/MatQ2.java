
public class MatQ2 {
    public static void main(String[]args){
        int[][] M = new int[5][5];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M.length; j++){
                System.out.prin(M[i][j] + " "); 
            }
        }
    }
    public static void diagonalPrin(int[][] M){
         for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M.length; j++){
                if(i==j){
                    M[i][j] = 1
                }
                else {
                    M[i][j] = 0;
                }
            }
        }
    }
}
