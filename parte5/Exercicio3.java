import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a % b == 0 || b % a == 0){
            System.out.println("São Múltiplos");
        }
        else{
            System.out.println("Não são Múltiplos");
        }
        sc.close();
    }
}
