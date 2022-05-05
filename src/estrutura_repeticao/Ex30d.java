package estrutura_repeticao;

public class Ex30d {

	public static void main(String[] args) {
		int i = 1;
		int n1 = 1;
		int n3 = 1;
		int n2 = 1;
		
		do {
			System.out.println(n1);
			int n4 = n1 + n2 + n3;
			n1 = n2;
			n2 = n3;
			n3 = n4;
			i++;
		}while(i <= 20);		

	}

}
