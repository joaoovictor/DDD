package construtores_metodos;

public class Cliente {
	public int id;
	public String nome;
	public int idade;
	public String email;
	public ContaBancaria conta;
	
	Cliente(int id, String nome, int idade, String email, ContaBancaria conta){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	void atualizarEmail(String email) {
		this.email = email;
	} 
	
	String exibirNomeIdade() {
		return " \n Nome: " + this.nome + " - " + "Idade: " + this.idade;
	}
	
	String exibirDadosConta() {
		return "Agencia: " + this.conta.agencia + " Numero: " + this.conta.numero + " Saldo: " + this.conta.saldo;
	}
}
