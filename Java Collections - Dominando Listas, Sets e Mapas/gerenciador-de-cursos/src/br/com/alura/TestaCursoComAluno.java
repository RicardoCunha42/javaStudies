package br.com.alura;

import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso curso = new Curso ("Collections", "Paulo");
		Aluno a1 = new Aluno("Roberto", 456);
		Aluno a2 = new Aluno("Ariana", 457);
		Aluno a3 = new Aluno("Naiara", 458);
		
		curso.matricula(a1);
		curso.matricula(a2);
		curso.matricula(a3);
		
		Set<Aluno> alunos = curso.getAlunos();
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
			
		});
	}

}
