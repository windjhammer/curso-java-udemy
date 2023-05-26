import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        int entrada;

        Scanner sc = new Scanner(System.in);
        entrada = sc.nextInt();

        if (entrada%2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }
        sc.close();

    }
}
