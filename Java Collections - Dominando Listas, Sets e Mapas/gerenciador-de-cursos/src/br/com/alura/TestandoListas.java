package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String curso1 = "Java orientação a objetos";
		String curso2 = "Java herança e polimorfismo";
		String curso3 = "Html e CSS";
		
		ArrayList <String> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		System.out.println(cursos);
		
		cursos.remove(1);
		System.out.println(cursos);
		
		System.out.println("O primeiro curso da lista eh o: " + cursos.get(0));
		
		String curso4 = "Lógica de promgramção";
		cursos.add(curso4);
		cursos.add(curso2);
		Collections.sort(cursos);
		System.out.println(cursos);
		
		
	}

}
