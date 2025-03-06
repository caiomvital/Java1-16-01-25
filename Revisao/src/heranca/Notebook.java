package heranca;

public class Notebook extends Eletronico {

	private String processador;
	
	public Notebook(String nome, double preco, String tipo, String processador) {
		super(nome, preco, tipo);
		this.processador = processador;
	}
	
	public String getProcessador() {
		return processador;
	}
	
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nProcessador: " + processador;
	}
	
	public void exibirProcessador() {
		super.toString();
		System.out.println("Processador: " + processador);
	}
	
	

}
