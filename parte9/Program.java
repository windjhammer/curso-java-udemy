package parte9;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Cliente conta;
    System.out.print("Enter account number: ");
    int numero = sc.nextInt();
    System.out.print("Enter account holder: ");
    sc.nextLine();
    String titular = sc.nextLine();
    System.out.print("Is there an initial deposit? (y/n)");
    char resposta = sc.next().charAt(0);
    if (resposta == 'y') {
      System.out.print("Enter the initial deposit value: ");
      double depositoInicial = sc.nextDouble();
      conta = new Cliente(numero, titular, depositoInicial);
    } else {
      conta = new Cliente(numero, titular);
    }
    System.out.println();
    System.out.println("Account data: ");
    System.out.println(conta);

    System.out.println();
    System.out.println("Enter a deposit value: ");
    double valorDeposito = sc.nextDouble();
    conta.deposito(valorDeposito);
    System.out.println("Updated account data: ");
    System.out.println(conta);

    System.out.println();
    System.out.println("Enter a withdraw value: ");
    double valorSaque = sc.nextDouble();
    conta.saque(valorSaque);
    System.out.println("Updated account data: ");
    System.out.println(conta);
    sc.close();
  }
}
