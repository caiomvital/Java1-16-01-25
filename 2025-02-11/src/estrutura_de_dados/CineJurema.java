package estrutura_de_dados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CineJurema {
public static void main(String[] args) {
	/*	Jurema quer organizar seus 10 filmes favoritos. 

		Crie um programa que permita adicionar até 10 filmes 
		a uma lista. 
		Caso mais de 10 filmes sejam inseridos, mostre 
		uma mensagem de aviso.

	 * */
	Scanner scan = new Scanner(System.in);
	List<String> filmes = new ArrayList<>();

	String filme = "";
	
	while(true) {
		
		System.out.println("Adicione um novo título: ");
		filme = scan.nextLine();
		filmes.add(filme);
		
		System.out.println("Deseja adicionar um novo filme?");
		int opcao = scan.nextInt(); scan.nextLine();
		
		if(filmes.size() >= 3) {
			System.out.println("3 filmes já foram adicionados");
			
			for(String f : filmes) {
				
				System.out.println(filmes.indexOf(f) + 1 + ". " + f);
			}
			break;
		}
		
		if(opcao == 2) {
			int cont = 0;
			
			for(String f : filmes) {
				cont++;
				System.out.println(cont + ". " + f);
			}
			break;
		} else {
			continue;
		}
		
		
//		if(filmes.size() < 3) {
//			System.out.println("Adicione um novo título: ");
//			filme = scan.nextLine();
//			filmes.add(filme);
//		} else {
//			System.out.println("10 filmes já foram adicionados");
//			int cont = 0;
//			
//			for(String f : filmes) {
//				cont++;
//				System.out.println(cont + ". " + f);
//			}
//			
//			System.out.println("Deseja adicionar um novo filme?");
//			int opcao = scan.nextInt(); scan.nextLine();
//			if(opcao == 2) {
//				break;
//			}
			
//		}
		
	}
	
	
}
}
