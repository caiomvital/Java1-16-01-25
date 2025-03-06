package lacos;

import java.util.Scanner;

public class LacoWhile {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	/*
	 * 18) Crie um programa que leia vários números pelo teclado 
	 * e mostre no final o somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado
	 * */
	int numero = 0;
	int soma = 0;
	
	while(true) {
		soma += numero;
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		if(numero == 1111) {
			break;
		}
		
		
	}
	
	System.out.println("Soma total: " + soma);
	
	
	
//	int contador = 3;
//	
//	do {
//		System.out.println(contador);
//		System.out.println("Nome do cliente");
//	
//		contador++;
//	}
//	while(contador < 3) ;
	
}
}
