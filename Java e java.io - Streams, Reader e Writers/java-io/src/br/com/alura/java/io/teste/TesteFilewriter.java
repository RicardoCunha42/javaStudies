package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteFilewriter  {
	
	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream  ("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter (osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Uuui");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("Ele gooosta");
		
		bw.close();

//		FileWriter fw = new FileWriter("lorem2.txt");
//		fw.write("Uuui");
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//		fw.write("Ele gooosta");
//		
//		fw.close();
	}
	
	
}
