package questão1;
import java.util.ArrayList;
import java.util.List;

public class Repositorio{
	private int current=0;
	List<Pessoa> repository= new ArrayList<Pessoa>();
	
	public void guarda(Pessoa nova) {
		repository.add(nova);
		current++;
	}
	
	public Pessoa recupera(String cpf) {
		for(Pessoa i: repository) {
			if(i.getCpf()== cpf) return i;
		}
		return null;
	}
	
	public Pessoa primeiro() {
		this.current=0;
		return repository.get(0);
	}
	
	public Pessoa proximo() {
		Pessoa aux= repository.get(current+1);
		current++;
		return aux;
	}
}
