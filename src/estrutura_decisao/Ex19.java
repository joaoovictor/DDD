package estrutura_decisao;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p1, p2, media;
		
		System.out.println("=== MÉDIA ===");
		
		System.out.println("Digite a nota da P1: ");
		p1 = sc.nextDouble();
		System.out.println("Digite a nota da P2: ");
		p2 = sc.nextDouble();
		
		media = (p1 + 2*p2)/3;
		
		  if(media >= 5) {
			System.out.printf("%.1f APROVADO!", media);
		} else {
			System.out.printf("%.1f REPROVADO!", media);
		}
		sc.close();
	}

}
