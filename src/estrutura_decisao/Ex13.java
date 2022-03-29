package estrutura_decisao;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3;
		
		System.out.println("=== QUAL DOS TRÊS É MAIOR?");
		
		System.out.println("Digite o primeiro valor: ");
		n1 = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		n2 = sc.nextDouble();
		System.out.println("Digite o terceiro valor: ");
		n3 = sc.nextDouble();
		
		if(n1 > n2) {
			if(n1> n3) {
				System.out.printf("%.2f é o maior", n1);
			}
		} else if (n2 > n3) {
			System.out.printf("%.2f é o maior", n2);
		} else {
			System.out.printf("%.2f é o maior", n3);
		}
		sc.close();
	}

}
