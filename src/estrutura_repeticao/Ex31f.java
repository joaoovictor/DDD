package estrutura_repeticao;

import java.util.Scanner;

public class Ex31f {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int valor = 2;
		int aux = 3;
		
		System.out.println("Digite um valor até 100: ");
		int n = sc.nextInt();
		
		while(n < 0) {
			System.out.println("ERRO! Digite um valor positivo: ");
			 n = sc.nextInt();
		}
		
		for (int i = 1; i <= n;){
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
