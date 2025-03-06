package heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
public static void main(String[] args) {
	
	
	
	List<Pessoa> pessoas = new ArrayList<>();
	Pessoa p = new Pessoa();
	pessoas.add(p);
	Scanner scan = new Scanner(System.in);

	for(int i = 0; i < 3; i++) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = scan.nextLine();
		pessoas.add(pessoa);
	}
	
	pessoas.forEach(pessoa -> System.out.println(pessoa.nome));
	
//	Animal animal = new Animal("Gervásio");
//	System.out.println(animal);
//	
//	Gato gato = new Gato("Gervásio");
//	gato.peso = 3.5;
//	Cachorro cachorro = new Cachorro("Damião");
//	System.out.println(cachorro.nome);
//	System.out.println(cachorro);
	
	
}
}
