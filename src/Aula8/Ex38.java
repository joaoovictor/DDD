package Aula8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		int opcao;
		String nome;
		double preco, quantidade;
		int id;
		char possuiCategoria;
		
		do {
			System.out.printf("===> Sistema de Cadastro de Produtos <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Incluir produto \n" +
                              "2 - Atualizar produto \n" +
                              "3 - Excluir produto \n" +
                              "4 - Exibir produtos \n" +
                              "5 - Sair\n\n");

			
			System.out.printf("Digite a opção desejada: ");
			opcao = sc.nextInt();
			
			if(opcao == 1) {
				Produto produto = new Produto();
				
				id = listaProdutos.size() + 1;
				produto.setId(id);
				
				System.out.printf("Digite o nome do produto: ");
				nome = sc.next();
				produto.setNome(nome);
				
				System.out.printf("Digite o preço do produto: ");
				preco = sc.nextDouble();
				produto.setPreco(preco);
				
				System.out.printf("Digite a quantidade do produto: ");
				quantidade = sc.nextDouble();
				produto.setQuantidade(quantidade);
				
				System.out.printf("O produto tem categoria? S/N");
				possuiCategoria = sc.next().charAt(0);
				
				if(possuiCategoria == 'S') {
					int idCategoria;
					String nomeCategoria;
					
					Categoria categoria = new Categoria();
					
					System.out.printf("Digite o ID da categoria: ");
					idCategoria = sc.nextInt();
					categoria.setId(idCategoria);
					
					System.out.printf("Digite o nome da categoria: ");
					nomeCategoria = sc.next();
					categoria.setNome(nomeCategoria);
					
					produto.setCategoria(categoria);
				}
				listaProdutos.add(produto);
				System.out.printf("=== Produto adicionado com sucesso! ===");
				System.in.read();
			} else if (opcao == 2) {
				
				for(Produto p : listaProdutos) {
					System.out.printf(p.exibirNomePreco());
					
					if(p.getCategoria() != null) {
						System.out.printf(p.exbirNomeCategoria());
					}
				}
				
				System.out.println("Digite o ID que deseja atualizar: ");
				id = sc.nextInt();
				
				System.out.printf("Digite o nome do produto: ");
				nome = sc.next();
				
				System.out.printf("Digite o preço do produto: ");
				preco = sc.nextDouble();
				
				System.out.printf("Digite a quantidade do produto: ");
				quantidade = sc.nextDouble();
				
				System.out.printf("O produto tem categoria? S/N");
				possuiCategoria = sc.next().charAt(0);
				
				if(possuiCategoria == 'S') {
					int idCategoria;
					String nomeCategoria;
					
					Categoria categoria = new Categoria();
					
					System.out.printf("Digite o ID da categoria: ");
					idCategoria = sc.nextInt();
					categoria.setId(idCategoria);
					
					System.out.printf("Digite o nome da categoria: ");
					nomeCategoria = sc.next();
					categoria.setNome(nomeCategoria);
					
					Produto produto = listaProdutos.get(id - 1);
					produto.setNome(nome);
					produto.setPreco(preco);
					produto.setQuantidade(quantidade);
					produto.setCategoria(categoria);
					
					System.out.println("==== PRODUTO ATUALIZADO COM SUCESSO! ====");
				} else {
					Produto produto = listaProdutos.get(id - 1);
					produto.setNome(nome);
					produto.setPreco(preco);
					produto.setQuantidade(quantidade);
					System.out.println("===== PRODUTO ATUALIZADO COM SUCESSO! =====");
					
				}
				
			} else if (opcao == 3) {
				for(Produto p : listaProdutos) {
					System.out.printf(p.exibirNomePreco());
					
					if(p.getCategoria() != null) {
						System.out.printf(p.exbirNomeCategoria());
					}
				}
				
				System.out.printf("Digite o ID que deseja remover: ");
				id = sc.nextInt();
				
				listaProdutos.remove(id - 1);
				System.out.println("=== Produto Removido com sucesso! ===");
				System.in.read();
				
			} else if (opcao == 4) {
				for(Produto p : listaProdutos) {
					System.out.printf(p.exibirNomePreco());
					
					if(p.getCategoria() != null) {
						System.out.printf(p.exbirNomeCategoria());
					}
				}
			}
		} while(opcao != 5);

	}

}
