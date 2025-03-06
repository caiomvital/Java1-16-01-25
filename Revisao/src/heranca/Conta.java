package heranca;

public class Conta {

	String titular;
	double saldo;
	
	public Conta(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}

	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void transferir(double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
	
}
