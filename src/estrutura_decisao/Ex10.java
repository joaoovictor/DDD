package estrutura_decisao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		
		System.out.println("=== QUAL O MAIOR N�MERO? ===");
		
		System.out.println("Digite o primeiro valor: ");
			n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
			n2 = sc.nextDouble();
			
		if(n1 > n2) {
			System.out.printf("%.1f � o maior n�mero!", n1);
		} else if (n1 == n2) {
			System.out.println("Os n�meros s�o iguais!");
		} else {
			System.out.printf("%.1f � o maior n�mero", n2);
		}
		sc.close();
	}
	
}
