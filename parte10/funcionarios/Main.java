package funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quantos Funcionarios serão registrados? ");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			System.out.println();
			System.out.println("Funcionário #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("ID em uso: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			Double salary = sc.nextDouble();
			
			Funcionario funci = new Funcionario(id, name, salary);
			
			list.add(funci );
		}
		
		System.out.println();
		System.out.print("Digite o ID do Funcionario que receberá aumento: ");
		int idsalary = sc.nextInt();

		Funcionario funci = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		if (funci == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			funci.aumentoDeSalario(percent);
		}
		
		System.out.println();
		System.out.println("Lista de Funcionarios:");
		for (Funcionario e : list) {
			System.out.println(e);
		}		
		
		sc.close();
	}

	public static Integer position(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario funci = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funci != null;
	}
}