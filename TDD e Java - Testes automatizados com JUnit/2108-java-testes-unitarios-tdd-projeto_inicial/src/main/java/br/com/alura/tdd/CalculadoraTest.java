package br.com.alura.tdd;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

public class CalculadoraTest {
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.Soma(3, 7);
		Assert.assertEquals(10, soma);
	}
}
