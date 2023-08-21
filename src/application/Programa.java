package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("Samuel", "Santos", "123.456.456-89", "1195858-8956", "mucasantos@gmail.com", 1977);
		Cliente cliente2 = new Cliente("Jojoca", "Pinheiro", "555.456.456-89", "1195858-8977", "jojoca@gmail.com", 1971);
		
		Conta minhaConta = new Conta(123, cliente1, 2255, 0, 0, "15/08/2023");
		Conta meuSonho =new Conta(124, cliente2, 2255, 0, 0, "15/08/2023");
		

		if (meuSonho.transferePara(minhaConta, 200010.00)) {
			System.out.println("Operação efetuada com sucesso!!");
		} else {
			System.out.println("Erro ao tranferir...Verifique o saldo...!!");
		}

		System.out.println("Saldo atual: " + minhaConta.getSaldo());

		// TODO: Adicionar mensagem caso o cliente não consiga sacar ou uma
		// mensagem de sucesso!

		if (minhaConta.sacar(201.00)) {
			System.out.println("Operação efetuada com sucesso!!");
		} else {
			System.out.println("Erro...Verifique o saldo...!!");
		}

		System.out.println("Saldo depois de sacar: " + minhaConta.getSaldo());

		minhaConta.depositar(15234.12);

		System.out.println("Saldo depois de depositar: " + minhaConta.getSaldo());

		System.out.println(minhaConta.recuperaDadosParaImpressao());
	}

}
