package fwBw.resource;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[]
				{"Good morning", "Good afternoon", "Good night"};
		
		String path = "D:\\Backup_Thiago_linux\\Documentos\\eclipse\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("O programa terminou");

	}

}
