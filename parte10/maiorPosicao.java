

import java.util.Scanner;

/**
 * maiorPosicao
 */
public class maiorPosicao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int maiorPosicao = 0;
        double maiorValor = 0;
        double[] vetor = new double[n];
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }
        for (int i = 0; i<vetor.length; i++){
            if (vetor[i] > maiorValor){
                maiorValor = vetor[i];
                maiorPosicao = i;
                
            }
        }
        System.out.printf("Maior valor = %.1f\n", maiorValor);
        System.out.printf("Posição do maior valor = %d\n", maiorPosicao);
            sc.close();
    }
}