package estrutura_repeticao;

import java.util.Scanner;

public class Ex26w {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, a, b;
		
		System.out.println("Digite um valor: ");
		x = sc.nextInt();
		
		while(x <= 0) {
			System.out.println("Digite um valor: ");
			x = sc.nextInt();
		}
		

		System.out.println("Digite onde a tabuada começa: ");
		a = sc.nextInt();
		System.out.println("Digite onde a tabuada termina: ");
		b = sc.nextInt();
		
		while(a > b) {
			System.out.println("ERRO! Digite onde a tabuada termina: ");
			b = sc.nextInt();
		}
		
		while(a <= b) {
			System.out.printf("\n %d x %d = %d", x, b, x*b);
			b--;
		}
		
		sc.close();
	}

}
