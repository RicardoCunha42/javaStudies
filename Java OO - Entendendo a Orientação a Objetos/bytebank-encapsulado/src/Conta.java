
class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta (int agencia, int numero) {
		if (agencia <= 0 || numero <= 0) {
			System.out.println("Apenas números maiores que zero!");
		}
		this.agencia = agencia;
		this.numero = numero;
		total++;
		System.out.println("Conta de número " + numero + " criada na agência " + agencia );
	}
	
	public void deposita (double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
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
	
}
