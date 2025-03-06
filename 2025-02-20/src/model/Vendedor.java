package model;

import java.util.Scanner;

public class Vendedor extends Pessoa implements Trabalhador, HoraExtra {

	@Override
	public void exercerFuncao() {
		System.out.println("O vendedor está com um cliente no telefone");
		
	}

	@Override
	public double calcularSalario(double valor) {
		if(fezHoraExtra()) {
			return valor * 1.2;	
		}
		return valor;
	}

	@Override
	public boolean fezHoraExtra() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Deseja fazer hora extra? 1 sim 2 nao");
		int opcao = scan.nextInt();
		if(opcao == 1) {
			return true;
		}
		return false;
		
	}

	
	

	

}
