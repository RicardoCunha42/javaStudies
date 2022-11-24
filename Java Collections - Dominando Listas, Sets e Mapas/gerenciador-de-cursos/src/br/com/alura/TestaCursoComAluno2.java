package br.com.alura;

import java.util.Set;

public class TestaCursoComAluno2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

       Set<Aluno> alunos = javaColecoes.getAlunos();
       Aluno a4 = new Aluno("Marcelo", 17648);
       alunos.add(a4);

	}

}
