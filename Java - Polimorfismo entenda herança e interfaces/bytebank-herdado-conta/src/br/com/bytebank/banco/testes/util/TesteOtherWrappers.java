package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOtherWrappers {

	public static void main(String[] args) {
		
		Integer idade = Integer.valueOf(28);//método atual de construção/autoboxing int para integer
		int valor = idade.intValue();//unboxing de volta para int
		
		Double idade2 = Double.valueOf(27.1);//autoboxing de double para Double
		double valor2 = idade2.doubleValue();//unboxing de volta para double
		
		Boolean logico = Boolean.TRUE;//autoboxing de boolean para Boolean
		boolean valor3 = logico.booleanValue();//unboxing de volta para boolean
		
		Float idade3 = Float.valueOf(28.2f);//autoboxing de float para Float
		float valor4 = idade3.floatValue(); //unboxing de volta para float
		
		List <Number> numeros = new ArrayList<>();
		numeros.add(idade);
		numeros.add(valor);
		numeros.add(idade2);
		numeros.add(valor2);
		numeros.add(idade3);
		numeros.add(valor4);
		
		for (Number ref : numeros) {
			System.out.println(ref);
		}

	}

}
