package heranca;

public class Eletronico extends Produto {

	private String tipo;
	
	public Eletronico(String nome, double preco) {
		super(nome, preco);
		
	}
	
	public Eletronico(String nome, double preco, String tipo) {
		super(nome, preco);
		this.tipo = tipo;
	
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Tipo: " + tipo;
		
	}
	

}
