package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente gerenteCotia = new Gerente();
		CaixaDoBanco caixa = new CaixaDoBanco();
		
		
		gerenteCotia.setNome("Welton");
		gerenteCotia.setSalario(2000);
		
		System.out.println(gerenteCotia.getNome());
		System.out.println(gerenteCotia.getSalario());

		System.out.println("Bonificação gerente 15%");
		System.out.println(gerenteCotia.bonificacao());
		
		System.out.println("Bonificação Limpeza");
	}
}
