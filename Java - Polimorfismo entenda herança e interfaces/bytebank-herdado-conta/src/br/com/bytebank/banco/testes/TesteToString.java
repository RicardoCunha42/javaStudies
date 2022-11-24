package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteToString {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(68, 5555);
		ContaPoupanca cp = new ContaPoupanca(72, 6464);
		
		System.out.println(cc);
		System.out.println(cp);
		
	}
}
