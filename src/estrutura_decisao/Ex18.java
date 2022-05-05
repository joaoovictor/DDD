package estrutura_decisao;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double aceleracao, velocidadeInicial, tempoPercurso, calc;
		
		System.out.println("=== QUAL A VELOCIDADE FINAL DE UM AUTOMÓVEL? ===");
		
		System.out.println("Digite a aceleração em m/s: ");
		aceleracao = sc.nextDouble();
		System.out.println("Digite a velocidade inical em m/s: ");
		velocidadeInicial = sc.nextDouble();
		System.out.println("Digite o tempo de percurso em segundos: ");
		tempoPercurso = sc.nextDouble();
		
		calc = (velocidadeInicial + aceleracao * tempoPercurso) * 3.6;
		
		  if(calc <= 40) {
			System.out.printf("%.2f Km/h veículo muito lento!", calc);
		} else if ( calc <= 60) {
			System.out.printf("%.2f Km/h velocidade permitida!", calc);
		} else if( calc <= 80) {
			System.out.printf("%.2f Km/h velocidade de cruzeiro!", calc);
		} else if(calc <= 120) {
			System.out.printf("%.2f Km/h veículo rápido!", calc);
		} else if(calc > 120 ) {
			System.out.printf("%.2f Km/h veículo muito rápido!", calc);
		} else {
			System.out.println("Valor inválido!");
		}
		
		sc.close();
	}

}
