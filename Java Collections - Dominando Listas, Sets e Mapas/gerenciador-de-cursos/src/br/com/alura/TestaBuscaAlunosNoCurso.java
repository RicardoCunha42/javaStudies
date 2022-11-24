package br.com.alura;

import java.util.Map;
import java.util.Objects;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		Curso curso = new Curso ("Collections", "Paulo");
		Aluno a1 = new Aluno("Roberto", 456);
		Aluno a2 = new Aluno("Ariana", 457);
		Aluno a3 = new Aluno("Naiara", 458);
		
		curso.matricula(a1);
		curso.matricula(a2);
		curso.matricula(a3);
		
		System.out.println(curso.buscaMatriculado(456));
		Aluno a4 = new Aluno("Homem buzina", 456);
		Aluno a5 = new Aluno("Dudu da Ponte", 457);
		curso.matricula(a4);
		curso.matricula(a5);
		
		curso.getAlunos().forEach((aluno)-> {
			System.out.println(aluno);
		});
		
		System.out.println("----------------------");
		
		Map<Integer, Aluno> matriculaParaAluno =  curso.getMatriculaParaAluno();
		matriculaParaAluno.values().forEach((aluno)-> {
			System.out.println(aluno);
		});
		
		System.out.println(curso.getAlunos().contains(a4));
		
		
		
	

	}

}
