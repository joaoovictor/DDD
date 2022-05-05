package construtores_metodos;

import java.util.Scanner;
public class Ex34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cliente[] clientes = new Cliente[5];
		
		int id, idade;
		String nome, email, agencia, numero;
		char possuiConta;
		double saldo;
		
		for(int i = 0; i < clientes.length; i++) {
			
			Cliente c;
			
			System.out.println("Digite seu nome: ");
			nome = sc.next();
		
			System.out.println("Digite seu email: ");
			email = sc.next();
		
			System.out.println("Digite seu ID: ");
			id = sc.nextInt();
		
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();
		
			System.out.println("Possuí conta bancária? S/N");
			possuiConta = sc.next().charAt(0);
		
			if(possuiConta == 'S'){
				System.out.println("Digite a agencia: ");
				agencia = sc.next();
			
				System.out.println("Digite o número: ");
				numero = sc.next();
			
				System.out.println("Digite seu saldo: ");
				saldo = sc.nextDouble();
				
				ContaBancaria cc = new ContaBancaria(agencia, numero, saldo);
				
				c = new Cliente(id, nome, idade, email, cc);
				
		} else {
			c = new Cliente(id, nome, idade, email, null);
		}
			clientes[i] = c;
			
		}
		
		for(int i = 0; i < clientes.length; i++){
			System.out.println(clientes[i].exibirNomeIdade());
			
			if(clientes[i].conta != null) {
				System.out.println(clientes[i].exibirDadosConta());
			} else {
				System.out.println("Não possuí conta!");
			}
		}
		
		sc.close();
	}

}
