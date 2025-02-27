package repositories;

import model.Contato;

public interface ContatoRepository extends Repository<Contato> {

	void salvar(Contato contato);
	Contato localizarPorNome(String nome); 
	void listarContatos();
	
	
	
}
