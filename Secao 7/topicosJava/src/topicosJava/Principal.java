package topicosJava;

public class Principal {

	public static void main(String[] args) {
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

	}

}
