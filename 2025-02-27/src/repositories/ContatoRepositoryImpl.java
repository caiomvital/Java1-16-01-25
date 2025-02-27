package repositories;

import java.util.ArrayList;
import java.util.List;

import model.Contato;

public class ContatoRepositoryImpl implements ContatoRepository {

	public static List<Contato> contatos = new ArrayList<>();
	
	@Override
	public void salvar(Contato contato) {
		contatos.add(contato);
		
	}

	@Override
	public Contato localizarPorNome(String nome) {
		for(Contato c : contatos) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void listarContatos() {
		for(Contato c : contatos) {
			System.out.println("... ... ...");
			System.out.println(c);
			System.out.println("... ... ...");
		}
		
	}
	
	
	
	
	

}
