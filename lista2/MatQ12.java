import java.util.Scanner;

public class MatQ12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 2;
        double[][] m1 = new double[n][n];
        double[][] m2 = new double[n][n];

        System.out.println("Digite os valores da primeira matriz 2x2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m1[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Digite os valores da segunda matriz 2x2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m2[i][j] = s.nextDouble();
            }
        }

        int opcao = -1;
        while (opcao != 0) {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1 - Somar as duas matrizes");
            System.out.println("2 - Subtrair a primeira matriz da segunda");
            System.out.println("3 - Adicionar uma constante as duas matrizes");
            System.out.println("4 - Imprimir as matrizes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    double[][] soma = new double[n][n];
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            soma[i][j] = m1[i][j] + m2[i][j];
                        }
                    }
                    System.out.println("Matriz soma:");
                    imprimeMatriz(soma);
                    break;

                case 2:
                    double[][] subtracao = new double[n][n];
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            subtracao[i][j] = m2[i][j] - m1[i][j];
                        }
                    }
                    System.out.println("Matriz (segunda - primeira):");
                    imprimeMatriz(subtracao);
                    break;

                case 3:
                    System.out.print("Digite a constante a ser somada: ");
                    double constante = sc.nextDouble();
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            m1[i][j] += constante;
                            m2[i][j] += constante;
                        }
                    }
                    System.out.println("Constante adicionada as duas matrizes.");
                    break;

                case 4:
                    System.out.println("Primeira matriz:");
                    imprimeMatriz(m1);
                    System.out.println("Segunda matriz:");
                    imprimeMatriz(m2);
                    break;

                case 0:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        }

        sc.close();
    }

    public static void imprimeMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}

