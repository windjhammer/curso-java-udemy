import java.util.Scanner;

public class ExerciciosIniciantes4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        double horasTrabalhadas = sc.nextDouble();
        double valorHora = sc.nextDouble();
        double salario = horasTrabalhadas*valorHora;

        System.out.printf("NUMBER = %d%n", numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}