package estrutura_repeticao;

import java.util.Scanner;

public class Ex25d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor, i = 1;
		
		System.out.println("Digite um valor: ");
		valor = sc.nextInt();
		
		do {
			System.out.println("Digite um valor: ");
			valor = sc.nextInt();
		}
		while(valor <= 0);
		 
		do {
			System.out.printf("\n %d X %d = %d", valor, i, i*valor);
			i++;
		}
		while(i <= 10);
		
		sc.close();

	}

}
