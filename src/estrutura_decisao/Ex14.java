package estrutura_decisao;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso, altura, calc;
		
		System.out.println("=== VOC� EST� NO SEU PESO IDEAL? ===");
		
		System.out.println("Digite seu peso: ");
		peso = sc.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		
		calc = peso / (altura * altura); 
		
		if(calc >=  18.5) {
			if( calc <= 24.9) {
			System.out.printf("Voc� est� no seu peso ideal!");
			}
		} else {
			System.out.printf("Voc� est� fora do peso ideal!");
		}
		sc.close();
	}
}
