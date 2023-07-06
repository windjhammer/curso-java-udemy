package parte10;

import java.util.Scanner;

/**
 * Alturas
 */
public class Alturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, menores;
        double alturaTotal, alturaMedia, percentualMenores;
        System.out.println("Quantas pessoas serao digitadas?");
        n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] altuas = new double[n];

        for (int i=0; i<idades.length; i++){
            System.out.printf("Dados da %da pessoa:", i);
            System.out.println("Nome: ");
            nomes[i] = sc.nextLine();
            
        }
        sc.close();
    }
}