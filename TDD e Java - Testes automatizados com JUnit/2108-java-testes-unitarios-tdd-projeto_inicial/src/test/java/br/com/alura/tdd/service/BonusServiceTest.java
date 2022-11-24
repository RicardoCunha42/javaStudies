package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		//assertThrows(IllegalArgumentException.class,
			//	() -> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("20000"))));
		
		try {
			service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("20000")));
			fail("Se chegou aqui, não deu exception!");
		} catch (Exception e) {
			assertEquals("Funcionários com salário acima de 10000 não recebem bônus", e.getMessage());
		}
	}

	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		Funcionario funcionario = new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000"));
		BigDecimal bonus = new BonusService().calcularBonus(funcionario);
		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
