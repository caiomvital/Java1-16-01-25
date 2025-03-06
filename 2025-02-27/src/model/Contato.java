package model;

public class Contato {

	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	
	public Contato() {}
	
	public Contato(String nome, String telefone, 
				   String email, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		}
	
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		String dados = String.format("""
				Nome: %s
				Telefone: %s
				Email: %s
				Endereco: %s
				""", nome, telefone, email, endereco);
		
		
		if(this.email == null || this.endereco == null) {
			dados = String.format("""
					~~~~~~~-----~~~~~~~
					Nome do Contato: %s
					Telefone: %s
					~~~~~~~-----~~~~~~~
					""", nome, telefone);
		}
		
		return dados;
	}
	
	
	
	
}
