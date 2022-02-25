package vetores1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite n: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		System.out.printf("Digite os valores do vetor de %d posições\n", n);
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		
		System.out.printf("%.2f", media(vect));
		
		sc.close();
	}
	
	public static double media (double[] vect) {
		
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		return sum/vect.length;
	}

}