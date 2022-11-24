package br.com.alura;

import java.util.List;

public class testaCurso {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Coleções", "Paulo");
		
		Aula a1 = new Aula("Trabalhando com arraylist", 40);
		Aula a2 = new Aula("Lista de objetos", 30);
		Aula a3 = new Aula("Relacionamento com coleções", 25);
		
		List<Aula> aulas = curso.getAulas();
		System.out.println(aulas);
		
		curso.adiciona(a1);
		curso.adiciona(a2);
		curso.adiciona(a3);
		System.out.println(aulas);
	}

}