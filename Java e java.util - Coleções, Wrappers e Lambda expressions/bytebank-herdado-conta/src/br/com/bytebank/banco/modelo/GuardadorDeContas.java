package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas () {
		this.referencias = new Conta[10];
		
	}
	
	public void addConta (Conta ref) {
		this.referencias[posicaoLivre] = ref;
		posicaoLivre++;
	}
	
	public Conta getReferencias (int pos) {
		return this.referencias[pos];
		
	}
	
	public int getTotal () {
		return this.posicaoLivre;
	}
}
