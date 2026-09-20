import java.util.Scanner;

public class v10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] x = new int[n];
        int[] y = new int[n];

        System.out.println("Digite os " + n + " valores do vetor x:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("Digite os " + n + " valores do vetor y:");
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }

        int[] soma = new int[n];
        for (int i = 0; i < n; i++) {
            soma[i] = x[i] + y[i];
        }

        int[] produto = new int[n];
        for (int i = 0; i < n; i++) {
            produto[i] = x[i] * y[i];
        }

        int[] diferencaTemp = new int[n];
        int qtdDiferenca = 0;
        for (int i = 0; i < n; i++) {
            if (!existeNoVetor(x[i], y)) {
                diferencaTemp[qtdDiferenca] = x[i];
                qtdDiferenca++;
            }
        }

        int[] intersecaoTemp = new int[n];
        int qtdIntersecao = 0;
        for (int i = 0; i < n; i++) {
            if (existeNoVetor(x[i], y)) {
                intersecaoTemp[qtdIntersecao] = x[i];
                qtdIntersecao++;
            }
        }

        int[] uniaoTemp = new int[2 * n];
        int qtdUniao = 0;
        for (int i = 0; i < n; i++) {
            uniaoTemp[qtdUniao] = x[i];
            qtdUniao++;
        }
        for (int i = 0; i < n; i++) {
            if (!existeNoVetor(y[i], x)) {
                uniaoTemp[qtdUniao] = y[i];
                qtdUniao++;
            }
        }

        System.out.println("Soma:");
        imprimeVetor(soma);

        System.out.println("Produto:");
        imprimeVetor(produto);

        System.out.println("Diferenca (x - y):");
        imprimeVetor(copiaAteTamanho(diferencaTemp, qtdDiferenca));

        System.out.println("Intersecao:");
        imprimeVetor(copiaAteTamanho(intersecaoTemp, qtdIntersecao));

        System.out.println("Uniao:");
        imprimeVetor(copiaAteTamanho(uniaoTemp, qtdUniao));

        sc.close();
    }

    public static boolean existeNoVetor(int valor, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static int[] copiaAteTamanho(int[] vetor, int tamanho) {
        int[] copia = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            copia[i] = vetor[i];
        }
        return copia;
    }

    public static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}