package br.com.alura;

import java.util.Set;
import java.util.TreeSet;

public class Recibo {

	public static void main(String[] args) {

	Recibo rec1 = new Recibo();
	// atribui valores
	Recibo rec2 = new Recibo();
	// atribui valores
	Recibo rec3 = new Recibo();
	// atribui valores
	
	Set<Recibo> recs = new TreeSet<>();
	
	recs.add(rec1);
	recs.add(rec2);
	recs.add(rec3);
	

	}

}
