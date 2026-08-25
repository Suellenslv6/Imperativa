import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Leitura
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = s.nextDouble();

        // Chamada das funções
        double fahrenheit = celsiusParaFahrenheit(celsius);
        double kelvin = celsiusParaKelvin(celsius);
        double reaumur = celsiusParaReaumur(celsius);
        double rankine = celsiusParaRankine(celsius);

        // Exibição
        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
        System.out.printf("Kelvin: %.2f%n", kelvin);
        System.out.printf("Réaumur: %.2f%n", reaumur);
        System.out.printf("Rankine: %.2f%n", rankine);

        s.close();
    }

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
}