package view;

import model.Contato;
import repositories.ContatoRepositoryImpl;
import service.ContatoService;

public class Principal {
public static void main(String[] args) {
	
	
	
	ContatoRepositoryImpl impl = new ContatoRepositoryImpl();

	ContatoService service = new ContatoService(impl);
	service.salvar();
	
	System.out.println(ContatoRepositoryImpl.contatos);
	
	
	service.localizarPorNome();
	service.salvar();
	service.salvar();
	
	
	service.listarContatos();
	
}
}
