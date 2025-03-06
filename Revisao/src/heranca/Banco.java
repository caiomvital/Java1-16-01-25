package heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

	private static List<Conta> contas = new ArrayList<>();
	
	public static void criarConta() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome do titular");
		String titular = scan.nextLine();
		System.out.println("Informe o saldo inicial: ");
		double saldoInicial = scan.nextDouble();
		Conta c = new Conta(titular, saldoInicial);
		contas.add(c);
	}
	
	public static void listarContas() {
		for(Conta c : contas) {
			System.out.println(c.titular);
			System.out.println(c.saldo);
		}
		
		
	}
	
	
}
