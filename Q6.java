import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Leitura
        System.out.print("Digite a massa em quilogramas: ");
        double massa = s.nextDouble();
        System.out.print("Digite a altura em metros: ");
        double altura = s.nextDouble();
        System.out.print("Digite o tempo em segundos: ");
        double tempo = s.nextDouble();

        // Chamada da função
        double potenciaHp = calcularPotenciaHp(massa, altura, tempo);

        // Exibição
        System.out.printf("Potência necessária: %.3f hp%n", potenciaHp);

        s.close();
    }

    public static double calcularPotenciaHp(double massa, double altura, double tempo) {
        double g = 9.81;
        double potenciaWatts = (massa * g * altura) / tempo;
        return potenciaWatts / 745.6999;
    }
}