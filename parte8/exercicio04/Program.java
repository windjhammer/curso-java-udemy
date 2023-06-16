package parte8.exercicio04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought: ");
        double amount = sc.nextDouble();

        double total = CurrencyConverter.dollarxReal(dollarPrice, amount);

        System.out.printf("Amount to be paid in reais = R$%.2f", total);
        sc.close();
    }
}