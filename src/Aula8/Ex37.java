package Aula8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Cliente> listaClientes = new ArrayList<> ();
		
		int opcao;
		int id;
		int idade;
		String nome, email, numero, agencia;
		char possuiConta;
		double saldo;
		
		do {
			System.out.printf("===> Sistema de Cadastro de Clientes <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Incluir cliente \n" +
                              "2 - Atualizar cliente \n" +
                              "3 - Excluir cliente \n" +
                              "4 - Exibir clientes \n" +
                              "5 - Sair\n\n");

			
			System.out.printf("Digite a opção desejada: ");
			opcao = sc.nextInt();
			
			if(opcao == 1) {
				Cliente c = new Cliente();
				
				id = listaClientes.size() + 1;
				c.setId(id);
				
				System.out.println("Digite o nome do cliente: ");
				nome = sc.next();
				c.setNome(nome);
				
				System.out.println("Digite a idade: ");
				idade = sc.nextInt();
				c.setIdade(idade);
				
				System.out.println("Digite o email: ");
				email = sc.next();
				c.setEmail(email);
				
				System.out.println("Possui conta? S/N");
				possuiConta = sc.next().charAt(0);
				
				if(possuiConta == 'S') {
					ContaBancaria cc = new ContaBancaria();
					
					System.out.println("Digite a agencia: ");
					agencia = sc.next();
					cc.setAgencia(agencia);
					
					cc.setAgencia(agencia);
					System.out.println("Digite o número: ");
					numero = sc.next();
					cc.setNumero(numero);
					
					System.out.println("Digite seu saldo: ");
					saldo = sc.nextDouble();
					cc.setSaldo(saldo);
					
					c.setConta(cc);
				}
				
				listaClientes.add(c);
				System.out.printf("=== Cliente adicionado com sucesso!");
				System.in.read();
				
			}else if(opcao == 2) {
				for(Cliente c: listaClientes) {
					System.out.printf("ID: %d - Nome: %s - Email: %s",  c.getId(), c.getNome(), c.getEmail());
					
					if(c.getConta() != null) {
						System.out.printf("\n Agência: %s - Número: %s - Saldo: %.2f", c.getConta().getAgencia(), c.getConta().getNumero(), c.getConta().getSaldo());
						}
					}
				
				System.out.printf("Digite o ID do cliente que deseja atualizar: ");
				id = sc.nextInt();
				
				System.out.printf("Digite o novo nome do cliente: ");
				nome = sc.next();
				
				System.out.printf("Digite a nova idade do cliente: ");
				idade = sc.nextInt();
				
				System.out.printf("Digite o novo email: ");
				email = sc.next();
				
				System.out.printf("O cliente possui conta? S/N ");
				possuiConta = sc.next().charAt(0);
				
				if(possuiConta == 'S') {
					ContaBancaria cc = new ContaBancaria();
					
					System.out.printf("Digite a nova agência: ");
					agencia = sc.next();
					cc.setAgencia(agencia);
					
					System.out.printf("Digite o novo número: ");
					numero = sc.next();
					cc.setNumero(numero);
					
					System.out.printf("Digite o novo saldo: ");
					saldo = sc.nextDouble();
					cc.setSaldo(saldo);
					
					Cliente cliente = listaClientes.get(id - 1);
					
					cliente.setConta(cc);
				}
				Cliente cliente = listaClientes.get(id - 1);
				
				cliente.setNome(nome);
				cliente.setIdade(idade);
				cliente.setEmail(email);
				
				System.out.println("=== Cliente atualizado com sucesso! ===");
				System.in.read();
				
				} else if (opcao == 3) {
					for(Cliente c: listaClientes) {
						System.out.printf("ID: %d - Nome: %s - Email: %s",  c.getId(), c.getNome(), c.getEmail());
						
						if(c.getConta() != null) {
							System.out.printf("\n Agência: %s - Número: %s - Saldo: %.2f", c.getConta().getAgencia(), c.getConta().getNumero(), c.getConta().getSaldo());
							}
						}
					
					System.out.println("Digite o ID para exclusão: ");
					id = sc.nextInt();
					
					listaClientes.remove(id - 1);
					System.out.println("=== Cliente Removido com sucesso! ===");
					System.in.read();
				} else if (opcao == 4) {
					for(Cliente c: listaClientes) {
						System.out.printf("ID: %d - Nome: %s - Email: %s",  c.getId(), c.getNome(), c.getEmail());
						
						if(c.getConta() != null) {
							System.out.printf("\n Agência: %s - Número: %s - Saldo: %.2f", c.getConta().getAgencia(), c.getConta().getNumero(), c.getConta().getSaldo());
							}
						}
					
					System.in.read();
				}
				
			}while (opcao != 5); 
		
			sc.close();
		} 
	
}
	


