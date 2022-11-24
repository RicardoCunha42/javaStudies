package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Teste {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Ricardo", 27);
		Funcionario f2 = new Funcionario("Vitor", 28);
		Funcionario f3 = new Funcionario("Nandolares", 29);
		
		Set<Funcionario> funcionarios = new TreeSet<>((fa, fb) -> 
		Integer.compare(fa.getIdade(), fb.getIdade()));
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator <Funcionario> it = funcionarios.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().getNome());
		}

	}

}
