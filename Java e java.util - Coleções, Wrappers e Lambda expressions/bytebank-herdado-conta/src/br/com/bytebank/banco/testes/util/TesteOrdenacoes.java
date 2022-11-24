package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacoes {

        public static void main(String[] args) {

        	Conta cc1 = new ContaCorrente(22, 33);
            Cliente clienteCC1 = new Cliente();
            clienteCC1.setNome("Nico");
            cc1.setTitular(clienteCC1);
            cc1.deposita(333.0);

            Conta cc2 = new ContaPoupanca(22, 44);
            Cliente clienteCC2 = new Cliente();
            clienteCC2.setNome("Guilherme");
            cc2.setTitular(clienteCC2);
            cc2.deposita(444.0);

            Conta cc3 = new ContaCorrente(22, 11);
            Cliente clienteCC3 = new Cliente();
            clienteCC3.setNome("Paulo");
            cc3.setTitular(clienteCC3);
            cc3.deposita(111.0);

            Conta cc4 = new ContaPoupanca(22, 22);
            Cliente clienteCC4 = new Cliente();
            clienteCC4.setNome("Ana");
            cc4.setTitular(clienteCC4);
            cc4.deposita(222.0);

                List<Conta> lista = new ArrayList<>();
                lista.add(cc1);
                lista.add(cc2);
                lista.add(cc3);
                lista.add(cc4);
                
                for (Conta conta : lista) {
					System.out.println(conta + ", Titular: " + conta.getTitular().getNome() + ", Saldo: " + conta.getSaldo());
				}
                
                System.out.println("-------------------");
                
                TesteOrdenacoes teste = new TesteOrdenacoes ();

                NumeroDaContaComparator comparator = teste.new NumeroDaContaComparator();
                
                lista.sort(teste.new TitularDaContaComparator());
                
                Collections.sort(lista, comparator);
                //Collections.reverse(lista);
                Collections.sort(lista);//Utiliza a ordem natural determinada no método compareTo da classe comparada (Conta)
                lista.sort(null); //O método sort da classe lista não tem sobrecarga, ent pra utilizar a ordem natural se passa
                				// o parâmetro null
                
                for (Conta conta : lista) {
					System.out.println(conta + ", Titular: " + conta.getTitular().getNome() + ", Saldo: " + conta.getSaldo());
				}
        }
        
        class NumeroDaContaComparator implements Comparator<Conta> {

			@Override
			public int compare(Conta c1, Conta c2) {

				return Integer.compare(c1.getNumero(), c2.getNumero());
				
//				return c1.getNumero() - c2.getNumero();
				
//				if (c1.getNumero() < c2.getNumero()) {
//					return -1;
//					
//				} else if (c1.getNumero() > c2.getNumero()) {
//					return 1;
//					
//				}
//				return 0;
			}
			
        }
        
        class TitularDaContaComparator implements Comparator<Conta> {

			@Override
			public int compare(Conta c1, Conta c2) {
				String nome1 = c1.getTitular().getNome();
				String nome2 = c2.getTitular().getNome();
				
				return nome1.compareTo(nome2);
			}
        	
        }

}
