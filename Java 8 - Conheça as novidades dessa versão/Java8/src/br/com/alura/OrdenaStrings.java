package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
//		palavras.sort(new Comparator <String> () {
//			@Override
//			public int compare(String o1, String o2) {
//				if (o1.length() < o2.length()) {
//					return -1;
//				}
//				if (o1.length() > o2.length()) {
//					return 1;
//				}
//				return 0;
//			}
//		});
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		//palavras.sort((s1, s2) -> s1.compareTo(s2));
		//palavras.sort(Comparator.comparing(String::length));
		//palavras.sort(comparing(String::length)); Importe estático, n sei como fazer
		//palavras.sort(Comparator.comparing(s -> s.length()));
		//palavras.sort((palavra1, palavra2) -> Integer.compare(palavra1.length(), palavra2.length()));
		//palavras.sort((s1, s2) -> s1.length() - s2.length());
		

		palavras.forEach(System.out::println);
//		palavras.forEach(palavra -> System.out.println(palavra));
//		palavras.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);	
//			}
//		});
	

	
	}
}
