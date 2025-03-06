package cadastro_produtos.controller;

import java.util.Scanner;

public class Validacoes {

	private static Scanner scan = new Scanner(System.in);
	
	public static String validarCPF() {
		String cpf = scan.nextLine();
		while(!cpf.matches("\\d{11}")) {
			System.out.println("cpf inválido, tente novamente; ");
			cpf = scan.nextLine();
		}
		return cpf;
	}
	
	public static double validarPreco() {
		double preco = scan.nextDouble();
		
		while(preco <= 0) {
			System.out.println("Preço inválido: digite novamente.");
			preco = scan.nextDouble(); scan.nextLine();
		}
		
		return preco;
	}
}
