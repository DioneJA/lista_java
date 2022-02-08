package exercicio_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employees> list = new ArrayList<>();// declarando uma lista da classe

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nEmployee #" + (i + 1) + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: $");
			double salary = sc.nextDouble();

			Employees emp = new Employees(id, name, salary);
			list.add(emp);
		}

		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		if (searchId(list, id) == -1) {
			System.out.println("This id does not exist!");
		} else {
			int pos = searchId(list, id);
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increase(percent);
		}

		System.out.println("\nList of employees: ");
		for (Employees x : list) {
			System.out.println(x);
		}
		sc.close();
	}

	// funcao de busca
	public static int searchId(List<Employees> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}
}
