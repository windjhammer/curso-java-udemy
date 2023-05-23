import java.util.Scanner;

public class ExerciciosIniciantes1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int primeiroValor = sc.nextInt();
        int segundoValor =sc.nextInt();

        int soma = primeiroValor+segundoValor;

        System.out.printf("SOMA = %d%n", soma);

        sc.close();
    }
}