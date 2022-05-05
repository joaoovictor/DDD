package estrutura_repeticao;

public class Ex30w {

	public static void main(String[] args) {
		int i = 1;
		int n1 = 1;
		int n3 = 1;
		int n2 = 1;
		
		while(i <= 20) {
			System.out.println(n1);
			int n4 = n1 + n2 + n3;
			n1 = n2;
			n2 = n3;
			n3 = n4;
			i++;
		}

	}

}
