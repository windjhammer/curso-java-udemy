import java.text.ParseException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Pensionato[] vetor = new Pensionato[10];

        System.out.println("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Aluguel #"+ i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vetor[quarto] = new Pensionato(nome, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for(int i = 0; i<10;i++){
            if(vetor[i] != null){
                System.out.println(i + ": "+vetor[i]);
            }
        }
        sc.close();
    }
}