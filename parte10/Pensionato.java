import java.util.Scanner;

public class Pensionato {
  public static void main(String[] args) {
    java.util.Scanner sc = new Scanner(System.in);
    int[] quartos = new int[10];
    System.out.println("Quantos quartos serão alugados? ");
    int n = sc.nextInt();
    for (int i = 0;i < n; i++) {
      System.out.printf("Rent #%d\n", i);
      System.out.println("Name: ");
    }

    sc.close();
  }
}
