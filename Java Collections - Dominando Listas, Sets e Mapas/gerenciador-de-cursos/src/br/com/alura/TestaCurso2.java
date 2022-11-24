package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso curso = new Curso("Coleções", "Paulo");
		
		Aula a1 = new Aula("Trabalhando com arraylist", 40);
		Aula a2 = new Aula("Lista de objetos", 30);
		Aula a3 = new Aula("Relacionamento com coleções", 25);
		
		List<Aula> aulasImod = curso.getAulas();
		
		curso.adiciona(a1);
		curso.adiciona(a2);
		curso.adiciona(a3);
		
		List<Aula> aulasMod = new ArrayList<>(aulasImod);
		Collections.sort(aulasMod);
		System.out.println(aulasMod);
		
		int tempoTotal = curso.getTempoTotal();
		System.out.println(tempoTotal);
		
		System.out.println(curso);
		
		
	}

}
