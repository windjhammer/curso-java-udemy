import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            double num = sc.nextDouble();
            double deno = sc.nextDouble();
            if(deno == 0){
                System.out.println("divisao impossivel");
            }
            else{
                double divisao = (num / deno);
                System.out.println(divisao);
            }
        }
        sc.close();
    }
}
