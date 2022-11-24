package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso (String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
		
	}
	
	public void adiciona (Aula aula) {
		this.aulas.add(aula);
		
	}
	
	public List<Aula> getAulas () {
		return Collections.unmodifiableList(aulas);
		
	}
	
	public int getTempoTotal () {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Nome: " + this.nome + ", Duração: " + this.getTempoTotal() + 
				", Aulas: " + this.aulas + "]";
	}
	
	public void matricula (Aluno aluno) {
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		if(this.alunos.contains(aluno)) {
			this.alunos.removeIf(aluno1 -> aluno1.equals(aluno));
			this.alunos.add(aluno);
			}
		this.alunos.add(aluno);
	}

	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
		
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
		
	}
	
	public Aluno buscaMatriculado (int matricula) {
		if(!matriculaParaAluno.containsKey(matricula)) 
			throw new NoSuchElementException
			("Esta não é uma matrícula registrada");
		return matriculaParaAluno.get(matricula);
		
	}
	
	public Map getMatriculaParaAluno() {
		return this.matriculaParaAluno;
	}
}
