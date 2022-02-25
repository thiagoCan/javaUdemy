package estruturaRepetitivaFor;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < N; i++) {
			soma += sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
