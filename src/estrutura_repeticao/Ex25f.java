package estrutura_repeticao;

import java.util.Scanner;

public class Ex25f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		
		
		do {
			System.out.println("Digite um valor: ");
			valor = sc.nextInt();
		}
		while(valor <= 0);
		 
		
		for(int i = 1; i<=10; i++) {
			System.out.printf("\n %d X %d = %d", valor, i, i*valor);
		}
		
		sc.close();

	}

}
