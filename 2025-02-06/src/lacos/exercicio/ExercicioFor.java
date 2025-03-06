package lacos.exercicio;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		//adicione n alunos em uma turma
		//peca o nome e o sobrenome de cada um
		//exiba os nomes completos dos n alunos
		Scanner scan = new Scanner(System.in);

		//peca ao usuario para informar quantos alunos
		//ele quer adicionar
		String alunos = "";
		String nome = "";
		String sobrenome = "";
		int qtdAlunos = 0;
		
		System.out.println("Informe a quantidade de alunos: ");
		qtdAlunos = scan.nextInt(); scan.nextLine();
		
		for(int i = 0; i < qtdAlunos; i++) {
			
			System.out.println("Informe o nome do aluno #" + (i+1));
			nome = scan.nextLine();
			System.out.println("Informe o sobrenome do aluno #" + (i+1));
			sobrenome = scan.nextLine();
			alunos += (i+1) + ". " + nome + " " + sobrenome + "\n";
			
		}
		
		System.out.println(alunos);
		

	}

}
