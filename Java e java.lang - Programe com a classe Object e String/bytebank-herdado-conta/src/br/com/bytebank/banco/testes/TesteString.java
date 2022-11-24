package br.com.bytebank.banco.testes;

public class TesteString {
	public static void main(String[] args) {
		String nome = "Ricardo";
		
		String vazio = "";
		System.out.println(vazio.isEmpty());
		
		vazio = " ";
		System.out.println(vazio.isEmpty());
		
		String vazio2 = " triste ";
		System.out.println(vazio2);
		System.out.println(vazio2.contains("ris"));
		System.out.println(vazio2.trim());
		
		int onde = nome.indexOf("ar");
		System.out.println(onde);
		
		char pos = nome.charAt(5);
		System.out.println(pos);
		
		char a = 'R';
		char b = 'r';
		String outra = nome.replace(a, b);
		System.out.println(outra);
		
		String outra2 = nome.toLowerCase();
		System.out.println(outra2);
		
		String outra3 = nome.toUpperCase();
		System.out.println(outra3);
		
		String c = "Ri";
		String d = "rI";
		String outra4 = nome.replace(c, d);
		System.out.println(outra4);
		
		String sub = nome.substring(2);
		System.out.println(sub);
		
		int size = nome.length();
		for (int i = 0; i < size; i++) {
			System.out.println(nome.charAt(i));
			
		}
		
		
		
	}
}
