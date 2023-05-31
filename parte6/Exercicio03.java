import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        int alc = 0;
        int gas = 0;
        int dis = 0;
        while(entrada != 4){
            if(entrada == 1){
                alc = alc + 1;
            }
            else if(entrada ==2){
                gas = gas + 1;
            }
            else if(entrada == 3){
                dis = dis + 1;
            }
            entrada = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool %d%n", alc);
        System.out.printf("Gasolina %d%n", gas);
        System.out.printf("Diesel %d%n", dis);
        sc.close();
    }
}
