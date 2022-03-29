package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dolar, toreal, cotacao;
		
		
		System.out.println("=== Dólar para Real ===");
		
		System.out.println("Digite o valor da cotação de dólar (Utilize a vírgula ou ponto se necessário): ");
		cotacao = sc.nextDouble();

		System.out.println("Digite o valor em dólar: ");
		dolar = sc.nextDouble();
		
		toreal = dolar * cotacao;
		
		System.out.printf("O valor de %.2f dólares é igual a %.2f reais", dolar, toreal);
		sc.close();
		
	}

}
