import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Leitura
        System.out.print("Digite a quantidade de funcionários: ");
        int quantidade = s.nextInt();

        if (quantidadeValida(quantidade)) {
            double[] salarios = new double[quantidade];
            for (int i = 0; i < quantidade; i++) {
                System.out.print("Digite o salário do funcionário " + (i + 1) + ": R$ ");
                salarios[i] = s.nextDouble();
            }

            // Chamada da função
            double media = calcularMediaSalarial(salarios);

            // Exibição
            System.out.printf("Média salarial: %.2f%n", media);

        } else {
            System.out.println("Quantidade inválida! Deve ser maior que zero.");
        }

        s.close();
    }

    public static boolean quantidadeValida(int quantidade) {
        return quantidade > 0;
    }

    public static double calcularMediaSalarial(double[] salarios) {
        double soma = 0;
        for (int i = 0; i < salarios.length; i++) {
            soma += salarios[i];
        }
        return soma / salarios.length;
    }
}