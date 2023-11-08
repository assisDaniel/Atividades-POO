package Exercícios.exercicio_pessoa;

public abstract class Pessoa {
	private String nome;
	private int idade;
	
	
	public abstract String imprimirDocumento();
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
