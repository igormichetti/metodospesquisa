import java.util.Arrays;
import java.util.Random;


public class SortTest {
    public static void main(String[] args) {
        int[] vetor = gerarVetorAleatorio(1000); // Gera um vetor aleatório com 1000 elementos

        int[] vetorSelectionSort = vetor.clone(); // Cria uma cópia do vetor para o Selection Sort
        int[] vetorBubbleSort = vetor.clone(); // Cria uma cópia do vetor para o Bubble Sort

        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        // Teste do Selection Sort
        long selectionSortStartTime = System.nanoTime();
        SelectionSort.selectionSort(vetorSelectionSort);
        long selectionSortEndTime = System.nanoTime();

        System.out.println("Vetor ordenado pelo Selection Sort:");
        imprimirVetor(vetorSelectionSort);

        // Teste do Bubble Sort
        long bubbleSortStartTime = System.nanoTime();
        BubbleSort.bubbleSort(vetorBubbleSort, vetorBubbleSort.length);
        long bubbleSortEndTime = System.nanoTime();

        System.out.println("Vetor ordenado pelo Bubble Sort:");
        imprimirVetor(vetorBubbleSort);

        // Verificar se os vetores estão ordenados corretamente
        boolean selectionSortOrdenado = isOrdenado(vetorSelectionSort);
        boolean bubbleSortOrdenado = isOrdenado(vetorBubbleSort);

        System.out.println("Verificação de ordenação:");
        System.out.println("Selection Sort: " + (selectionSortOrdenado ? "Ordenado" : "Não ordenado"));
        System.out.println("Bubble Sort: " + (bubbleSortOrdenado ? "Ordenado" : "Não ordenado"));

        // Calcular o tempo de execução de cada algoritmo
        long selectionSortExecutionTime = selectionSortEndTime - selectionSortStartTime;
        long bubbleSortExecutionTime = bubbleSortEndTime - bubbleSortStartTime;

        System.out.println("Tempo de execução:");
        System.out.println("Selection Sort: " + selectionSortExecutionTime + " nanossegundos");
        System.out.println("Bubble Sort: " + bubbleSortExecutionTime + " nanossegundos");
    }

    public static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(1000); // Números aleatórios entre 0 e 999
        }

        return vetor;
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.println(Arrays.toString(vetor));
    }

    public static boolean isOrdenado(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }
        return true;
    }
}