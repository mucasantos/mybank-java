package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta minhaConta = new Conta();
		Conta meuSonho = new Conta();

		minhaConta.titular.setNome("Samuel Santos");
		minhaConta.setNumero(2289);

		String newName = "Samuca santos";

		meuSonho.titular.setNome(newName);
		meuSonho.setNumero(1289); 
		

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
