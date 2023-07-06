package parte10;
import java.util.Scanner;

public class Negativos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Quantos números você vai digitar? ");
    n = sc.nextInt();
    int[] vetor = new int[n];
    for (int i=0; i<vetor.length; i++){
      System.out.println("Digite um número: ");
      vetor[i] = sc.nextInt();
    }
    System.out.println("Números negativos: ");
    for (int i=0; i<vetor.length; i++){
      if (vetor[i] < 0 ){
        System.out.printf("%d\n", vetor[i]);
      }
    }
    sc.close();
  }
}
