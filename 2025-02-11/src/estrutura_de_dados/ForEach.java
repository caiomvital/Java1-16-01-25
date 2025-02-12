package estrutura_de_dados;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
public static void main(String[] args) {
List<Integer> numeros = new ArrayList<>();
	
	for(int i = 0; i < 10; i++) {
		numeros.add(i);
		numeros.add(i+1);
	}
	
	System.out.println(numeros);
	//para cada numero na lista
	for(int numero : numeros) {
		if(numero % 2 == 0) {
			System.out.println(numero);
		}
	}
	int tamanho = numeros.size();
	for(int i = 0; i < tamanho; i++) {
		int numero = numeros.get(i);
		if(numero % 2 == 0) {
			System.out.println(numero);
		}
	}
}
	
}
