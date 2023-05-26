import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        int entrada;
        Scanner sc = new Scanner(System.in);
        entrada = sc.nextInt();
        if (entrada < 0){
            System.out.println("NEGATIVO");
        }
        else{
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }
}
