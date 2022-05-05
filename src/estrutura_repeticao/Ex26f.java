package estrutura_repeticao;

import java.util.Scanner;

public class Ex26f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, a = 0, b = 0;
		
		do {
			System.out.println("Digite um valor: ");
			x = sc.nextInt();
		}
		while(x <= 0);		
		
		System.out.println("Digite onde a tabuada começa: ");
		a = sc.nextInt();
		System.out.println("Digite onde a tabuada termina: ");
		b = sc.nextInt();
		
		while(a > b) {
			System.out.println("ERRO! Digite onde a tabuada termina: ");
			b = sc.nextInt();
		}
		
		for(int i = b; i >= a ; i--) {
			System.out.printf(" \n %d x %d = %d", x, i, x*i);
		}
		
		sc.close();
		
	}
}
