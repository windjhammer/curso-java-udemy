

import java.util.Scanner;

/**
 * somaVetores
 */
public class somaVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Qauntos Valores vai ter cada vetor? ");
        n = sc.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorR = new int[n];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = sc.nextInt();
        }
        System.out.println("Vetor Resultante: ");
        for (int i = 0; i < vetorR.length; i++) {
            vetorR[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorR[i]);
        }
        sc.close();
    }
}