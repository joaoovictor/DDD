package encapsulamento2;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produto[] listaProdutos = new Produto[2];
		
		int id, idCategoria, quantidade;
		String nome, nomeCategoria;
		double preco;
		char possuiCategoria;
		
		
		for(int i = 0; i < listaProdutos.length; i++) {
			Produto p = new Produto();
			
			System.out.printf("Digite seu ID: ");
			id = sc.nextInt();
			
			p.setId(id);
			
			System.out.printf("Digite o nome do produto: ");
			nome = sc.next();
			
			p.setNome(nome);
			
			System.out.printf("Digite a quantidade: ");
			quantidade = sc.nextInt();
			
			p.setQuantidade(quantidade);
			
			System.out.printf("Digite o preço: ");
			preco = sc.nextDouble();
			
			p.setPreco(preco);
			
			System.out.printf("O produto tem categoria? S/N");
			possuiCategoria = sc.next().charAt(0);
			
			if(possuiCategoria == 'S') {
				Categoria c = new Categoria();
				
				System.out.printf("Digite o ID da categoria: ");
				idCategoria = sc.nextInt();
				
				c.setId(idCategoria);
				
				System.out.printf("Digite o nome da categoria: ");
				nomeCategoria = sc.next();
				
				c.setNome(nomeCategoria);
				
				p.setCategoria(c);
			}
			listaProdutos[i] = p;
			
		}
		for(int i = 0; i < listaProdutos.length;i++ ) {
			System.out.println(listaProdutos[i].exibirNomePreco());
			
			if(listaProdutos[i].getCategoria() != null) {
				System.out.println(listaProdutos[i].exbirNomeCategoria());
			}
		}
		sc.close();

}}
