package estrutura_repeticao;

import java.util.Scanner;

public class Ex27f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux = new String(); 
		for(int i = 1; i <= 20; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.printf("\n %d x %d = %d", i, j, i*j);
			}
			System.out.println();
			System.out.println("Digite algo para continuar.");
			sc.nextLine();
		}
		
		sc.close();
	}

}
