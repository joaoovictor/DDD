package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura, area;
		
		System.out.println("==== �rea do Traingulo ===");
		
		System.out.println("Digite a base: ");
			base = sc.nextDouble();
		System.out.println("Digite a altura: ");
			altura = sc.nextDouble();
		
		area = base * altura;
		
		System.out.printf("A �rea do tri�ngulo � %.2f", area);
		
		sc.close();
	}

}
