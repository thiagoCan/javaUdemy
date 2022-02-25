package funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*double x = Math.sqrt(25);
		System.out.println(x);*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("higher = " + a);
		} else if (b > c) {
			System.out.println("Higher = " + b);
		} else {
			System.out.println("Higher = " + c);
		}
		
		sc.close();
	}

}
