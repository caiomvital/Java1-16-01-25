package complementos.enums;

public enum Moeda {
	
	//constantes de um enum -> BRL, USD, EUR
	//valores definidos -> nome(Real, Dólar, Euro) e simbolo (R$, US$, Є)
	BRL("Real", "R$"),
	USD("Dólar", "US$"),
	EUR("Euro", "Є"),
	YEN("Iene", "Y"),
	PES("Peso", "P$");
	//atributos como final -> constantes
	private final String nome;
	private final String simbolo;

	//construtor com os atributos acima
	Moeda(String nome, String simbolo) {
		this.nome = nome;
		this.simbolo = simbolo;
	}
	
	//getters para os atributos
	public String getNome() {
		return nome;
	}
	
	public String getSimbolo() {
		return simbolo;
	}
	
	
	

}
