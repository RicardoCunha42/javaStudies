package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		//<> = Generics List = Interface utilizada pelas classes ArrayList, LinkedList e Vector
		List<Conta> lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(23, 5556);
		Conta cc2 = new ContaCorrente(24, 5557);
		Conta cc3 = new ContaCorrente(25, 5558);
		Conta cc4 = new ContaCorrente(26, 5559);
		Cliente cl = new Cliente();
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		//lista.add(cl); Não compila em razão do parametro conta dos generics
		System.out.println("Tamanho: " + lista.size());
	
		Conta ref = lista.get(0); //typeCast não é mais necessário pq o get devolve uma ref Conta em razão dos generics
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			Conta cref = lista.get(i);
			System.out.println(cref);
		}
		
		System.out.println("-------------");
		
		for (Conta cref : lista) {
			System.out.println(cref);
			
		}
	}

}
