package heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.caiomvital.util.GeradorDeDados;

public class Principal {
	public static void main(String[] args) {
		Random r = new Random();
		
		List<String> nomes = new ArrayList<>();
		
		System.out.println("Nome Gerado: " + GeradorDeDados.gerarNomeAleatorio());
		System.out.println("Nome Completo Gerado: " + GeradorDeDados.gerarNomeCompletoAleatorio());
		System.out.println("Dado Gerado: " + GeradorDeDados.gerarCPF());
		System.out.println("Dado Gerado: " + GeradorDeDados.gerarEnderecoAleatorio());
		System.out.println("Dado Gerado: " + GeradorDeDados.gerarEnderecoSimplificado());
		System.out.println("Dado Gerado: " + GeradorDeDados.gerarTelefoneCelular());
		System.out.println("Dado Gerado: " + GeradorDeDados.gerarTelefoneFixo());
		System.out.println("Dado Gerado: " + GeradorDeDados.obterRua());
		
		
//		List<Integer> lista = r.ints(100, 1, 101)
//				.boxed()
//				.toList();
//		
//		lista.stream()
//		.filter(n -> n % 2 != 0)
//		.toList().forEach(n -> System.out.print(n + " "));
		
		
		
		
		
//		Banco b2 = new Banco();
//		
//		Banco.criarConta();
//		Banco.criarConta();
//		Banco.criarConta();
		//Banco.listarContas();
		
//		b2.listarContas();
		
		
//		Conta a = new Conta();
//		a.saldo = 1000;
//		a.sacar(500);
//		Conta b = new Conta();
//		b.saldo = 300;
//		b.sacar(100);
//		System.out.println(a.saldo);
//		a.transferir(125, b);
//		System.out.println(b.saldo);
		
		
		
		
//		Notebook a = new Notebook("Notebook Acer", 5999.43, "Notebook", "i5 de 13ª geração");
//		Celular b = new Celular("Celular Samsung A51", 1999.99, "Celular", "Samsung", "A51");
//		
//		Loja loja = new Loja();
//		loja.produtos.add(a);
//		loja.produtos.add(b);
//		
//		loja.produtos.forEach(System.out::println);
//		System.out.println("-----");
//		Notebook c = (Notebook) loja.produtos.get(0);
//		c.exibirProcessador();
		
		//Eletronico notebook = 
		//new Eletronico("Notebook Acer", 5999.43, "Notebook");
		
//		Notebook eletronico = 
//		new Notebook("Notebook Acer", 5999.43, 
//				"Notebook", "i5 de 13ª geração");
//		System.out.println(eletronico);
//		
//		System.out.println(eletronico instanceof Produto);
//		
		
		
		
		
		
		//Scanner scan = new Scanner(System.in);
//		Produto a = new Produto("Produto A", 9.98);
//		Produto b = new Produto("Produto B", 10.98);
//		Produto c = new Produto("Produto C", 11.98);
//		Produto d = new Produto("Produto D", 12.98);
//		Produto e = new Produto("Produto E", 13.98);
//
//		List<Produto> produtos = List.of(a, b, c, d, e);
		
		
		//List<Produto> produtos = new ArrayList<>();
		
		/*
		 * adicionando produtos à lista através de um laço for for(int i = 0; i < 5;
		 * i++) { System.out.printf("Entre com o nome do produto %d%n", (i+ 1)); String
		 * nome = scan.nextLine();
		 * System.out.printf("Entre com o preço do produto %d%n", (i+ 1)); double preco
		 * = scan.nextDouble(); scan.nextLine(); Produto p = new Produto(nome, preco);
		 * produtos.add(p); }
		 */

//		for(int i = 0; i < produtos.size(); i++) {
//			System.out.println(produtos.get(i));
//		}
		
//		for(Produto produto : produtos) {
//			System.out.println("~~~~~~");
//			System.out.print(produto);
//			System.out.println("~~~~~~");
//		}
		
		//produtos.forEach(System.out::println);
		
//		produtos.forEach(n -> {
//			System.out.println("~~~~~~");
//			System.out.println(n);
//			System.out.println("~~~~~~");
//		});
		
		//List<Integer> numeros = List.of(4, 5, 6, 7, 8);
		
		//numeros.forEach(n -> System.out.print((int) Math.pow(n, 3) + " "));
		
		
	}
}
