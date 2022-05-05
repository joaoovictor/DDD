package estrutura_repeticao;

import java.util.Scanner;

public class Ex24f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("\n 5 X %d = %d", i, i*5);
		}
		sc.close();
	}

}
