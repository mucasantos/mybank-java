package application;

public class Conta {

	// Atributos da conta
	int numero;
	Cliente titular = new Cliente();
	int agencia;
	double saldo;
	String dataDeAbertura;

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
		String dados = "Titular:	" + this.titular;
		dados += "\nNúmero:	" + this.numero;
		dados += "\nAgência:	" + this.agencia;
		dados += "\nSaldo:	R$" + this.saldo;
		dados += "\nData	de	abertura:	" + this.dataDeAbertura;
		return dados;
	}

}
