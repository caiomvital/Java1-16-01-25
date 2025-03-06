package repositories;

public interface Repository<T> {

	// Generics
	void salvar(T item);
	T localizarPorNome(String nome);
	void listar();
	void alterar(int index, T item);
	void remover(T item);

}
