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
		
		System.out.println("Caminho do arquivo: ");
		String caminho = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			List<Elenco> lista = new ArrayList<>();
			
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				lista.add(new Elenco(campos[0], Integer.parseInt(campos[1])));
				linha = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

}
