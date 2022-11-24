package br.com.bytebank.banco.modelo;


public class SeguroDeVida implements Tributavel {
	private double saldo;
	private double aliquota;

	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public void setAliguota(double aliquota) {
		this.aliquota = aliquota;
	}

	@Override
	public double getImposto() {
		double imposto = this.saldo * this.aliquota;
		return imposto;
	}

}
