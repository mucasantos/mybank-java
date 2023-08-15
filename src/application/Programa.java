package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta minhaConta = new Conta();
		Conta meuSonho = new Conta();
 		
		minhaConta.titular.nome = "Samuel Santos";
		minhaConta.numero = 12289;
		minhaConta.saldo = 202.01;

		meuSonho.titular.nome = "Jojoca Santos";
		meuSonho.numero = 12288;
		meuSonho.saldo = 200000.86;
				
		
		if(meuSonho.transferePara(minhaConta, 200010.00)) {
			System.out.println("Operação efetuada com sucesso!!");
		}else {
			System.out.println("Erro ao tranferir...Verifique o saldo...!!");
		}
		
		System.out.println("Saldo atual: " + minhaConta.saldo);

		//TODO: Adicionar mensagem caso o cliente não consiga sacar ou uma 
		//mensagem de sucesso!
		
		if(minhaConta.sacar(201.00)) {
			System.out.println("Operação efetuada com sucesso!!");
		}else {
			System.out.println("Erro...Verifique o saldo...!!");
		}
		
		System.out.println("Saldo depois de sacar: " + minhaConta.saldo);
		
		minhaConta.depositar(15234.12);
		
		System.out.println("Saldo depois de depositar: " + minhaConta.saldo);
		
		System.out.println(minhaConta.recuperaDadosParaImpressao());
	}

}
