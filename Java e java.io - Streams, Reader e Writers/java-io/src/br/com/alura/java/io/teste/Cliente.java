package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que delinea o cliente do ByteBank
 * 
 * @author Ricardo Cunha
 * @version 0.1
 *
 */
public class Cliente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNomeCpfProfissao () {
		return this.nome + ", " + this.cpf + ", " + this.profissao;
	}
	
	public String getNomeECpf () {
		return this.nome + ", " + this.cpf;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setProfissao (String profissao) {
		this.profissao = profissao;
	}
	
	public String getProfissao() {
		return this.profissao;
	}

}