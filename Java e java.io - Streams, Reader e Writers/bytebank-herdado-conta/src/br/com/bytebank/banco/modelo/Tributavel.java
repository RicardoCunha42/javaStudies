package br.com.bytebank.banco.modelo;


public abstract interface Tributavel {

	public abstract void setAliguota (double aliquota);
	
	public abstract double getImposto ();
	
}
