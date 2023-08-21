package application;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private String zapzap;
	private String email;
	private int anoNascimento;
	
	
	public Cliente(String nome, String sobrenome, String cpf, String zapzap, String email, int anoNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.zapzap = zapzap;
		this.email = email;
		this.anoNascimento = anoNascimento;
	}
	public String getNome() {
		return nome;
	}	
	public String getSobrenome() {
		return sobrenome;
	}	
	public String getCpf() {
		return cpf;
	}	
	public String getZapzap() {
		return zapzap;
	}
	public void setZapzap(String zapzap) {
		this.zapzap = zapzap;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}	
}
