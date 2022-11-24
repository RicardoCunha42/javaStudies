package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaBilioteca {

	public static void main(String[] args) {
		Conta c = new ContaCorrente (48, 94);
		c.deposita(500);
		
		System.out.println(c.getSaldo());
	}

}
