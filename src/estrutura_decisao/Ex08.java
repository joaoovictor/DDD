package estrutura_decisao;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2;
		
		System.out.println("=== QUAL NÚMERO É MAIOR?");
		
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextDouble();
		
		if(n1 > n2){
			System.out.printf("%.1f é o maior número", n1);
		} else {
			System.out.printf("%.1f é o maior número", n2);
		}
		
		
		sc.close();
		

	}

}
