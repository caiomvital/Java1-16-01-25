package exercicios_listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicios {
	public static void main(String[] args) {

//1) Crie uma Lista com dez números aleatórios.

	Random r = new Random();
		
	List<Integer> numeros = new ArrayList<>();
	
	for(int i = 0; i < 10; i++) {
		int valorAleatorio = r.nextInt(20) + 1;
		numeros.add(valorAleatorio);
	}
		
//	while(numeros.size() < 10) {
//		int valorAleatorio = r.nextInt(20) + 1;
//		numeros.add(valorAleatorio);
//	}
	
	System.out.println(numeros);
	
		
//2) Adicione o número 11 à Lista criada no exercício anterior.

	numeros.add(11);
	
	System.out.println(numeros);
	
//3) Remova o número na 5ª posição da Lista.

	numeros.remove(4);
	System.out.println(numeros);

	
//4) Concatene a Lista atual com uma nova Lista 
//contendo os números de 12 a 15.
	
	List<Integer> outrosNumeros = Arrays.asList(12, 13, 14, 15);

//	for(int i = 12; i <= 15; i++) {
//		outrosNumeros.add(i);
//	}
	
	numeros.addAll(outrosNumeros);
	
	System.out.println(numeros);
	
//5) Encontre o comprimento da Lista resultante.

	System.out.println("Tamanho da Lista: " + numeros.size());
	
//6) Verifique se o número 8 está presente na Lista.

	System.out.println("Contém 8? " + numeros.contains(8));
	
//7) Inverta a ordem dos elementos na Lista.

	numeros.reversed();
	System.out.println(numeros);
	//Collections.reverse(numeros);
	System.out.println(numeros);	
	
//8) Remova todos os números pares da Lista.

	//numeros.forEach(System.out::println);
//	List<Integer> impares = new ArrayList<>();
//	
//	
//	int x = numeros.size();
//	
//	for(int i = 0; i < x; i++) {
//		if(numeros.get(i) % 2 == 0) {
//			numeros.remove(numeros.get(i));
//		}
//	}
//	
//	for(int i = 0; i < numeros.size(); i++) {
//		if(numeros.get(i) % 2 != 0) {
//			impares.add(numeros.get(i));
//		}
//	}
//	
//	numeros.clear();
//	numeros.addAll(impares);
//	System.out.println();
	
	numeros.removeIf(n -> n % 2 == 0);
	
//9) Substitua o valor da 3ª posição por 30.

	numeros.set(2, 30);
	
	System.out.println(numeros);
	
//10) Ordene a Lista de forma crescente.

	numeros.sort(null);
	//Collections.sort(numeros);
	
	System.out.println(numeros);
	}
}

//numeros.forEach(n -> System.out.println(n));