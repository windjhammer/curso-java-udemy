import java.util.Scanner;

public class Exemplo{
    public static void main(String[] args) {

        double media;

        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
    
        media = (nota1+nota2);

        if (media < 60) {
            System.out.printf("NOTA FINAL = %.1f%n", media);
            System.out.println("REPROVADO");
        }
        else{
            System.out.printf("NOTA FINAL = %.1f%n", media);
        }
    }
}
