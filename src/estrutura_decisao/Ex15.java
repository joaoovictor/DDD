package estrutura_decisao;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lado1, lado2, lado3;
		
		System.out.println("=== QUAL � O TRI�NGULO? ===");
		
		System.out.println("Digite o primeiro lado: ");
		lado1 = sc.nextDouble();
		System.out.println("Digite o segundo lado: ");
		lado2 = sc.nextDouble();
		System.out.println("Digite o terceiro lado: ");
		lado3 = sc.nextDouble();
		
		if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
			if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				System .out.printf("� um tri�ngulo ESCALENO!");
			} else if (lado1 == lado2 && lado2 == lado3) {
				System.out.printf("� um tri�ngulo EQUIL�TERO");
			} else {
				System.out.printf("� um tri�ngulo IS�CELES");
			}
		} else {
			System.out.printf("N�o � um tri�ngulo!");
		}
		sc.close();
	}
}
