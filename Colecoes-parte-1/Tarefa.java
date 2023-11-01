package Exercícios;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Tarefa {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Daniel Barbosa");
		nomes.add("Tarciso Filho");
		nomes.add("Iago Arruda");
		nomes.add("Wosley Arruda");
		ordemAlfabeticaNomes(nomes);
	}
	
	public static void ordemAlfabeticaNomes(List<String> nomes) {
		Set<String> nomesOrdenados= new TreeSet<String>();
		
		for(int i=0; i<nomes.size(); i++) {
			nomesOrdenados.add(nomes.get(i));
		}
		
		System.out.println(nomesOrdenados);
	}
}
