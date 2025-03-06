package heranca;

public class Animal {

	String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {

		return this.nome;
	}
}
