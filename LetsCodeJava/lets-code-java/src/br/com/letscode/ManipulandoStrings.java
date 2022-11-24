package br.com.letscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulandoStrings {

	public static void main(String[] args) {
		String nome = "Jessé";
		
		LocalDate localDate = LocalDate.now();
		Locale local = new Locale("PT", "BR");
		String dia = localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, local);
		
		String saudacao;
		LocalDateTime dataCompleta = LocalDateTime.now();
		int hora = dataCompleta.getHour();
		if (hora >= 0 && hora < 12) {
			saudacao = "Bom dia!";
			
		}else if (hora >= 12 && hora < 18) {
			saudacao = "Boa tarde!";
			
		} else if (hora >= 18 && hora < 24) {
			saudacao = "Boa noite!";
			
		} else {
			saudacao = "Olá!";
		}
		
		System.out.printf("Olá, %s. Hoje é %s, %s \n", nome, dia, saudacao.toUpperCase());
	}

}
