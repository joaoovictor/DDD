package estrutura_decisao;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso, altura, calc, sexo;
		
		System.out.println("=== VOC� EST� NO SEU PESO IDEAL? ===");
		
		
		System.out.println("Digite seu peso: ");
		peso = sc.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		System.out.println("Voc� � uma mulher(1) ou um homem(2) ?");
		sexo = sc.nextDouble();
		
		calc = peso / (altura * altura); 
		
		if(sexo == 1) {
			  if(calc <  19) {
				System.out.printf("IMC: %.2f Voc� est� abaixo do peso!", calc);
			} else if(calc >= 19 && calc < 24) {
				System.out.printf("IMC: %.2f Voc� est� no peso ideal!", calc);
			} else {
				System.out.printf("IMC: %.2f Voc� est� acima do peso!", calc);
			}
		} else if (sexo == 2) {
			  if(calc <  20) {
				System.out.printf("IMC: %.2f Voc� est� abaixo do peso!", calc);
			} else if(calc >= 20 && calc < 25) {
				System.out.printf("IMC: %.2f Voc� est� no peso ideal!", calc);
			} else {
				System.out.printf("IMC: %.2f Voc� est� acima do peso!", calc);
			}
		} else {
			System.out.println("Inv�lido!");
		}
		sc.close();
	}

}
