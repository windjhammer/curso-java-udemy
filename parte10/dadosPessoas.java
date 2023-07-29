

import java.util.Scanner;

/**
 * dadosPessoas
 */
public class dadosPessoas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, homens, mulheres;
        double menor, maior, mediaF, totalF;
        System.out.println("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        char[] genero = new char[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %d pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Gênero da %d pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }
        menor = altura[0];
        maior = altura[0];

        for (int i = 1; i < n; i++) {
            if (altura[i] > maior) {
                maior = altura[i];
            }
            if (altura[i] < menor) {
                menor = altura[i];
            }
        }
            homens = 0;
            mulheres = 0;
            totalF = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i] == 'M') {
                homens++;
            }
            else{
                mulheres++;
                totalF = totalF+altura[i];
            }
        }
        mediaF = totalF/mulheres;

        System.out.printf("Menor altura = %.2f\n", menor);
        System.out.printf("Maior altura = %.2f\n",maior);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaF);
        System.out.printf("Número de homens = %d\n", homens);
        sc.close();
    }
}
