package estrutura_repeticao;

import java.util.Scanner;

public class Ex24d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 5, i = 1; 
		
		do {
			System.out.println(num + " X " + i + " = " + num * i);
			i++;
		}
		while(i <= 10);
		
		sc.close();

	}

}
