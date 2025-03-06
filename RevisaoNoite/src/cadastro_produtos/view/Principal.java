package cadastro_produtos.view;

import java.util.Scanner;

import cadastro_produtos.controller.Validacoes;

public class Principal {
public static void main(String[] args) {
	//Loja.iniciarAplicacao();
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite um cpf: ");
	String cpf = Validacoes.validarCPF();
	
	System.out.println(cpf);
	//12345678910
	//123.456.789-10
	
	//System.out.println("Obrigado por usar nossa aplicação");
}



	
}
