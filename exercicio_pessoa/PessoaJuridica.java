package Exercícios.exercicio_pessoa;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	@Override
	public String imprimirDocumento() {
		return "CNPJ: "+this.getCnpj();
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
