package entrada_processamento_saida;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c, ctof;
		
		System.out.println("=== Calcular Celcius para Fahrenheit");
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		c = sc.nextDouble();
		
		ctof = (c * 9/5) + 32;
		
		System.out.printf("%.2f Celcius em Fahrenheit é: %.2f", c, ctof);
		sc.close();
	}

}
