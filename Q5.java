import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Leitura
        System.out.print("Digite o raio da lata em metros: ");
        double raio = s.nextDouble();
        System.out.print("Digite a altura da lata em metros: ");
        double altura = s.nextDouble();

        // Chamada da função
        double volume = calcularVolumeLata(raio, altura);

        // Exibição
        System.out.printf("Volume da lata de óleo: %.2f m³%n", volume);

        s.close();
    }

    public static double calcularVolumeLata(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
}