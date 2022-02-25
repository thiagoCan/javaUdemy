package membrosEstaticos;

public class Calculator {
		//"final" significa que a variável é uma constante.
		public final double PI = 3.14159;
		
		public double circumference (double radius) {
			return 2 * PI * radius;
		}
		
		public double volume (double radius) {
			return 4 * PI * radius*radius*radius / 3;
		}
}
