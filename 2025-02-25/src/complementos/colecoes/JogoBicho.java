package complementos.colecoes;

import java.util.*;

public class JogoBicho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Mapa de animais e seus números
        Map<String, List<String>> jogoBicho = new LinkedHashMap<>();
        jogoBicho.put("Avestruz", Arrays.asList("01", "02", "03", "04"));
        jogoBicho.put("Águia", Arrays.asList("05", "06", "07", "08"));
        jogoBicho.put("Burro", Arrays.asList("09", "10", "11", "12"));
        jogoBicho.put("Borboleta", Arrays.asList("13", "14", "15", "16"));
        jogoBicho.put("Cachorro", Arrays.asList("17", "18", "19", "20"));
        jogoBicho.put("Cabra", Arrays.asList("21", "22", "23", "24"));
        jogoBicho.put("Carneiro", Arrays.asList("25", "26", "27", "28"));
        jogoBicho.put("Camelo", Arrays.asList("29", "30", "31", "32"));
        jogoBicho.put("Cobra", Arrays.asList("33", "34", "35", "36"));
        jogoBicho.put("Coelho", Arrays.asList("37", "38", "39", "40"));
        jogoBicho.put("Cavalo", Arrays.asList("41", "42", "43", "44"));
        jogoBicho.put("Elefante", Arrays.asList("45", "46", "47", "48"));
        jogoBicho.put("Galo", Arrays.asList("49", "50", "51", "52"));
        jogoBicho.put("Gato", Arrays.asList("53", "54", "55", "56"));
        jogoBicho.put("Jacaré", Arrays.asList("57", "58", "59", "60"));
        jogoBicho.put("Leão", Arrays.asList("61", "62", "63", "64"));
        jogoBicho.put("Macaco", Arrays.asList("65", "66", "67", "68"));
        jogoBicho.put("Porco", Arrays.asList("69", "70", "71", "72"));
        jogoBicho.put("Pavão", Arrays.asList("73", "74", "75", "76"));
        jogoBicho.put("Peru", Arrays.asList("77", "78", "79", "80"));
        jogoBicho.put("Touro", Arrays.asList("81", "82", "83", "84"));
        jogoBicho.put("Tigre", Arrays.asList("85", "86", "87", "88"));
        jogoBicho.put("Urso", Arrays.asList("89", "90", "91", "92"));
        jogoBicho.put("Veado", Arrays.asList("93", "94", "95", "96"));
        jogoBicho.put("Vaca", Arrays.asList("97", "98", "99", "00"));

        // Sorteio aleatório
        Random r = new Random();
        int sorteado = r.nextInt(100);
        String sorteio = String.format("%02d", sorteado);

        // Identifica o bicho correspondente ao número sorteado
        String bichoSorteado = "Desconhecido";
        for (Map.Entry<String, List<String>> entry : jogoBicho.entrySet()) {
            if (entry.getValue().contains(sorteio)) {
                bichoSorteado = entry.getKey();
                break;
            }
        }

        // Mapa de apostas
        Map<String, List<String>> nomesApostas = new HashMap<>();

        while (true) {
            System.out.print("Digite o nome do jogador \n(ou 'sair' para encerrar as apostas): ");
            String nome = scan.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            List<String> apostas = new ArrayList<>();

            while (true) {
                System.out.print("Digite um número (00-99) \nou o nome de um animal para apostar ('fim' para finalizar as apostas do jogador): ");
                String aposta = scan.nextLine();

                if (aposta.equalsIgnoreCase("fim")) {
                    break;
                }

                if (aposta.matches("\\d{2}") || jogoBicho.containsKey(aposta)) {
                    apostas.add(aposta);
                } else {
                    System.out.println("Aposta inválida! Digite um número entre 00-99 \nou um nome válido de animal.");
                }
            }

            if (!apostas.isEmpty()) {
                nomesApostas.put(nome, apostas);
            } else {
                System.out.println("Nenhuma aposta válida foi feita. Jogador não adicionado.");
            }
        }

        boolean acertou = false;
        for (Map.Entry<String, List<String>> aposta : nomesApostas.entrySet()) {
            String jogador = aposta.getKey();
            List<String> apostas = aposta.getValue();

            if (apostas.contains(sorteio)) {
                System.out.println(jogador + " acertou o sorteio! Número sorteado: " + sorteio);
                acertou = true;
            }

            for (String apostaAnimal : apostas) {
                if (jogoBicho.containsKey(apostaAnimal)) {
                    List<String> numerosDoAnimal = jogoBicho.get(apostaAnimal);
                    if (numerosDoAnimal.contains(sorteio)) {
                        System.out.println(jogador + " acertou na cabeça! O animal sorteado foi: " + bichoSorteado);
                        acertou = true;
                    }
                }
            }
        }

        if (!acertou) {
            System.out.println("Ninguém acertou o sorteio.");
        }
        System.out.println("O número sorteado foi: " + sorteio);
        System.out.println("O bicho sorteado foi: " + bichoSorteado);
    }
}
