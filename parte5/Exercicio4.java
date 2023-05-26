import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int inicio, termino, duracao;
        Scanner sc = new Scanner(System.in);
        inicio = sc.nextInt();
        termino = sc.nextInt();
        if (inicio < termino){
            duracao = termino - inicio;
        }
        else{
            duracao = 24 - inicio + termino;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        sc.close();
    }
}
