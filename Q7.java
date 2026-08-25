import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Leitura
        System.out.print("Digite um número: ");
        int numero = s.nextInt();

        // Chamada da função
        int fatorial = calcularFatorial(numero);

        // Exibição
        System.out.printf("Fatorial: %d%n", fatorial);

        s.close();
    }

    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}