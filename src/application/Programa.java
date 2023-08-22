package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente gerenteCotia = new Gerente();
		
		gerenteCotia.setNome("Welton");
		gerenteCotia.setSalario(2000);
		
		Funcionario limpeza = new Funcionario();
		
		limpeza.setNome("Samuel");
		limpeza.setSalario(500);
		
		
		System.out.println(gerenteCotia.getNome());
		System.out.println(gerenteCotia.getSalario());

		System.out.println("Bonificação gerente 15%");
		System.out.println(gerenteCotia.bonificacao());
		
		System.out.println("Bonificação Limpeza");
		System.out.println(limpeza.getSalario());
		System.out.println(limpeza.bonificacao());
		
		

	}
	
	
}
