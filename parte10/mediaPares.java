

import java.util.Scanner;

/**
 * mediaPares
 */
public class mediaPares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        double media = 0;
        System.out.println("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();
        int vetor[] = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                media = media + vetor[i];
                pares++;
            }
        }
        if (pares == 0) {
            System.out.println("NENHUM NÚMERO PAR");
        } else {
            media = (double)media / pares;
            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        }

        sc.close();
    }
}