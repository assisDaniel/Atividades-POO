package Exercícios;
import java.util.*;

public class Tarefa2 {
	public static void main(String[] args) {
		separarGrupos();
	}
	
	public static void separarGrupos() {
		Scanner scan= new Scanner(System.in);
		Map<String, String> map= new HashMap<String, String>();
		
		System.out.println("Quer adicionar outra pessoa? \n Digite: \n 0 para nao\n 1 para sim");
		int quest= scan.nextInt();
		while(quest!= 0) {
			scan.nextLine();
			String nome, sexo;
			System.out.println("Digite o nome da pessoa: ");
			nome= scan.nextLine();
			System.out.println("Digite o sexo da pessoa: ");
			sexo= scan.nextLine();
			
			map.put(nome, sexo);
		
			System.out.println("Quer adicionar outra pessoa? \n Digite: \n 0 para nao\n 1 para sim");
			quest= scan.nextInt();
		}
		
		System.out.println("Grupo Feminino: ");
		for(String i: map.keySet()) {
			if(map.get(i).equals("Feminino")) {
				System.out.println(i);
			}
		}
		System.out.println(" ");
		System.out.println("Grupo Masculino: ");
		for(String j: map.keySet()) {
			if(map.get(j).equals("Masculino")) {
				System.out.println(j);
			}
		}
	}
}
