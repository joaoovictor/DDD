package encapsulamento;

public class ContaBancariaa {
	private String agencia, conta;
	private String numero;
	private double saldo;
	
	ContaBancariaa(){
		
	}
	
	ContaBancariaa(String agencia, String conta, String numero, double saldo){
		this.agencia = agencia;
		this.conta = conta;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
