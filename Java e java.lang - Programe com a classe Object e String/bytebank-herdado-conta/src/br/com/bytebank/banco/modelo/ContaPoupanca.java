package br.com.bytebank.banco.modelo;


public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.2;
		
	}
	
	@Override
	public String toString() {
		return "Conta Poupança, " + super.toString();
		
	}
}
