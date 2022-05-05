package estrutura_repeticao;

import java.util.Scanner;

public class Ex27d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		String aux;
		
		do{
			do{
				System.out.printf("\n %d X %d = %d", a, b, a*b);
				b++;
			}
			while(b <= 10);
			if(b == 11) {
				System.out.println();
				System.out.println("Digite algo para Continuar.");
				aux = sc.nextLine();
				b = 1;
			}
			a++;
		} while(a <= 20);
		sc.close();
	}

}
