package br.com.alura.java.io.teste;


import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintStreamPrintWriter  {
	
	public static void main(String[] args) throws IOException {
		
		//PrintStream ps = new PrintStream("lorem2.txt");
		
		PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");
		
		ps.println("Uuui");
		ps.println();
		ps.println();
		ps.println("Ele gooosta");
		ps.println("Cavalo!");
		
		ps.close();
		
		PrintStream pS = System.out;
		pS.println("Mas olha");
	}
	
	
}
