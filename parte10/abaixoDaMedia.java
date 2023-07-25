package parte10;

import java.util.Scanner;

/**
 * abaixoDaMedia
 */
public class abaixoDaMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();
        double media = 0;
        double[] vetor = new double[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }
        for (int i = 0; i < vetor.length; i++) {
            media = media + vetor[i];
        }
        media = media / n;
        System.out.printf("\nMÉDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }
}