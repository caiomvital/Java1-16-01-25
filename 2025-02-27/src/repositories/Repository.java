package repositories;

public interface Repository<T> {

	// Generics
	void salvar(T item);
	T localizarPorNome(String nome);

}
