package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		String path = "D:\\Backup_Thiago_linux\\Documentos\\POO\\udemy\\Map\\in.txt";

		Map<String, Integer> votes = new TreeMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String nome = fields[0];
				int count = Integer.parseInt(fields[1]);
				
				if(!votes.containsKey(nome)) {
					votes.put(nome, count);
				}
				else {
					votes.put(nome, count + votes.get(nome));
				}
				
				line = br.readLine();
			}
			
			for (String st : votes.keySet()) {
				System.out.println(st + ":" + votes.get(st));
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
