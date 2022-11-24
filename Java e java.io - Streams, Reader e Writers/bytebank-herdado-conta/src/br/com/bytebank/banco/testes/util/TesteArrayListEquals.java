package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String[] args) {
		List<Conta> lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(23, 5556);
		Conta cc2 = new ContaCorrente(24, 5557);
		lista.add(cc1);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(24, 5557);
		boolean existe = lista.contains(cc3);
		System.out.println("Existe? " + existe);
	
	}

}
