package estrutura_repeticao;

import java.util.Scanner;

public class Ex31w {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i = 1;
		int valor = 2;
		int aux = 3;
		
		System.out.println("Digite um valor até 100: ");
		int n = sc.nextInt();
		
		while(n < 0) {
			System.out.println("ERRO! Digite um valor positivo: ");
			 n = sc.nextInt();
		}
		
		
		while(i <= n) {
			if(aux % 2 != 0) {
				System.out.println(valor);
				valor = valor + aux;
				i++;
			}	
			
			aux++;
				
			
		}
		sc.close();

	}

}
