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

	public int retornarId(Contato contato) {
		return contatos.indexOf(contato);
	}

	@Override
	public Contato localizarPorNome(String nome) {
		for (Contato c : contatos) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void listar() {
		for (Contato c : contatos) {
			System.out.println("... ... ...");
			System.out.println(c);
			System.out.println("... ... ...");
		}

	}

	@Override
	public void alterar(int index, Contato contato) {

		contatos.set(index, contato);

	}

	@Override
	public void remover(Contato contato) {
		contatos.remove(contato);
		
	}
	
	

}
