package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		Conta cc = new ContaCorrente(5555, 68);
		Conta cp = new ContaPoupanca(2321, 57);
		
		guardador.addObject(cc);
		guardador.addObject(cp);
		
		System.out.println(guardador.getReferencias(0));
		System.out.println(guardador.getReferencias(1));
		
		System.out.println(guardador.getTotal());

	}

}
