public class ListQ9 {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        int count = 0;
        int numero = 1;
        
        while (count < vetor.length) {
            boolean multiploDe7 = (numero % 7 == 0);
            boolean terminaCom7 = (numero % 10 == 7);

            if (!multiploDe7 && !terminaCom7) {
                vetor[count] = numero;
                count++;
            }
            numero++;
        }

        System.out.println("Vetor preenchido:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}

