package entrada_processamento_saida;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		
		System.out.println(" === Cálculo de média ===");
		
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		n3 = sc.nextDouble();
		
		System.out.println("Digite o quarto número: ");
		n4 = sc.nextDouble();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("A média dos valores é: %.2f", media);
		sc.close();
	}

}
