import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salario = sc.nextDouble();
        double taxa; 
        if(salario <= 2000.00){
            System.out.println("Isento");
            taxa = 0.0;
        }
        else if(salario > 2000.00 && salario <= 3000.00){
            taxa = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", taxa);
        }
        else if(salario > 3000.00 && salario <=4500.00){
            taxa = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f%n", taxa);
        }
        else{
            taxa = (salario - 4500.00) * 0.28 + 1500.0 * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f%n", taxa);
        }
        sc.close();

    }
}
