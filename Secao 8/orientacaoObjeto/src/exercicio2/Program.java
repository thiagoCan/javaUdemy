package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double grossSalary, tax;
		
		
		System.out.print("Name: ");
		name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		tax = sc.nextDouble();
		
		Employee emp = new Employee(name, grossSalary, tax);
		
		System.out.println(emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		System.out.println();
		
		System.out.print("Updated data: ");
		System.out.printf(name + ", $ " + "%.2f", emp.increaseSalary(percentage));
		
		sc.close();
	}

}
