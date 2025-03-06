package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	List<String> alunos = new ArrayList<>();
	
	
	
	alunos.add("Tadeu");
	alunos.add("Gervasio");
	alunos.add("Agamenon");
	alunos.add("Gervasio");
	alunos.add("Gervasio");
	alunos.add("Agamenon");
	alunos.add("Agamenon");
	alunos.add("Agamenon");
	alunos.add("Agamenon");


	
	System.out.println(alunos);
	//System.out.println(alunos.indexOf("Gervasio"));
	
	for(String nome : alunos) {
		if(nome.equalsIgnoreCase("gervasio")) {
			System.out.println(nome + " Pires");
		}
	}
	
}
}
