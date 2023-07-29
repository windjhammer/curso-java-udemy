

import java.util.Scanner;

/**
 * maisVelho
 */
public class maisVelho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        int maisVelho = 0;
        int posicaoNome = 0;
        int[] vetorNumero = new int[n];
        String[] vetorNomes = new String[n];
        for (int i = 0; i < vetorNumero.length; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.println("Nome: ");
            vetorNomes[i] = sc.next();
            System.out.println("Idade: ");
            vetorNumero[i] = sc.nextInt();
        }
        for (int i = 0; i < vetorNumero.length; i++) {
            if (vetorNumero[i] > maisVelho) {
                maisVelho = vetorNumero[i];
                posicaoNome = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s\n", vetorNomes[posicaoNome]);
        sc.close();
    }
}