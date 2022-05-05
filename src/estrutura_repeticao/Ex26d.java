package estrutura_repeticao;

import java.util.Scanner;

public class Ex26d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, a, b;
		
		
		do {
			System.out.println("Digite um valor: ");
			x = sc.nextInt();
		}
		while(x <= 0);		

		System.out.println("Digite onde a tabuada começa: ");
		a = sc.nextInt();
		
		do {
			System.out.println("Digite onde a tabuada acaba: ");
			b = sc.nextInt();  
		} while(a > b);
		
		do {
			System.out.printf("\n %d x %d = %d", x, b, x*b);
			b--;
		}
		while(a <= b);
		
		sc.close();

	}

}
