import java.util.Scanner;

public class MatQ14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dias = 30;

        System.out.print("Numero de alunos: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpa a quebra de linha deixada pelo nextInt

        String[] nomes = new String[n];
        char[][] presencas = new char[n][dias];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = ss.nextLine();

            for (int d = 0; d < dias; d++) {
                System.out.print("Dia " + (d + 1) + " (P/F): ");
                presencas[i][d] = sc.nextLine().charAt(0);
            }
        }

        System.out.println();
        System.out.println("Alunos reprovados por falta:");
        for (int i = 0; i < n; i++) {
            int faltas = 0;
            StringBuilder diasFaltados = new StringBuilder();

            for (int d = 0; d < dias; d++) {
                if (presencas[i][d] == 'F') {
                    faltas++;
                    diasFaltados.append(d + 1).append(" ");
                }
            }

            if (faltas > 10) {
                System.out.println(nomes[i] + " - dias: " + diasFaltados.toString().trim());
            }
        }

        sc.close();
    }
}

