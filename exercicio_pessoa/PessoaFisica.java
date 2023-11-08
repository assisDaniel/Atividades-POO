package Exercícios.exercicio_pessoa;

public class PessoaFisica extends Pessoa{
	private String cpf;
	@Override
	public String imprimirDocumento() {
		return "CPF: "+this.getCpf();
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
