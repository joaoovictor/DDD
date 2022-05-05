package estrutura_repeticao;

import java.util.Scanner;

public class Ex27w {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		String aux;
		
		if(a == 1) {
		while(a <= 20) {
			while(b <= 10) {
				System.out.printf("\n %d X %d = %d", a, b, a*b);
				b++;
		  }
			if(b == 11) {
				System.out.println();
				System.out.println("Digite algo para Continuar.");
				aux = sc.nextLine();
				b = 1;
			}
			a++;
		}
		}
		sc.close();
	}

}
