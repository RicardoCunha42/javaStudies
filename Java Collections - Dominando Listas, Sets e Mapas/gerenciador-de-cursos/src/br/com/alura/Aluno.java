package br.com.alura;

import java.util.Objects;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
		
	}

	public String getNome() {
		return nome;
		
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
		
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matrícula: " + this.numeroMatricula + "]";
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroMatricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return numeroMatricula == other.numeroMatricula;
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		Aluno outroAluno = (Aluno) obj;
//		return this.nome.equals(outroAluno.nome);
//		
//	}
//	
//	@Override
//	public int hashCode() {
//		return this.nome.hashCode();
//		
//	}

}
