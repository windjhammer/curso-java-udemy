package parte10;
import java.util.Scanner;

/**
 * SomaVetor
 */
public class SomaVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double soma, media;
        System.out.println("Quantos números você vai digitar? ");
        n = sc.nextInt();
        double[] vetor = new double[n];
        for (int i=0; i<vetor.length; i++){
                System.out.println("Digite um número: ");
                vetor[i] = sc.nextDouble();
        }
        soma = 0;
        for (int i=0; i<vetor.length; i++){
            soma = soma + vetor[i];
        }
        media = soma / vetor.length;
        System.out.print("VALORES = " );
        for (int i=0; i<vetor.length; i++){
            System.out.printf("%.1f " , vetor[i]);
        }
        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("\nMEDIA = %.2f\n", media);
        sc.close();
    }
}