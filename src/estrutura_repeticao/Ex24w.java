package estrutura_repeticao;

import java.util.Scanner;

public class Ex24w {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 5, i = 1; 
		
		while(i <= 10) {
			System.out.println(num + " X " + i + " = " + num * i);
			i++;
		}
		
		sc.close();
	}

}
