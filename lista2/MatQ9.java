import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MatQ9 {
    private static final int MIN_NUMERO = 0;
    private static final int MAX_NUMERO = 99; // inclusive
    private static final int LINHAS = 5;
    private static final int COLUNAS = 5;

    public static void main(String[] args) {
        int[][] cartela = gerarCartela();
        exibirCartela(cartela);
    }

    public static int[][] gerarCartela() {
        List<Integer> numerosDisponiveis = new ArrayList<>();
        for (int numero = MIN_NUMERO; numero <= MAX_NUMERO; numero++) {
            numerosDisponiveis.add(numero);
        }

        Random random = new Random();
        Collections.shuffle(numerosDisponiveis, random);

        int[][] cartela = new int[LINHAS][COLUNAS];
        int indice = 0;
        for (int linha = 0; linha < LINHAS; linha++) {
            for (int coluna = 0; coluna < COLUNAS; coluna++) {
                cartela[linha][coluna] = numerosDisponiveis.get(indice);
                indice++;
            }
        }

        return cartela;
    }

    public static void exibirCartela(int[][] cartela) {
        System.out.println("===== CARTELA DE BINGO =====");
        for (int[] linha : cartela) {
            StringBuilder linhaFormatada = new StringBuilder();
            for (int numero : linha) {
                linhaFormatada.append(String.format("%2d", numero)).append("  ");
            }
            System.out.println(linhaFormatada.toString());
        }
        System.out.println("=============================");
    }
}
}
