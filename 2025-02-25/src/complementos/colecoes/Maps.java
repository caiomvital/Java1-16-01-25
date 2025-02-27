package complementos.colecoes;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Maps {
public static void main(String[] args) {
	
	Map<String, List<String>> lanches = new LinkedHashMap<>();
	List<String> lista = Arrays.asList("Pão na chapa", "Hamburguer", "Misto", "Pão com Ovo");
	lanches.put("Sanduiche", lista);
	
	 // Mapa de animais e seus números
//    Map<String, List<String>> jogoBicho = new LinkedHashMap<>();
//    jogoBicho.put("Avestruz", Arrays.asList("01", "02", "03", "04")); // 0
//    jogoBicho.put("Águia", Arrays.asList("05", "06", "07", "08")); // 1
//    jogoBicho.put("Burro", Arrays.asList("09", "10", "11", "12")); // 2
//    jogoBicho.put("Borboleta", Arrays.asList("13", "14", "15", "16"));
//    jogoBicho.put("Cachorro", Arrays.asList("17", "18", "19", "20"));
//    jogoBicho.put("Cabra", Arrays.asList("21", "22", "23", "24"));
//    jogoBicho.put("Carneiro", Arrays.asList("25", "26", "27", "28"));
//    jogoBicho.put("Camelo", Arrays.asList("29", "30", "31", "32"));
//    jogoBicho.put("Cobra", Arrays.asList("33", "34", "35", "36"));
//    jogoBicho.put("Coelho", Arrays.asList("37", "38", "39", "40"));
//    jogoBicho.put("Cavalo", Arrays.asList("41", "42", "43", "44"));
//    jogoBicho.put("Elefante", Arrays.asList("45", "46", "47", "48"));
//    jogoBicho.put("Galo", Arrays.asList("49", "50", "51", "52"));
//    jogoBicho.put("Gato", Arrays.asList("53", "54", "55", "56"));
//    jogoBicho.put("Jacaré", Arrays.asList("57", "58", "59", "60"));
//    jogoBicho.put("Leão", Arrays.asList("61", "62", "63", "64"));
//    jogoBicho.put("Macaco", Arrays.asList("65", "66", "67", "68"));
//    jogoBicho.put("Porco", Arrays.asList("69", "70", "71", "72"));
//    jogoBicho.put("Pavão", Arrays.asList("73", "74", "75", "76"));
//    jogoBicho.put("Peru", Arrays.asList("77", "78", "79", "80"));
//    jogoBicho.put("Touro", Arrays.asList("81", "82", "83", "84"));
//    jogoBicho.put("Tigre", Arrays.asList("85", "86", "87", "88"));
//    jogoBicho.put("Urso", Arrays.asList("89", "90", "91", "92"));
//    jogoBicho.put("Veado", Arrays.asList("93", "94", "95", "96"));
//    jogoBicho.put("Vaca", Arrays.asList("97", "98", "99", "00"));
//
//    for (Map.Entry<String, List<String>> entry : jogoBicho.entrySet()) {
//     System.out.println(entry.getKey());  
//    }
	
//	Map<Integer, String> produtos = new HashMap<>();
//	Map<Integer, Integer> numeros = new HashMap<>();
//	Map<Integer, Usuario> usuarios = new HashMap<>();
//	Map<Map<Integer, Integer>, Map<String, String>> mapas = new HashMap<>();
//	Map<String, String> nomes = new HashMap<>();
//	//nomes.put("Vital", "Caio");
//	//mapas.put(numeros, nomes);
//	
//	//System.out.println(mapas.get(numeros.get(nomes.get("Vital"))));
//	
//	
//	Usuario tadeu = new Usuario();
//	tadeu.nome = "Tadeu";
//	tadeu.tipoAcesso = TipoAcesso.ADMIN;
//	
//	usuarios.put(1000, tadeu);
//	
//	System.out.println(usuarios.get(1000));
//	
//	numeros.put(1, 100);
//	
//	System.out.println(numeros.get(1));
//	produtos.put(100, "Notebook");
//	produtos.put(101, "Mouse");
//	
//	System.out.println(produtos.get(101));
//	produtos.remove(101);
//	System.out.println(produtos);
//	produtos.put(101, "Mouse óptico");
//	System.out.println(produtos.get(101));
	
}
}
