package estrutura_repeticao;

import java.util.Scanner;

public class Ex21w {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite um valor positivo: ");
		valor = sc.nextInt();
		
		while(valor <= 0){
			System.out.println("ERROR! Digite um valor positivo: : ");
			valor = sc.nextInt();
		}
		
		System.out.println("Fim!");
		
		sc.close();
		
		
	}

}
