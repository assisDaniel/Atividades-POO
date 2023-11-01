package Exercícios;
import java.util.*;

public class Tarefa2 {
	public static void main(String[] args) {
		separarGrupos();
	}
	
	public static void separarGrupos() {
		Map<String, String> map= new HashMap<String, String>();
		map.put("Daniel", "Masculino");
		map.put("Daniela", "Feminino");
		map.put("Laiza", "Feminino");
		map.put("Wosley", "Masculino");
		
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
