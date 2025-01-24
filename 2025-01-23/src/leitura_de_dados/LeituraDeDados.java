package leitura_de_dados;

import java.util.Scanner;

public class LeituraDeDados {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Digite seu peso: ");
		double peso = scan.nextDouble(); scan.nextLine();
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		
		System.out.print(String.format("Nome: %s Idade: %d anos Peso: %.2fkg", nome, idade, peso));
		
		
//		System.out.println("Entre com sua idade");
//		int idade = scan.nextInt();
//		//--------
//		System.out.println(idade);
//		double peso = scan.nextDouble();
//		//--------
//		String nome
		
//		System.out.println("Digite seu nome completo: ");
//		String nome = scan.nextLine();
//		System.out.printf("Olá, %s! Tudo bem?", nome);
		
		
//		int a, b;
//		
//		System.out.println("Insira o primeiro valor: ");
//		a = scan.nextInt();
//		System.out.println("Insira o segundo valor: ");
//		b = scan.nextInt();
//		int soma = a + b;
//		int subt = a - b;
//		int mult = a * b;
//		double div = (double) a / b;
//		System.out.printf("Soma: %d%n"
//				+ "Subtração: %d%n"
//				+ "Multiplicação: %d%n"
//				+ "Divisão: %f%n", soma, subt, mult, div);
		
		
		
//		
//		//leitura de dados do tipo double
//		System.out.println("Insira a primeira nota do aluno: ");
//		double nota1 = scan.nextDouble();
//		System.out.println("Insira a segunda nota do aluno: ");
//		double nota2 = scan.nextDouble();
//
//		double media = (nota1 + nota2) / 2;
//		
//		System.out.println("A média do aluno é: " + media);
		
		
		
	}
}
