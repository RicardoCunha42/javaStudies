package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * 
 * Classe que traça a estrutura de uma conta do Bytebank.
 * 
 * @author Ricardo Cunha
 * @version 0.1
 * 
 */
public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
	private static int total;
	
	/**
	 * Construtor específico que permite criar uma conta com número e agência predeterminados,
	 * além de incrementar o atributo total, que permite contabilizar a quantidade de contas abertas
	 *   
	 * @param agencia
	 * @param numero
	 */
	public Conta (int agencia, int numero) {
		if (agencia <= 0 || numero <= 0) {
			System.out.println("Apenas números maiores que zero!");
		}
		this.agencia = agencia;
		this.numero = numero;
		total++;
		System.out.println("Conta de número " + numero + " criada na agência " + agencia );
	}
	
	public abstract void deposita (double valor);
	
	/**
	 * Valor tem que ser menor ou igual ao saldo para que a operação seja efetivada,
	 * caso contrário suscitará a SaldoInsuficienteException
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca (double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException ("Saldo insuficiente! Saldo: " + this.saldo + ". " + "Valor: " + valor + ".");
		} 
		
		this.saldo -= valor;
		
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
			
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setNumero (int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setTitular (Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular () {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "Número: " + this.numero + ", Agência: " + this.agencia; 
		
	}
	
	@Override
	public boolean equals (Object ref) {
		Conta conta = (Conta) ref;
		
		if (this.agencia != conta.agencia || this.numero != conta.numero) {
			return false;
			
		} else {
			return true;
		}
		
	}
	
	@Override
	public int compareTo(Conta conta) {
		return Double.compare(this.saldo, conta.saldo);
	}
		
}
