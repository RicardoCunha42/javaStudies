package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeReferencias () {
		this.referencias = new Object[10];
		
	}
	
	public void addObject (Object ref) {
		this.referencias[posicaoLivre] = ref;
		posicaoLivre++;
	}
	
	public Object getReferencias (int pos) {
		return this.referencias[pos];
		
	}
	
	public int getTotal () {
		return this.posicaoLivre;
	}
}
