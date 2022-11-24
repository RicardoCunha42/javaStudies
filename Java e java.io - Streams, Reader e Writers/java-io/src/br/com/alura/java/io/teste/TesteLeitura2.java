package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner (new File ("Contas.csv"), "UTF-8");
		//Meu eclipse já usa utf-8, isso é para ilustrar o que é possível fazer
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			linhaScanner.useLocale(Locale.US);
			
			String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();
            
            System.out.format(new Locale("pt", "BR"), "%s - %04d - %08d - %s: %05.2f %n"
            		, tipoConta, agencia, numero, titular, saldo);
//			String [] valores = linha.split(",");
//			System.out.println(valores[3]);
            
            linhaScanner.close();//funciona sem ele, mas sla
		}
		
		scanner.close(); //funciona sem ele, mas sla
	}

}
