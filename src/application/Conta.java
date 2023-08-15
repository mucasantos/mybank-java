package application;

public class Conta {

	// Atributos da conta
	//mudando o modo de visualização

	private int numero;
	Cliente titular = new Cliente();
	private int agencia;
	private double saldo;
	
	//Valor default
	private double limite = 1200.00;
	private String dataDeAbertura;
	
	

	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	
	// Métodos da conta
	 boolean sacar(double quantidade) {
		 
		if (this.saldo < quantidade) {
			return false;
		} else {
			this.saldo -= quantidade;
			return true;
		}
	}

	void depositar(double quantidade) {
		this.saldo += quantidade;
	}

	boolean transferePara(Conta destino, double valor) {
		// Verifica se temos saldo disponível
		if (this.saldo > valor) {
			// Atualizar o saldo, fazendo o saque
			this.saldo -= valor;
			// Efetua a transferência
			destino.saldo += valor;
			return true;
		} else {
			return false;
		}
	}

	double calculaRendimento() {
		return this.saldo * 0.1;
	}

	String recuperaDadosParaImpressao() {
		String dados = "Titular:	" + this.titular.getNome();
		dados += "\nNúmero:	" + this.numero;
		dados += "\nAgência:	" + this.agencia;
		dados += "\nSaldo:	R$" + this.saldo;
		dados += "\nData	de	abertura:	" + this.dataDeAbertura;
		return dados;
	}

}
