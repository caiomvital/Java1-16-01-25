package cadastro_produtos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cadastro_produtos.model.Produto;

public class Loja {

	private static List<Produto> produtos = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);

	private static Produto a = new Produto("Produto A", 9.99);
	private static Produto b = new Produto("Produto B", 10.99);
	private static Produto c = new Produto("Produto C", 11.99);

	public static void adicionarExemplos() {
		produtos.add(a);
		produtos.add(b);
		produtos.add(c);
	}

	public static void adicionarProduto() {
		System.out.println("Informe o nome do produto: ");
		String nome = scan.nextLine();
		System.out.println("Informe o preço do produto: ");
		double preco = Validacoes.validarPreco();
		
		Produto p = new Produto(nome, preco);

		produtos.add(p);
	}

	public static void removerProduto() {
		listarProdutos();
		System.out.println("Informe o índice do produto que deseja remover:");
		int indice = scan.nextInt() - 1;
		scan.nextLine();

		produtos.remove(indice);
	}

	public static void atualizarProduto() {
		listarProdutos();

		System.out.println("Informe o índice do produto que alterar:");
		int indice = scan.nextInt() - 1;
		scan.nextLine();

		System.out.println("Informe o novo nome do produto: ");
		String nome = scan.nextLine();

		System.out.println("Informe o novo preço do produto: ");
		double preco = Validacoes.validarPreco();
		while(preco <= 0) {
			System.out.println("Preço inválido: digite novamente.");
			preco = scan.nextDouble();
		}
		Produto produtoAtualizado = new Produto(nome, preco);

		produtos.set(indice, produtoAtualizado);

	}

	public static void listarProdutos() {
		produtos.forEach(
				p -> System.out.println((produtos.indexOf(p) + 1) + ". " + p.getNome() + " - R$ " + p.getPreco()));

		// 1. Produto A - R$ 9.99
		// 2. Produto B - R$ 10.99
		// 3. Produto C - R$ 11.99
	}

	public static void iniciarAplicacao() {
		
		int opcao = 0;
		String menu = """
				1. Adicionar Produto
				2. Remover Produto
				3. Atualizar Produto
				4. Listar Produtos
				5. Sair

				Digite uma opção
				""";

		Loja.adicionarExemplos();

		do {
			System.out.println(menu);
			opcao = scan.nextInt(); scan.nextLine();

			switch (opcao) {

			case 1 -> {
				Loja.adicionarProduto();
			}

			case 2 -> {
				Loja.removerProduto();
			}

			case 3 -> {
				Loja.atualizarProduto();
			}

			case 4 -> {
				Loja.listarProdutos();
			}

			case 5 -> {
				opcao = 0;
			}

			default -> {

			}

			}
		} while (opcao != 0);

	}
	
	
	
}
