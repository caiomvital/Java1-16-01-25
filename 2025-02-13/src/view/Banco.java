package view;

import model.Conta;

public class Banco {
	public static void main(String[] args) {

	Conta contaDeTadeu = new Conta("Tadeu", 1000);
	Conta contaDeJessica = new Conta("Jéssica");
	
//	System.out.println(contaDeTadeu.saldo);
//	contaDeTadeu.nome = "Francisca";
	
	
	System.out.println("Nome: " + contaDeTadeu.getNome());
	
	
	}
}
