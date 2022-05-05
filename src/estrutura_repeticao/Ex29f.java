package estrutura_repeticao;

public class Ex29f {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		
		for(int i = 1; i<=20; i++) {
			System.out.println(n1);
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}

	}

}
