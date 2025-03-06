package controller;

import java.util.Scanner;

public class Validadores {

	private static Scanner scan = new Scanner(System.in);
	
	public static String validarNome() {
		System.out.println("Digite o nome do contato: ");
		String nome = scan.nextLine();
		
		while(nome.length() < 3) {
			System.out.println("Digite um nome com pelo menos 3 caracteres: ");
			nome = scan.nextLine();
		}
		return nome;
	}
	
	public static String validarTelefone() {
		System.out.println("Digite o telefone do contato: ");
		String telefone = scan.nextLine();
		
		while(telefone.length() < 10) {
			System.out.println("Digite um telefone com pelo menos 10 caracteres: ");
			telefone = scan.nextLine();
		}
		return telefone;
	}
	
}
