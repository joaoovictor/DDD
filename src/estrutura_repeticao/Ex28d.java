package estrutura_repeticao;

public class Ex28d {

	public static void main(String[] args) {
		int intervalo = 1;
		int soma = 0;
		
		do {
			soma = soma + intervalo;
			intervalo++;
		}
		while(intervalo <= 100);
		
		System.out.printf("A soma dos resultados é %d ", soma);

	}

}
