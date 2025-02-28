package controller;

import java.util.Scanner;

import repositories.ContatoRepositoryImpl;
import service.ContatoService;

public class ContatoController {

	private static ContatoRepositoryImpl impl = new ContatoRepositoryImpl();

	private static ContatoService service = new ContatoService(impl);
	
	private static Scanner scan = new Scanner(System.in);
	
	private static final String MENU = """
			1 - Adicionar Contato
			2 - Listar Contatos
			3 - Localizar Contato
			4 - Alterar Contato
			5 - Remover Contato
			6 - Sair
			""";

	public static void iniciarPrograma() {
		
		while(true) {
		System.out.println(MENU);
		System.out.println("Digite sua opção: ");
		int opcao = scan.nextInt();
		
		switch(opcao) {
		case 1 -> service.salvar();
		case 2 -> service.listarContatos();
		case 3 -> System.out.println(service.localizarPorNome());
		case 4 -> service.alterar();
		case 5 -> service.remover();
		case 6 -> {return;}
		default -> System.out.println("Opção inválida");
		}
		}
	}
	
}

