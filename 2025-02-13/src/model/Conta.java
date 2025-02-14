package model;

import java.time.Instant;

public class Conta {
	
	private String nome;
	private double saldo;
	
	
	
	public Conta(String nome) {
		this.nome = nome;
		this.saldo = 0;
	}
	
	public Conta(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	

	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void transferir(Conta contaDestino, double valor) {
		sacar(valor);
		contaDestino.depositar(valor);
		System.out.println("Transferência realizada em " + Instant.now().toString());
	}
	
	
	
	
	
}
