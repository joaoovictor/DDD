package estrutura_repeticao;

import java.util.Scanner;

public class Ex23w {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char sexo;
		
		System.out.println("Digite o seu sexo: ");
		sexo = sc.next().toUpperCase().charAt(0);
		
		while(sexo != 'F' && sexo != 'M'){
			System.out.println("Digite o seu sexo novamente: ");
			sexo = sc.next().toUpperCase().charAt(0);
		}
		
		System.out.println("FIM!");
		
		sc.close();
	}

}
