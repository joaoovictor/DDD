package estrutura_repeticao;

public class Ex28w {

	public static void main(String[] args) {
		int intervalo = 1;
		int soma = 0;
		
		while(intervalo <= 100) {
			soma = soma + intervalo;
			intervalo++;
		}
		
		System.out.printf("A soma dos resultados é %d ", soma);

	}

}
