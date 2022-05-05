package estrutura_repeticao;

import java.util.Scanner;

public class Ex31d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int n;
		int valor = 2;
		int aux = 3;
		
		do {
			System.out.println("Digite um valor positivo: ");
			 n = sc.nextInt();
	
		}while(n < 0);
		
		do {
			if(aux % 2 != 0) {
				System.out.println(valor);
				valor = valor + aux;
				i++;
			}	
			
			aux++;

		} while(i <= n);
		sc.close();
	}
}
