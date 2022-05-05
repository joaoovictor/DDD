package estrutura_repeticao;

public class Ex30f {

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 1;
		int n3 = 1;
		
		for(int i = 1; i<=20; i++) {
			System.out.println(n1);
			int n4 = n1 + n2 + n3;
			n1 = n2;
			n2 = n3;
			n3 = n4;
		}

	}

}
