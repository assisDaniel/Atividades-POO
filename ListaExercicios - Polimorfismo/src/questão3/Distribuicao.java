package questão3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Distribuicao extends Controle{
	public void caminhaoApto() {
		Scanner scan= new Scanner(System.in);
		
		int sumCapacidade=0, maior=0;
		String tipoCaminhao= null, tipoDoMaior= null;
		List<String> tipos= new ArrayList<String>();
		List<String> listaDoMaior= new ArrayList<String>();
		
		System.out.println("Tipo do caminhao: ");
		tipoCaminhao= leString(scan);
		scan.nextLine();
		while(!tipoCaminhao.equals("Fim")) {
			int numPluv= leInteiro(scan);
			for(int i=0; i<numPluv; i++) {
				System.out.println("Tipo dos pluviometros");
				tipos.add(leString(scan));
				scan.nextLine();
				if(tipos.get(i).equals("Tipo1")) sumCapacidade+=1000;
				else sumCapacidade+= 2000;
			}
			
			if(maior<sumCapacidade) {
				listaDoMaior.clear();
				listaDoMaior.addAll(tipos);
				tipoDoMaior= tipoCaminhao;
				maior= sumCapacidade;
			}
			
			sumCapacidade=0;
			tipos.clear();
			System.out.print("----------------------------------------------\n");
			System.out.println("\nTipo do caminhão: ");
			tipoCaminhao= leString(scan);
		}
		System.out.println("\t\nCAMINHAO MAIS APTO");
		System.out.println("Tipo do maior caminhão: "+ tipoDoMaior);
		System.out.println("Lista dos pluviometros: "+ listaDoMaior);
		scan.close();
	}
	
	public static void main(String[] args) {
		Distribuicao sla= new Distribuicao();
		sla.caminhaoApto();
	}
}
