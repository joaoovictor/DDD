package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p1, p2, p3, p4, p5, valorRecebido, troco, total;
		
		System.out.println("=== CAIXA SUPERMERCADO DDD ===");
		
		System.out.println("Primeiro valor: ");
		p1 = sc.nextDouble();
		
		System.out.println("Segundo valor: ");
		p2 = sc.nextDouble();
		
		System.out.println("Terceiro valor: ");
		p3 = sc.nextDouble();
		
		System.out.println("Quarto valor: ");
		p4 = sc.nextDouble();
		
		System.out.println("Quinto valor: ");
		p5 = sc.nextDouble();
	
		total = p1 + p2 + p3 + p4 + p5;
		
		System.out.printf("O total é %.2f \n", total);
		
		System.out.println("Valor recebido: ");
		valorRecebido = sc.nextDouble();
		
		troco = valorRecebido - total;
		
		System.out.printf("O valor do troco é %.2f", troco);
		sc.close();
	}

}
