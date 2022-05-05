package classe_atributo;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto[] listaProdutos = new Produto[10];
		
		for(int i = 0; i < listaProdutos.length; i++) {
			Produto p = new Produto();
			
			System.out.println("Digite o id: ");
			p.id = sc.nextInt();
			
			System.out.println("Digite o valor: ");
			p.valor = sc.nextDouble();
			
			System.out.println("Digite a quantidade: ");
			p.quantidade = sc.nextDouble();
			
			System.out.println("Digite a descrição: ");
			p.descricao = sc.next();
			
			listaProdutos[i] = p; 
			
		}
		
		for(int i = 0; i < listaProdutos.length; i++) {
			if(listaProdutos[i].valor < 100) {
				System.out.println("ID: " + listaProdutos[i].id + " VALOR: " + listaProdutos[i].valor + " QUANTIDADE: " + listaProdutos[i].quantidade + " DESCRIÇÃO: " + listaProdutos[i].descricao);
			}
		}
		sc.close();
	}

}
