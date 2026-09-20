import java.util.Scanner;

public class ListQ12 {
    public static void main(String[] args) {
        int[] V = new int[10];
        Scanner s = new Scanner(System.in);

        int preenchidos = 0;

        while (preenchidos < V.length) {
            System.out.print("Digite um número: ");
            int valor = s.nextInt();

            if (existeNoVetor(valor, V, preenchidos)) {
                System.out.println("Este número já foi digitado, digite outro número!");
            } else {
                V[preenchidos] = valor;
                preenchidos++; 
            }
        }

        System.out.println("Vetor final:");
        for (int i = 0; i < V.length; i++) {
            System.out.println(V[i]);
        }
    }

    public static boolean existeNoVetor(int valor, int[] V, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            if (V[i] == valor) {
                return true;
            }
        }
        return false;
    }
}