package estrutura_decisao;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.println("=== ARÉA DO RETÂNGULO ===");
		System.out.println("Digite a base: ");
		base = sc.nextDouble();
		System.out.println("Digite a altura: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		
		if(area > 100) {
			System.out.printf("Terreno grande");
		} else {
			System.out.printf("Terreno pequeno");
		}
		sc.close();

	}

}
