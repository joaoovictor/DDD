package entrada_processamento_saida;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		
		System.out.println(" === C�lculo de m�dia ===");
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = sc.nextDouble();
		
		System.out.println("Digite o quarto n�mero: ");
		n4 = sc.nextDouble();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("A m�dia dos valores �: %.2f", media);
		sc.close();
	}

}
