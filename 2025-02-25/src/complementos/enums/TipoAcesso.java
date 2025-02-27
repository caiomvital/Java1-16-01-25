package complementos.enums;

public enum TipoAcesso {

	USER("Usuário"),
	ADMIN("Administrador");
	
	private final String nome;
	
	TipoAcesso(String nome) {
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}
	
}
