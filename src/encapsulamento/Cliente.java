package encapsulamento;

public class Cliente {
	private int id;
	private String nome;
	private int idade;
	private String email;
	private ContaBancariaa conta;
	
	Cliente(){
		
	}
	
	Cliente(int id, String nome, int idade, String email, ContaBancariaa conta){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ContaBancariaa getConta() {
		return this.conta;
	}
	
	public void setConta(ContaBancariaa conta){
		this.conta = conta;
	}
	
	void atualizarEmail(String email) {
		setEmail(email);
	}
	
	String exibirNomeIdade() {
		return "\n Nome: " + this.getNome() + " - " + " Idade: " + this.getIdade();
	}
	
	
	
	String exibirDadosConta() {
		return "\n Agencia: " + this.getConta().getAgencia() + "\n Número: " + this.getConta().getNumero() + " \n Saldo: " + this.getConta().getSaldo(); 
	}
	
	
	
	
}
