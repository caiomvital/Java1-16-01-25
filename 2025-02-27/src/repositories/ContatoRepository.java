package repositories;

import model.Contato;

public interface ContatoRepository extends Repository<Contato> {

	void salvar(Contato contato);
	Contato localizarPorNome(String nome); 
	void listar();
	void alterar(int index, Contato contato);
	void remover(Contato contato);
	
	
	
}
