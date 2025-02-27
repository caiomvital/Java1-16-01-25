package complementos.colecoes;

import java.util.HashSet;
import java.util.Set;

public class Sets {
public static void main(String[] args) {
	
	Set<String> nomes = new HashSet<>();
    nomes.add("Ana");
    nomes.add("Carlos");
    nomes.add("Ana");  
    nomes.add("Marcos");

    System.out.println("Nomes únicos: " + nomes);
}
}
