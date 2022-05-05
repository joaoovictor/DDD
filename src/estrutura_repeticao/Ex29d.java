package estrutura_repeticao;

public class Ex29d {

	public static void main(String[] args) {
		int i = 1;
		int n1 = 0;
		int n2 = 1;
		
		do {
			System.out.println(n1);
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			i++;
		}
		while(i <= 20);
	}

}
