import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] novoVetor = new int[vetor.length - 1];

        // Mostrar o vetor ao usuário
        System.out.print("Vetor atual: ");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Digite o numero que deseja remover: ");
        int numeroRemover = scanner.nextInt();

        boolean removido = false;
        int j = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (!removido && vetor[i] == numeroRemover) {
                removido = true; // Pula essa posição
                continue;
            }
            if (j < novoVetor.length) {
                novoVetor[j] = vetor[i];
                j++;
            }
        }

        if (!removido) {
            System.out.println("Numero não encontrado no vetor.");
        } else {
            System.out.print("Vetor apos remocao: ");
            for (int n : novoVetor) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}