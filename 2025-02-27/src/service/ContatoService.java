package service;

import java.util.Scanner;

import controller.Validadores;
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
		String nome = Validadores.validarNome();

		// REGEX -> Regular Expressions -> Expressões Regulares
		System.out.println("Digite o telefone do contato: ");
		String telefone = Validadores.validarTelefone();
	
		Contato contato = new Contato(nome, telefone);

		repository.salvar(contato);

	}

	public Contato localizarPorNome() {
		System.out.println("Digite o nome: ");
		String nome = scan.nextLine();
		Contato contato = repository.localizarPorNome(nome);

		if (contato != null) {
			return contato;
		}
		
		return null;

	}
	
	public void listarContatos() {
		repository.listar();
	}
	
	public void alterar() {
		System.out.println("Informe o nome do contato a ser alterado:");
		String nome = scan.nextLine();
		Contato contato = repository.localizarPorNome(nome);
		int index = repository.retornarId(contato);
		
		if(contato != null) {
			System.out.println("Digite o novo nome do contato: ");
			nome = Validadores.validarNome();
			System.out.println("Digite o novo telefone do contato: ");
			String telefone = Validadores.validarTelefone();
			Contato novoContato = new Contato(nome, telefone);
			repository.alterar(index, novoContato);
		} else {
			System.out.println("contato não encontrado");
		}
		
	}
	
	public void remover() {
		Contato contato = localizarPorNome();
		
		if(contato != null) {
			repository.remover(contato);
		} else {
			System.out.println("Contato não encontrado");
		}
	}
	
	
	
	
}
