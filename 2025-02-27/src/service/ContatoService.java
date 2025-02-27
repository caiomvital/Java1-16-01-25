package service;

import java.util.Scanner;

import model.Contato;
import repositories.ContatoRepositoryImpl;

public class ContatoService {

	private ContatoRepositoryImpl repository;
	private static Scanner scan = new Scanner(System.in);

	public ContatoService(ContatoRepositoryImpl repository) {
		this.repository = repository;
	}

	public void salvar() {
		System.out.println("Digite o nome do contato: ");
		String nome = scan.nextLine();

		while (nome.length() < 3) {
			System.out.println("Digite um nome com pelo menos 3 caracteres: ");
			nome = scan.nextLine();
		}
		// REGEX -> Regular Expressions -> Expressões Regulares
		System.out.println("Digite o telefone do contato: ");
		String telefone = scan.nextLine();
		while (telefone.length() < 10) {
			System.out.println("Digite um telefone válido: ");
			telefone = scan.nextLine();
		}

		Contato contato = new Contato(nome, telefone);

		repository.salvar(contato);

	}

	public void localizarPorNome() {
		System.out.println("Digite o nome: ");
		String nome = scan.nextLine();
		Contato contato = repository.localizarPorNome(nome);

		if (contato != null) {
			System.out.println(contato);
		}

	}
	
	public void listarContatos() {
		repository.listarContatos();
	}
	
	
	
}
