public class matQ6 {
    public static void main(String[] args) {
        int n = 10;
        int[][] A = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    A[i][j] = 2 * i + 7 * j - 2;
                } else if (i == j) {
                    A[i][j] = 3 * i * i - 1;
                } else {
                    A[i][j] = 4 * i * i * i - 5 * j * j + 1;
                }
            }
        }

        System.out.println("Matriz gerada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%6d", A[i][j]);
            }
            System.out.println();
        }
    }
}

