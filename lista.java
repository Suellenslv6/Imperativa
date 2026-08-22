import java.util.Scanner;

public class lista {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escolha o exercício:");
        System.out.println("1 - Conversão de temperatura");
        System.out.println("2 - Estatísticas de altura de 10 pessoas");
        System.out.println("3 - Média salarial de funcionários");
        System.out.print("Opção: ");
        int opcao = s.nextInt();

        if (opcao == 1) {

            // Leitura
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = s.nextDouble();

            // Chamada das funções
            double fahrenheit = celsiusParaFahrenheit(celsius);
            double kelvin = celsiusParaKelvin(celsius);
            double reaumur = celsiusParaReaumur(celsius);
            double rankine = celsiusParaRankine(celsius);

            // Exibição
            System.out.printf("Fahrenheit: %.2f°F%n", fahrenheit);
            System.out.printf("Kelvin: %.2fK%n", kelvin);
            System.out.printf("Réaumur: %.2f°Ré%n", reaumur);
            System.out.printf("Rankine: %.2f°R%n", rankine);

        } else if (opcao == 2) {

            // Leitura
            double[] alturas = new double[10];
            int[] sexos = new int[10];

            for (int i = 0; i < 10; i++) {
                System.out.println("Pessoa " + (i + 1));
                System.out.print("Digite a altura (em metros): ");
                alturas[i] = s.nextDouble();
                System.out.print("Digite o sexo (1-Mulher, 2-Homem): ");
                sexos[i] = s.nextInt();
            }

            // Chamada das funções
            double maior = maiorAltura(alturas);
            double menor = menorAltura(alturas);
            double mediaHomens = mediaAlturaHomens(alturas, sexos);
            int qtdMulheres = quantidadeMulheres(sexos);

            // Exibição
            System.out.println("\n--- Resultados ---");
            System.out.printf("Maior altura do grupo: %.2f m%n", maior);
            System.out.printf("Menor altura do grupo: %.2f m%n", menor);
            System.out.printf("Média de altura dos homens: %.2f m%n", mediaHomens);
            System.out.println("Quantidade de mulheres: " + qtdMulheres);

        } else if (opcao == 3) {

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
                System.out.printf("A média salarial dos funcionários é: R$ %.2f%n", media);

            } else {
                System.out.println("Quantidade inválida! Deve ser maior que zero.");
            }

        } else {
            System.out.println("Opção inválida.");
        }

        s.close();
    }

    // ===================== FUNÇÕES - EXERCÍCIO 1 (TEMPERATURA) =====================

    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double celsiusParaReaumur(double celsius) {
        return celsius * 0.8;
    }

    public static double celsiusParaRankine(double celsius) {
        return celsius * 1.8 + 491.67;
    }

    // ===================== FUNÇÕES - EXERCÍCIO 2 (ALTURAS) =====================

    public static double maiorAltura(double[] alturas) {
        double maior = alturas[0];
        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] > maior) {
                maior = alturas[i];
            }
        }
        return maior;
    }

    public static double menorAltura(double[] alturas) {
        double menor = alturas[0];
        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] < menor) {
                menor = alturas[i];
            }
        }
        return menor;
    }

    public static double mediaAlturaHomens(double[] alturas, int[] sexos) {
        double soma = 0;
        int contador = 0;

        for (int i = 0; i < alturas.length; i++) {
            if (sexos[i] == 2) {
                soma += alturas[i];
                contador++;
            }
        }

        if (contador == 0) {
            return 0;
        }

        return soma / contador;
    }

    public static int quantidadeMulheres(int[] sexos) {
        int contador = 0;
        for (int i = 0; i < sexos.length; i++) {
            if (sexos[i] == 1) {
                contador++;
            }
        }
        return contador;
    }

    // ===================== FUNÇÕES - EXERCÍCIO 3 (MÉDIA SALARIAL) =====================

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