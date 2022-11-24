package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	private Funcionario funcionario;
	private ReajusteService reajusteService;
	
	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("Antes de todos");
	}
	
	@BeforeEach
	public void inicializar() {
		System.out.println("Início");
		funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
		reajusteService = new ReajusteService();
	}
	
	@AfterEach
	public void finalizar() {
		System.out.println("Fim");
	}
	
	@AfterAll
	public static void depoisDeTodos() {
		System.out.println("Depois de todos");
	}

	@Test
	void reajusteDeveriaSer3PorCentoParaDesempenhoADesejar() {
		reajusteService.calculaReajuste(funcionario, Desempenho.ADESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	void reajusteDeveriaSer15PorCentoParaDesempenhoBom() {
		reajusteService.calculaReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	@Test
	void reajusteDeveriaSer20PorCentoParaDesempenhoOtimo() {
		reajusteService.calculaReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}
}
