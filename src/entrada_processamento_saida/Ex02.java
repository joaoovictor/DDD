package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lado, area;
		
		System.out.println("==== Área do quadrado ====");
		
		System.out.println("Digite apenas um lado: ");
		lado = sc.nextDouble();
		
		area = lado * lado;
		
		System.out.printf("A área do quadrado é %.2f", area);
		sc.close();
	}

}
