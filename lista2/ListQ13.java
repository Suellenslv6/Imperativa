public class ListQ13 { 
    public static void main(String[] args) {
      trianPascal(7);
    }
    public static void trianPascal(int n){
        int[] V = new int[100];
        V[0] = 1;

        for(int i = 0; i <= n; i++){
            int aux1 = 0;
            int aux2 - 0;
            for(int j = 0; j <= n; j++){
                aux2 = aux1 + V[j];
                aux1 = V[j];
                V[j] = aux2;
                System.out.printf(" %3d", V[i]);
            }
            System.ou.println();
        }
    }
}