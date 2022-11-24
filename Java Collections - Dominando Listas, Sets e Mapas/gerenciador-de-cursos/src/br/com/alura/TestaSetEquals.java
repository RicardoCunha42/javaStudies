package br.com.alura;

import java.util.Set;

public class TestaSetEquals {
	public static void main(String[] args) {
		Curso vdn = new Curso("Vai dar Namoro", "Rodrigo Faro");
		Aluno a1 = new Aluno("Dudu da Ponte", 563);
		Aluno a2 = new Aluno("Clima e o tempor", 563);
		
		vdn.matricula(a1);
		vdn.matricula(a2);
		
		Set<Aluno> participantes = vdn.getAlunos();
		System.out.println(participantes);
	}
}
