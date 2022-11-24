package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(42, 94);
		cc.deposita(200);
		cc.setAliguota(0.10);
		
		System.out.println(cc.getImposto());
		
		SeguroDeVida sv = new SeguroDeVida();
		sv.setSaldo(1000);
		sv.setAliguota(0.15);
		
		System.out.println(sv.getImposto());
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.registra(cc);
		calculador.registra(sv);
		
		System.out.println(calculador.getTotalImposto());
	}

}
