package encapsulamento;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cliente[] listaClientes = new Cliente[2];
		
		String nome, email, agencia, numero;
		int idade, id ;
		char possuiConta;
		double saldo;
		
		for(int i = 0; i < listaClientes.length; i++) {
			
			Cliente c = new Cliente();
			
			System.out.printf("Digite seu ID: ");
			id = sc.nextInt();
			
			c.setId(id);
			
			System.out.printf("Digite seu Nome: ");
			nome = sc.next();
			
			c.setNome(nome);
			
			System.out.printf("Digite seu idade: ");
			idade = sc.nextInt();
			
			c.setIdade(idade);
			
			System.out.printf("Digite seu email: ");
			email = sc.next();
			
			c.setEmail(email);
			
			System.out.println("Você possui conta? S/N");
			possuiConta = sc.next().charAt(0);
			
			
			if(possuiConta == 'S') {
				ContaBancariaa cc = new ContaBancariaa();
				
				System.out.println("Digite a agência: ");
				agencia = sc.next();
				
				cc.setAgencia(agencia);
				
				System.out.println("Digite o número: ");
				numero = sc.next();
				
				cc.setNumero(numero);
				
				System.out.println("Digite a saldo: ");
				saldo = sc.nextDouble();
				
				cc.setSaldo(saldo);
				
				c.setConta(cc);
			}
			
			listaClientes[i] = c;
		}
		for(int i = 0; i < listaClientes.length; i++){
			System.out.println(listaClientes[i].exibirNomeIdade());
			
			if(listaClientes[i].getConta() != null) {
				System.out.println(listaClientes[i].exibirDadosConta());
			} else {
				System.out.println("Não possui conta!");
			}
			}
		sc.close();
		}
		
	}
	


