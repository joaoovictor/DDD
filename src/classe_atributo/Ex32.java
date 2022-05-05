package classe_atributo;


import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente[] listaCliente = new Cliente[5];
		
		for(int i = 0; i < listaCliente.length; i++){
			Cliente c = new Cliente();
			
			System.out.println("Digite o id: ");
			c.id = sc.nextInt();
			
			System.out.println("Digite a idade: ");
			c.idade = sc.nextInt();
			
			System.out.println("Digite o nome: ");
			c.nome = sc.next();
			
			System.out.println("Digite o email: ");
			c.email = sc.next();
			
			listaCliente[i] = c;
		}
		
		for(int i = 0; i < listaCliente.length; i++) {
			if(listaCliente[i].idade >= 18) {
				System.out.println("Id: " + listaCliente[i].id + " Nome: " + listaCliente[i].nome + " Idade: " + listaCliente[i].idade + " Email: " + listaCliente[i].email);
			}
		}
		sc.close();
	}

}
