import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Leitura
        System.out.print("Digite a altura da parede: ");
        double alturaP = s.nextDouble();
        System.out.print("Digite a largura da parede: ");
        double larguraP = s.nextDouble();
        System.out.print("Digite a altura do azulejo: ");
        double alturaA = s.nextDouble();
        System.out.print("Digite a largura do azulejo: ");
        double larguraA = s.nextDouble();

        // Chamada da função
        int quantidadeAzulejos = calcularQuantidadeAzulejos(alturaP, larguraP, alturaA, larguraA);

        // Exibição
        System.out.println("Quantidade de azulejos necessários: " + quantidadeAzulejos);

        s.close();
    }

    public static int calcularQuantidadeAzulejos(double alturaP, double larguraP, double alturaA, double larguraA) {
        double areaParede = alturaP * larguraP;
        double areaAzulejo = alturaA * larguraA;
        return (int) Math.ceil(areaParede / areaAzulejo);
    }
}