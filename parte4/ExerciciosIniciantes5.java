import java.util.Scanner;

public class ExerciciosIniciantes5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //int codigo1 = sc.nextInt();
        int quantidade1 = sc.nextInt();
        double valor1 = sc.nextDouble();

        //int codigo2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double total = (quantidade1*valor1) + (quantidade2*valor2);

        System.out.printf("VALOR A PAGAR R$ %.2f%n", total);

        sc.close();
    }
}
