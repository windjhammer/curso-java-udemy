
import java.util.Scanner;

/**
 * Alturas
 */
public class Alturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, nmenores;
        double alturaTotal, alturaMedia, percentualMenores;
        System.out.println("Quantas pessoas serao digitadas?");
        n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i=0; i<idades.length; i++){
            System.out.printf("Dados da %da pessoa:", i);
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble();
        }
        nmenores = 0;
        alturaTotal = 0;
        for (int i=0; i<idades.length; i++){
            if (idades[i] < 16) {
                nmenores++;
            }
            alturaTotal = alturaTotal + alturas[i];
        }
        alturaMedia = alturaTotal / n;
	    percentualMenores = ((double)nmenores / n) * 100.0;

	    System.out.printf("\nAltura media = %.2f\n", alturaMedia);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

	    for(int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	        	System.out.printf("%s\n", nomes[i]);
	        }
	    }
        sc.close();
    }
}