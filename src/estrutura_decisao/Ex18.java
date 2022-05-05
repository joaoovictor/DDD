package estrutura_decisao;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double aceleracao, velocidadeInicial, tempoPercurso, calc;
		
		System.out.println("=== QUAL A VELOCIDADE FINAL DE UM AUTOM�VEL? ===");
		
		System.out.println("Digite a acelera��o em m/s: ");
		aceleracao = sc.nextDouble();
		System.out.println("Digite a velocidade inical em m/s: ");
		velocidadeInicial = sc.nextDouble();
		System.out.println("Digite o tempo de percurso em segundos: ");
		tempoPercurso = sc.nextDouble();
		
		calc = (velocidadeInicial + aceleracao * tempoPercurso) * 3.6;
		
		  if(calc <= 40) {
			System.out.printf("%.2f Km/h ve�culo muito lento!", calc);
		} else if ( calc <= 60) {
			System.out.printf("%.2f Km/h velocidade permitida!", calc);
		} else if( calc <= 80) {
			System.out.printf("%.2f Km/h velocidade de cruzeiro!", calc);
		} else if(calc <= 120) {
			System.out.printf("%.2f Km/h ve�culo r�pido!", calc);
		} else if(calc > 120 ) {
			System.out.printf("%.2f Km/h ve�culo muito r�pido!", calc);
		} else {
			System.out.println("Valor inv�lido!");
		}
		
		sc.close();
	}

}
