package listas.wrapper;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {
public static void main(String[] args) {
	
	List<Integer> numeros = new ArrayList<>();
	List<Double> reais = new ArrayList<>();
	List<Character> caracteres = new ArrayList<>();
	
	for(int i = 1; i <= 10; i++) {
		numeros.add(i);
	}
	//Collections.reverse(numeros);
	numeros = numeros.reversed();
	System.out.println(numeros.reversed());
	System.out.println(numeros);
	
}
}
