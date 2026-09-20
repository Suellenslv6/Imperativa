    import java.util.Scanner;

public class MatQ11 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int alunos = 5;
        int colunas = 4; // matricula, media provas, media trabalhos, nota final
        int[][] dados = new int[alunos][colunas];

        for (int i = 0; i < alunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");

            System.out.print("Matricula: ");
            dados[i][0] = s.nextInt();

            System.out.print("Media das provas: ");
            dados[i][1] = s.nextInt();

            System.out.print("Media dos trabalhos: ");
            dados[i][2] = s.nextInt();

            // Nota final = soma da media das provas com a media dos trabalhos
            dados[i][3] = dados[i][1] + dados[i][2];
        }

        int matriculaMaiorNota = dados[0][0];
        int maiorNota = dados[0][3];
        int somaNotas = 0;

        for (int i = 0; i < alunos; i++) {
            somaNotas += dados[i][3];
            if (dados[i][3] > maiorNota) {
                maiorNota = dados[i][3];
                matriculaMaiorNota = dados[i][0];
            }
        }

        double mediaNotas = (double) somaNotas / alunos;

        System.out.println("Matricula do aluno com maior nota final: " + matriculaMaiorNota);
        System.out.println("Media aritmetica das notas finais: " + mediaNotas);

        sc.close();
    }
}

