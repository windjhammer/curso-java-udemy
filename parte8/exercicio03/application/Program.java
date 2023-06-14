package parte8.exercicio03.application;

import java.util.Scanner;

import parte8.exercicio03.entities.Student;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student student = new Student();

        student.nome = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota2 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.notaFinal());

        if (student.notaFinal() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.pontosFaltantes());
        } 
        else{
            System.out.println("PASS");
        }
        sc.close();
    }
}
