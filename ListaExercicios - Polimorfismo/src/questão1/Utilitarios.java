package questão1;

public class Utilitarios {
	
	public void duplica(Repositorio A,  Repositorio B) {
		B.repository.clear();
		B.repository.addAll(A.repository);
	}
	
	public void diferenca(Repositorio A, Repositorio B, Repositorio C) {
		for(int i=0; i<A.repository.size(); i++) {
			if(!A.repository.contains(B.repository.get(i))) {
				C.repository.add(A.repository.get(i));
			}
		}
	}
}
