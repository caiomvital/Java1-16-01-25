package p_o_o;

import java.util.Scanner;

public class TesteGato {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);

	Gato gato = new Gato();
	System.out.println("Diga o nome do seu gato: ");
	String nomeDoGato = scan.nextLine();
	gato.nome = scan.nextLine();
	gato.exibirNome();
	
	Gato gato2 = new Gato();
	System.out.println("Diga o nome do seu gato: ");
	nomeDoGato = scan.nextLine();
	gato2.nome = nomeDoGato;
	gato2.exibirNome();
	
}
}
