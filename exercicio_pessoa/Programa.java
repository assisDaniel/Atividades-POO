package Exercícios.exercicio_pessoa;

public class Programa {
	public static void main(String[] args) {
		PessoaFisica pessoa= new PessoaFisica();
		PessoaJuridica pessoa2= new PessoaJuridica();
		
		System.out.println("Pessoa Fisica: ----------------");
		pessoa.setNome("Daniel");
		pessoa.setIdade(18);
		pessoa.setCpf("XXX.XXX.XXX-XX");
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getCpf());
		
		System.out.println("\nPessoa Juridica: ------------------");
		pessoa2.setNome("Wosley");
		pessoa2.setIdade(20);
		pessoa2.setCnpj("XX.XXX.XXX/0001-XX");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getCnpj());
	}
}
