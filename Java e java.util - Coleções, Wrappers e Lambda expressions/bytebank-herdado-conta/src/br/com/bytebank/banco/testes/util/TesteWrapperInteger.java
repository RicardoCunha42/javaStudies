package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		Integer idade = new Integer(27); //deprecated
		Integer idade2 = Integer.valueOf(28);//método atual de construção/autoboxing int para integer
		
		int valor = idade.intValue();//unboxing de volta para int
		System.out.println(idade2.doubleValue());//transformando em double
		
		
		Integer idade3 = Integer.valueOf("29");//String para Integer
		System.out.println(idade3);
		
		int idade4 = Integer.parseInt("30"); //String para int usando medoto Integer
		System.out.println(idade4);
		
		
		Integer idade5 = 32; //autoboxing criando um Integer
		int idade6 = Integer.valueOf(33);//que locura!! unboxing 
		
		List<Integer> lista = new ArrayList<>();
		lista.add(idade5);//ok
		lista.add(idade6);//autoboxing
		
		int i1 = lista.get(0);//unboxing
		int i2 = lista.get(1);//ok
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
	}

}
