package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	
	public static void main(String[] args) {
	
		Collection<Integer> numeros = new ArrayList<Integer>();
	
	    long inicio1 = System.currentTimeMillis();
	
	    for (int i = 1; i <= 50000; i++) {
	        numeros.add(i);
	    }
	    
	    long fim1 = System.currentTimeMillis();
	    long tempoDeExecucao = fim1 - inicio1;	
	    System.out.println("Tempo gasto: " + tempoDeExecucao);
	
	    long inicio2 = System.currentTimeMillis();
	    for (Integer numero : numeros) {
	        numeros.contains(numero);
	    }
	    
	    long fim2 = System.currentTimeMillis();
	
	    long tempoDeExecucao2 = fim2 - inicio2;
	
	    System.out.println("Tempo gasto: " + tempoDeExecucao2);
	    
//	    long inicio3 = System.currentTimeMillis();
//	    for (Integer numero : numeros) {
//	        System.out.println(numero);
//	    }
//	    
//	    long fim3 = System.currentTimeMillis();
//	
//	    long tempoDeExecucao3 = fim3 - inicio3;
//	
//	    System.out.println("Tempo gasto: " + tempoDeExecucao3);
//	
	}

}
