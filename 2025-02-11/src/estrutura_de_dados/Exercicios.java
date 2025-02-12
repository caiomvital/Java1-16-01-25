package estrutura_de_dados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		//classes involucro
		//Integer para int
		//Double para double
		//Boolean para boolean
		//Character para char
		
		/*Seu Gumercindo tem uma pequena biblioteca em casa 
		 * e quer catalogar seus livros. 
		Crie um programa que permita adicionar, remover 
		e listar os títulos dos livros em uma lista.*/
		Scanner scan = new Scanner(System.in);

		List<String> livros = new ArrayList<>();
		
		String tituloLivro = "";
		int opcao = 0;
		
		String menu = """
				1. Adicionar Livro
				2. Remover Livro
				3. Listar Títulos
				4. Sair
				""";
		
		while(opcao != 4) {
			System.out.println(menu);
			opcao = scan.nextInt(); scan.nextLine();
			
			switch(opcao) {
			
			case 1 -> {
				System.out.println("Informe o título do livro: ");
				tituloLivro = scan.nextLine().toUpperCase();
				livros.add(tituloLivro);
				System.out.println("Livro adicionado com sucesso.");
			}
			
			case 2 -> {
				System.out.println("Informe o título do livro a ser removido: ");
				tituloLivro = scan.nextLine().toUpperCase();
				livros.remove(tituloLivro);
				System.out.println("Livro removido com sucesso.");
			}
			
			case 3 -> {
				
				for(String livro : livros) {
					System.out.println(livro);
				}
				
				
			}
			
			case 4 -> {
				System.out.println("Obrigado por usar a biblioteca");
			}
			
			default -> {}
			
			}
			
		}

	}

}
