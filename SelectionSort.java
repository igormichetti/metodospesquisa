public class SelectionSort {
    public static void main(String[] args) {
        int[] vetor = {3, 6, 8, 1, 4, 9, 0};

        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        selectionSort(vetor);

        System.out.println("Vetor ordenado:");
        imprimirVetor(vetor);
    }

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            if (indiceMinimo != i) {
                int temp = vetor[i];
                vetor[i] = vetor[indiceMinimo];
                vetor[indiceMinimo] = temp;
            }
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}