public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {3, 6, 8, 1, 4, 9, 0};

        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        bubbleSort(vetor, vetor.length);

        System.out.println("Vetor ordenado:");
        imprimirVetor(vetor);
    }

    public static void bubbleSort(int[] vetor, int n) {
        if (n == 1)
            return;

        for (int i = 0; i < n - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                int temp = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = temp;
            }
        }

        bubbleSort(vetor, n - 1);
    }

    public static void imprimirVetor(int[] vetor) {
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}