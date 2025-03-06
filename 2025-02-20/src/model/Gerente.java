package model;

import java.util.Scanner;

public class Gerente extends Pessoa implements Trabalhador, HoraExtra {

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

	@Override
	public void exercerFuncao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularSalario(double valor) {
		if(fezHoraExtra()) {
			return valor * 1.5;
		}
		return valor;
	}

}
