package br.com.bytebank.banco.modelo;


public class ContaCorrente extends Conta implements Tributavel {
	private double aliquota;
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public double getImposto() {
		double imposto = this.saldo * this.aliquota;
		return imposto;
	}

	@Override
	public void setAliguota(double aliquota) {
		this.aliquota = aliquota;
		
	}
	
	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
		
	}
}

