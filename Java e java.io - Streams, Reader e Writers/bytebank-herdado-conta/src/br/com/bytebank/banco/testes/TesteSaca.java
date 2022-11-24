package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta contap = new ContaPoupanca(8, 84);	
		
		contap.deposita(120);
		
		try {
			contap.saca(142);
		} catch (SaldoInsuficienteException ex) {
			ex.getMessage();
			ex.printStackTrace();
		}
		
			
		System.out.println(contap.getSaldo());

	}

}
