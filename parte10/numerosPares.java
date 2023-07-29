
import java.util.Scanner;

/**
 * numerosPares
 */
public class numerosPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        int pares = 0;
        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("\nNúmeros Pares: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d ", vetor[i]);
                pares++;
            }
        }
        System.out.printf("\n\nQuantidade de Pares = %d\n", pares);

        sc.close();
    }
}