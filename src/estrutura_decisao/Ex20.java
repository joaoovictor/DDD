package estrutura_decisao;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p1, p2, media = 5;
		
		System.out.println("=== MÉDIA ===");
		
		System.out.println("Digite a nota da P1: ");
		p1 = sc.nextDouble();
		
		p2 = ((media * 3) - p1) / 2;
		
		System.out.printf("Você precisa tirar %.2f para passar na matéria", p2);
		
		sc.close();
	}

}
