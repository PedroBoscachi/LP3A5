package ex2;

public class Pessoa {
	protected String nome;
	protected int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void apresentar() {
		System.out.println("Olá, eu sou " + nome + " e tenho " + idade + " anos.");
	}
}

