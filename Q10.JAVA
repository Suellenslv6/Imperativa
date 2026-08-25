import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Leitura dos preços até digitar 0
        double[] precos = new double[100]; // tamanho máximo arbitrário
        int quantidade = 0;

        System.out.print("Digite o preço do produto (0 para encerrar): ");
        double preco = s.nextDouble();

        while (preco != 0) {
            precos[quantidade] = preco;
            quantidade++;
            System.out.print("Digite o preço do produto (0 para encerrar): ");
            preco = s.nextDouble();
        }

        // Chamada das funções
        double total = calcularTotal(precos, quantidade);
        double percentualDesconto = calcularDesconto(total);
        double desconto = total * percentualDesconto;
        double valorFinal = calcularValorFinal(total, percentualDesconto);

        // Exibição
        System.out.printf("Total da compra: %.2f%n", total);
        System.out.printf("Desconto: %.2f%n", desconto);
        System.out.printf("Valor final: %.2f%n", valorFinal);

        s.close();
    }

    public static double calcularTotal(double[] precos, int quantidade) {
        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += precos[i];
        }
        return total;
    }

    public static double calcularDesconto(double total) {
        if (total > 500) {
            return 0.15;
        } else if (total > 200) {
            return 0.10;
        } else {
            return 0;
        }
    }

    public static double calcularValorFinal(double total, double percentualDesconto) {
        return total - (total * percentualDesconto);
    }
}