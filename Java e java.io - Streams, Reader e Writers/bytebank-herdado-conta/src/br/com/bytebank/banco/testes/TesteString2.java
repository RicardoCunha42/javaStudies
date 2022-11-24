package br.com.bytebank.banco.testes;

public class TesteString2 {

	public static void main(String[] args) {
		String nome = "Tristão";
		String outro = new String ("Diarmuid");
		
		String outro2 = outro.replace("D", "d");
		System.out.println(outro2);
		
		String nome2 = nome.toUpperCase();
		System.out.println(nome2);
		
		String nome3 = nome.toLowerCase();
		System.out.println(nome3);
		
		char letra = outro.charAt(5);
		System.out.println(letra);
		
		int pos = outro.indexOf("a");
		System.out.println(pos);
		
		String sub = nome.substring(0, 5);
		System.out.println(sub);
		
		int size  = outro.length();
		for (int i = 0; i < size; i++) {
			System.out.println(outro.charAt(i));
			
		}
		
		String vazio = "";
		System.out.println(vazio.isEmpty());
		
		String contido = "  contido  ";
		System.out.println(contido.contains("tido"));
		
		System.out.println(contido);
		String trimado = contido.trim();
		System.out.println(trimado);
		
		String[] separado = outro.split("mui");
		System.out.println(separado.length);
		for (int i = 0; i < separado.length; i++) {
			System.out.println(separado[i]);
		
		}
	}

}
