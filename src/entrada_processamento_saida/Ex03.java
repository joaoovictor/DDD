package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura, area;
		
		System.out.println("=== C�lculo �rea do triangulo ===");
		
		System.out.println("Digite a base: ");
		base = sc.nextDouble();
		
		System.out.println("Digite a altura: ");
		altura = sc.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.printf("A �rea do triangulo �: %.2f", area);
		
		sc.close();
		
		

	}

}
