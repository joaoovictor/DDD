package estrutura_decisao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lado2, lado3, hipotenusa;
		
		System.out.println("=== � UM TRI�NGULO RETANGULO? ===");
		
		System.out.println("Digite o maior lado: ");
		hipotenusa = sc.nextDouble();
		System.out.println("Digite o segundo lado: ");
		lado2 = sc.nextDouble();
		System.out.println("Digite o terceiro lado: ");
		lado3 = sc.nextDouble();
		
		
		if(((lado2 * lado2 + lado3 * lado3) == hipotenusa * hipotenusa)) {
			System.out.println("� um tri�ngulo ret�ngulo!");
		} else {
			System.out.println("N�o � um tri�ngulo ret�ngulo!");
		}
		sc.close();
	}

}
