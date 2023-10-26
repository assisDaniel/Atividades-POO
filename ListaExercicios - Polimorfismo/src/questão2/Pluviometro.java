package questão2;

public class Pluviometro {
	protected String tipo;
	//Suponhamos que só temos dois tipos de pluviometro.
	
	public Pluviometro(String tipo) {
		this.tipo= tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getPeso() {
		if(this.getTipo()== "Tipo 1") return 1;
		return 2;
	}
	
	public int getCapacidade() {
		if(this.getTipo()== "Tipo 1") return 1000;
		else return 2000;
	}
}
