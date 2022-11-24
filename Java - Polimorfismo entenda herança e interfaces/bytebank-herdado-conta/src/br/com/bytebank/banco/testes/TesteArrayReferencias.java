package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5]; 
		
		ContaCorrente c1 = new ContaCorrente (55, 3333);
		ContaPoupanca c2 = new ContaPoupanca(68, 3434);
		
		System.out.println(c2.getNumero());
		
		contas[0] = c1;
		contas[1] = c2;
		
		System.out.println(contas[1].getNumero());
		
		Object ref = contas[1];
		// não compila: System.out.println(ref.getNumero());
		
//		ContaCorrente ref2 = (ContaCorrente) contas[1]; Compila, mas não executa.
//		System.out.println(ref2.getNumero());
		
		ContaPoupanca ref2 = (ContaPoupanca) contas[1];
		System.out.println(ref2.getNumero());
		
	}

}
