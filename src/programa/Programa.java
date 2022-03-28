package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import novela.Elenco;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Caminho do arquivo: ");
		String caminho = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			List<Elenco> lista = new ArrayList<>();
			
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				lista.add(new Elenco(campos[0], Integer.parseInt(campos[1])));
				linha = br.readLine();
			}
			
			double media = lista.stream()
					.map(p -> p.getIdade())
					.reduce(0, (x,y) -> x + y) / lista.size();
			
			System.out.println("Média de idade: " + String.format("%.2f", media) + " anos, um bando de velha");
					
					
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();
		
	}

}
