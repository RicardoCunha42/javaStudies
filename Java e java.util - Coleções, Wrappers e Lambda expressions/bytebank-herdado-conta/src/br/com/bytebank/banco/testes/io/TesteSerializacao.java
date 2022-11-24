package br.com.bytebank.banco.testes.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException {
		Cliente cliente = new Cliente();
		cliente.setCpf("12356456");
		cliente.setNome("Roberto");
		cliente.setProfissao("Dev");
		
		ContaCorrente cc = new ContaCorrente (4545, 632593);
		cc.setTitular(cliente);
		cc.deposita(220);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();

	}

}
