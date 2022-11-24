package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		ContaCorrente cc = new ContaCorrente(5555, 68);
		ContaPoupanca cp = new ContaPoupanca(2321, 57);
		
		guardador.addConta(cc);
		guardador.addConta(cp);
		
		System.out.println(guardador.getReferencias(0));
		System.out.println(guardador.getReferencias(1));
		
		System.out.println(guardador.getTotal());
		
	}

}
