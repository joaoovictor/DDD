package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dolar, toreal, cotacao;
		
		
		System.out.println("=== D�lar para Real ===");
		
		System.out.println("Digite o valor da cota��o de d�lar (Utilize a v�rgula ou ponto se necess�rio): ");
		cotacao = sc.nextDouble();

		System.out.println("Digite o valor em d�lar: ");
		dolar = sc.nextDouble();
		
		toreal = dolar * cotacao;
		
		System.out.printf("O valor de %.2f d�lares � igual a %.2f reais", dolar, toreal);
		sc.close();
		
	}

}
