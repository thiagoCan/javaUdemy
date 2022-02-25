package membrosEstaticos1;

public class Calculator {
		//"final" significa que a variável é uma constante.
		public static final double PI = 3.14159;
		
		public static double circumference (double radius) {
			return 2 * PI * radius;
		}
		
		public static double volume (double radius) {
			return 4 * PI * radius*radius*radius / 3;
		}
}
