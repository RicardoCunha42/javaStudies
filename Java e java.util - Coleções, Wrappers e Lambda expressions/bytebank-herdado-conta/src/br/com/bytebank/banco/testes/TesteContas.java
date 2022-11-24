package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) throws Exception {
		ContaCorrente cc = new ContaCorrente(42, 8484);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(21, 4848);
		cp.deposita(200);
		
		cp.transfere(25, cc);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}

}
