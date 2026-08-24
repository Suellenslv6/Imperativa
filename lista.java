import java.util.Scanner;

public class lista {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escolha o exercício:");
        System.out.println("1 - Conversão de temperatura");
        System.out.println("2 - Estatísticas de altura de 10 pessoas");
        System.out.println("3 - Média salarial de funcionários");
        System.out.println("4 - Cálculo de azulejos para cobrir uma parede:");
        System.out.println("5 - Volume de uma lata de óleo");
        System.out.println("6 - Potência necessária para elvar uma massa");
        System.out.println("7 - Cálculo de fatorial");
        System.out.println("8 - Conversão de segundos");
        System.out.println("9 - Sistema de notas de uma turma");
        System.out.println("10 - Sistemas de caixa de loja");
        System.out.println("11 - Análise de Números");
        System.out.println("12 - Sistema de estatísticas de números");
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

        } else if (opcao == 4) {


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

        } else if (opcao == 5) {

            //leitura
            System.out.print("Digite o raio da lata em metros:");
            double raio = s.nextDouble();
            System.out.print("Digite a altura da lata em metros:");
            double altura = s.nextDouble();
           
            double volume = calcularVolumeLata(raio, altura);
            System.out.printf("O volume da lata de óleo é: %.2f m³%n", volume);
        
        } else if (opcao == 6) {

            //Leitura
            System.out.print("Digite a massa em Quilogramas");
            double massa = s.nextDouble();
            System.out.print("Digite a altura em Metros");
            double altura = s.nextDouble();
            System.out.print("Digite o tempo em Segundos");
            double tempo = s.nextDouble();

            //Chamada da função
            double potencia = calcularPotencia(massa, altura, tempo);

            //conversão para horsepower
            double hp = potencia / 745.6999;

            //Exibição
            System.out.printf("A potência necessária é: %.2f HP%n", hp);
        
        } else if (opcao == 7) {

            //Leitura
            System.out.print("Digite um número: ");
            int numero = s.nextInt();

            //Chamada da função
            int fatorial = calcularFatorial(numero);

            //Exibição
            System.out.printf("Fatorial: %d%n", fatorial);
         
        } else if (opcao == 8) {

            //Leitura
            System.out.print("Digite qualquer número: ");
            int numero = s.nextInt();

            //Chamada da função
            int[] tempo = converterSegundos(numero);
            int horas = tempo[0];
            int minutos = tempo[1];
            int segundosR = tempo[2];

            //Exibição
            System.out.printf("%d hora(s)%n", horas);
            System.out.printf("%d minuto(s)%n", minutos);
            System.out.printf("%d segundo(s)%n", segundosR);

        } else if (opcao == 9) {

            //Leitura
            System.out.print("Digite a quantidade de alunos:");
            int quantAlunos = s.nextInt();

             double[] notas = new double[quantAlunos];

             //Leitura das notas
             for (int i = 0; i < quantAlunos; i++) {
                System.out.println("Aluno " + (i + 1) + ":");
                System.out.print("Nota 1: ");
                double nota1 = s.nextDouble();
                System.out.print("Nota 2: ");
                double nota2 = s.nextDouble();
                System.out.print("Nota 3: ");
                double nota3 = s.nextDouble();

            //Cálculo da média
            double media = (nota1 + nota2 + nota3) / 3; 
            String situacao = verSituacao(media);
            notas[i] = media;
            System.out.printf("Aluno %d - Média: %.1f - %s%n", (i + 1), media, situacao);
            }

            //Cálculo da média da turma
            double somaNotas = 0;
            for (int i = 0; i < quantAlunos; i++) {
                somaNotas += notas[i];
            }
            double mediaTurma = somaNotas / quantAlunos;

            //Exibição
            System.out.printf("Média geral da turma: %.1f%n", mediaTurma);

        } else if (opcao == 10) {

    //Leitura dos preços até digitar 0
    double[] precos = new double[100]; // tamanho máximo arbitrário
    int quantidade = 0;

    System.out.print("Digite o preço do produto (0 para encerrar): ");
    double preco = s.nextDouble();

    while (preco != 0) {
        precos[quantidade] = preco;
        quantidade++;
        System.out.print("Digite o preço do produto (0 para encerrar): ");
        preco = s.nextDouble();
    }

    //Cálculos via funções
    double total = calcularTotal(precos, quantidade);
    double percentualDesconto = Desconto(total);
    double desconto = total * percentualDesconto;
    double valorFinal = calcularValorFinal(total, percentualDesconto);

    //Exibição
    System.out.printf("Total da compra: %.2f%n", total);
    System.out.printf("Desconto: %.2f%n", desconto);
    System.out.printf("Valor final: %.2f%n", valorFinal);

    } else if (opcao == 11) {

        //Leitura
        int []num = new int[10];
       
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            num[i] = s.nextInt();
        }

        //Funções
        int maior = maiorNumero(num);
        int menor = menorNumero(num);
        int pares = numerosPares(num);
        double media = mediaNumeros(num);

        //Exibição
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);       
        System.out.println("Quantidade de pares: " + pares);
        System.out.printf("Média: %.1f%n", media);

    } else if (opcao == 12) {

        //Leitura
        int []num = new int[100];
        int tamanho = 0;

        System.out.print("Digite um número (-1 para encerrar): ");
        int valor = s.nextInt();
       
        while (valor != -1) {
            num[tamanho] = valor;
            tamanho++;
            System.out.print("Digite um número (-1 para encerrar): ");
            valor = s.nextInt();
        }

        //Funções
        int quantidade = contarQuantidade(num, tamanho);
        int soma = calcularSoma(num, tamanho);
        double media = calcularMedia(num, tamanho);
        int maior = encontrarMaior(num, tamanho);
        int menor = encontrarMenor(num, tamanho);
        int qtdPares = contarPares(num, tamanho);
        int qtdImpares = contarImpares(num, tamanho);

        //Exibição
        System.out.printf("Quantidade de números: %d%n", quantidade);
        System.out.printf("Soma: %d%n", soma);
        System.out.printf("Média: %.1f%n", media);
        System.out.printf("Maior número: %d%n", maior);
        System.out.printf("Menor número: %d%n", menor);
        System.out.printf("Quantidade de pares: %d%n", qtdPares);
        System.out.printf("Quantidade de ímpares: %d%n", qtdImpares);
    }

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

    // ===================== FUNÇÕES - EXERCÍCIO 4 (AZULEJOS) =====================

    public static int calcularQuantidadeAzulejos(double alturaP, double LarguraP, double alturaA, double larguraA) {
        double areaParede = alturaP * LarguraP;
        double areaAzulejo = alturaA * larguraA;
        return (int) Math.ceil(areaParede / areaAzulejo);
    }

    // ===================== FUNÇÕES - EXERCÍCIO 5 (VOLUME LATA) =====================

    public static double calcularVolumeLata(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    // ===================== FUNÇÕES - EXERCÍCIO 6 (POTÊNCIA) =====================

    public static double calcularPotencia(double massa, double altura, double tempo) {
        double g = 9.81;
        return (massa * g * altura) / tempo;
    }

    // ===================== FUNÇÕES - EXERCÍCIO 7 (FATORIAL) =====================

    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    // ===================== FUNÇÕES - EXERCÍCIO 8 (CONVERSÃO DE SEGUNDOS) =====================

    public static int[] converterSegundos(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;
        return new int[]{horas, minutos, segundosRestantes};
    }

    // ===================== FUNÇÕES - EXERCÍCIO 9 (SISTEMA DE NOTAS) =====================

    public static String verSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    // ===================== FUNÇÕES - EXERCÍCIO 10 (SISTEMA DE CAIXA) =====================

    public static double calcularTotal(double[] precos, int quantidade) {
        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += precos[i];
        }
        return total;
    }

    public static double Desconto(double total) {
        if (total > 500) {
            return 0.15; 
        } else if (total > 200) {
            return 0.10; 
        } else {
            return 0;
        }
    }

    public static double calcularValorFinal(double total, double percentualDesconto) {
        return total - (total * percentualDesconto);
    }

    // ===================== FUNÇÕES - EXERCÍCIO 11 (ANÁLISE DE NÚMEROS) =====================

    public static int maiorNumero(int[] numeros){
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static int menorNumero(int[] numeros){
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static int numerosPares(int[] numeros){
        int pares = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                pares++;
            }
        }
        return pares;
    }
     public static double mediaNumeros(int[] numeros){
        int soma = 0;
        for (int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        return (double) soma / numeros.length;

    }

    // ===================== FUNÇÕES - EXERCÍCIO 12 (SISTEMA DE ESTATÍSTICAS DE NÚMEROS) =====================

    // 1. Quantidade de números válidos
static int contarQuantidade(int[] numeros, int tamanho) {
    return tamanho;
}

static int calcularSoma(int[] numeros, int tamanho) {
    int soma = 0;
    for (int i = 0; i < tamanho; i++) {
        soma += numeros[i];
    }
    return soma;
}

static double calcularMedia(int[] numeros, int tamanho) {
    return (double) calcularSoma(numeros, tamanho) / tamanho;
}

static int encontrarMaior(int[] numeros, int tamanho) {
    int maior = numeros[0];
    for (int i = 1; i < tamanho; i++) {
        if (numeros[i] > maior) {
            maior = numeros[i];
        }
    }
    return maior;
}

static int encontrarMenor(int[] numeros, int tamanho) {
    int menor = numeros[0];
    for (int i = 1; i < tamanho; i++) {
        if (numeros[i] < menor) {
            menor = numeros[i];
        }
    }
    return menor;
}

static int contarPares(int[] numeros, int tamanho) {
    int contador = 0;
    for (int i = 0; i < tamanho; i++) {
        if (numeros[i] % 2 == 0) {
            contador++;
        }
    }
    return contador;
}

static int contarImpares(int[] numeros, int tamanho) {
    int contador = 0;
    for (int i = 0; i < tamanho; i++) {
        if (numeros[i] % 2 != 0) {
            contador++;
        }
    }
    return contador;
}
}