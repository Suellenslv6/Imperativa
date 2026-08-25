import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Leitura
        System.out.print("Digite qualquer número: ");
        int numero = s.nextInt();

        // Chamada das funções
        int horas = calcularHoras(numero);
        int minutos = calcularMinutos(numero);
        int segundosRestantes = calcularSegundosRestantes(numero);

        // Exibição
        System.out.printf("%d hora(s)%n", horas);
        System.out.printf("%d minuto(s)%n", minutos);
        System.out.printf("%d segundo(s)%n", segundosRestantes);

        s.close();
    }

    public static int calcularHoras(int segundos) {
        return segundos / 3600;
    }

    public static int calcularMinutos(int segundos) {
        return (segundos % 3600) / 60;
    }

    public static int calcularSegundosRestantes(int segundos) {
        return segundos % 60;
    }
}