package exercicio_condicional;
import java.util.Random;
import java.util.Scanner;

public class ExercicioJoKenPo {
/* 2º DESAFIO 
Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		String jogador;
		int computador = r.nextInt(3);
		String jogadaComputador;
		
		if(computador == 0) {
			jogadaComputador = "Pedra";
		} else if(computador == 1) {
			jogadaComputador = "Papel";
		} else {
			jogadaComputador = "Tesoura";
		}
		
		String jokenpo = """
				Escolha uma das opções abaixo:
				Pedra
				Papel
				Tesoura
				""";
	
		System.out.println(jokenpo);

		jogador = scan.nextLine();
		
		if( jogador.equalsIgnoreCase(jogadaComputador) ) {
			System.out.println("Você escolheu " + jogador);
			System.out.println("Computador escolheu " + jogadaComputador);
			System.out.println("Empate!");
		} else 
		if((jogador.equalsIgnoreCase("Tesoura") && 
				jogadaComputador.equalsIgnoreCase("Papel")) || 
				(jogador.equalsIgnoreCase("Pedra") &&
				jogadaComputador.equalsIgnoreCase("Tesoura")) ||
				(jogador.equalsIgnoreCase("Papel") &&
						jogadaComputador.equalsIgnoreCase("Pedra"))) {
			System.out.println("Você escolheu " + jogador);
			System.out.println("Computador escolheu " + jogadaComputador);
			System.out.println("Você venceu");
			
		} else {
			System.out.println("Você escolheu " + jogador);
			System.out.println("Computador escolheu " + jogadaComputador);
			System.out.println("Computador venceu");
		}
			
			
			
			
			
			
			
 			
		}
	}

