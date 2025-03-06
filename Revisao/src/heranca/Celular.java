package heranca;

public class Celular extends Eletronico {

	private String marca;
	private String modelo;
	
	public Celular(String nome, double preco, String tipo, 
			String marca, String modelo) {
		super(nome, preco, tipo);
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		
		return super.toString()  + "\nMarca: " + marca + "\nModelo: " + modelo;
	}
	

	
}
