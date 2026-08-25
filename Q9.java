import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Leitura
        System.out.print("Digite a quantidade de alunos: ");
        int quantAlunos = s.nextInt();

        double[] medias = new double[quantAlunos];

        for (int i = 0; i < quantAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.print("Nota 1: ");
            double nota1 = s.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = s.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = s.nextDouble();

            // Chamada das funções
            double media = calcularMediaAluno(nota1, nota2, nota3);
            String situacao = verSituacao(media);
            medias[i] = media;

            // Exibição
            System.out.printf("Aluno %d - Média: %.1f - %s%n", (i + 1), media, situacao);
        }

        // Chamada da função de média da turma
        double mediaTurma = calcularMediaTurma(medias);

        // Exibição
        System.out.printf("Média geral da turma: %.1f%n", mediaTurma);

        s.close();
    }

    public static double calcularMediaAluno(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static String verSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static double calcularMediaTurma(double[] medias) {
        double soma = 0;
        for (int i = 0; i < medias.length; i++) {
            soma += medias[i];
        }
        return soma / medias.length;
    }
}