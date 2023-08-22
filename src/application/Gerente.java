package application;

public class Gerente extends Funcionario {

	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}
	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {	
			//No caso de garantido o acesso, levar o user para
			//algum lugar específico
			System.out.println("Acesso permitido");
			return true; // 1
		} else {
			System.out.println("Acesso Negado!!");
			return false; //0
		}
	}
	
	@Override
	public double bonificacao() {
		return this.salario * 0.15 + 13.000;
	}
}
