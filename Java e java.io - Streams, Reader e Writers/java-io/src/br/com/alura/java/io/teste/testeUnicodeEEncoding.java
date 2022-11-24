package br.com.alura.java.io.teste;

import java.io.Console;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.ConsoleHandler;

public class testeUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String r = "ç";
		System.out.println(r.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset);
		
		byte[] bytes = r.getBytes();
		System.out.print(bytes.length + " byte em UTF-8, ");
		String rnovo = new String(bytes, "UTF-8");
		System.out.println(rnovo);
		
		bytes = r.getBytes("Windows-1252");
		System.out.print(bytes.length + " byte em Windows-1252, ");
		rnovo = new String(bytes, "Windows-1252");
		System.out.println(rnovo);
		
		bytes = r.getBytes("UTF-16");
		System.out.print(bytes.length + " bytes em UTF-16, ");
		rnovo = new String(bytes, "UTF-16");
		System.out.println(rnovo);
		
		bytes = r.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + " byte em US-ASCII, ");
		rnovo = new String(bytes, "US-ASCII");
		System.out.println(rnovo);
	}

}
