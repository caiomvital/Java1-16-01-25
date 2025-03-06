package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Digite um valor: ");
	int num = scan.nextInt();
	int num2;
	int cont = 0;
	while (cont < 3) {
		try {
			System.out.println("Digite outro valor: ");
			num2 = scan.nextInt();

			System.out.println(Calculadora.dividir(num, num2));
			break;
		} catch (ArithmeticException e) {
			System.out.println("Não divida por zero!");
			System.out.println("Digite outro valor: ");
			num2 = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Digite um valor inteiro");
		} finally {
			System.out.println("Obrigado");
			cont++;
		}
	} 
}
}
