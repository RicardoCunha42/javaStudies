package br.com.alura;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestesData {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate umDiaAi = LocalDate.of(2099, Month.JANUARY, 25); 
		System.out.println(umDiaAi);
		
		Period periodo = Period.between(hoje, umDiaAi);
		System.out.println(periodo.getYears());
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		String dataFormatada = hoje.format(formatador);
		//String dataFormatada = formatador.format(hoje);
		System.out.println(dataFormatada);
	}

}
