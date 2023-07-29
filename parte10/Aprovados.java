

import java.util.Scanner;

/**
 * Aprovados
 */
public class Aprovados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String aprovado = "";
        System.out.println("Quantos alunos serão digitados?");
        n = sc.nextInt();
        double[] n1 = new double[n];
        String[] nomes = new String[n];
        double[] n2 = new double[n];
        for (int i = 0; i < n1.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno\n", i + 1);
            nomes[i] = sc.next();
            n1[i] = sc.nextDouble();
            n2[i] = sc.nextDouble();
        }
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n1.length; i++) {
            if((n1[i]+n2[i])/2 >= 6){
                aprovado = nomes[i];
                System.out.println(aprovado);
            }
        }
        sc.close();
    }
}