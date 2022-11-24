
public class TestaBanco {
	public static void main(String[] args) {
		Conta contaRicardo = new Conta();
		contaRicardo.deposita(100);
		
		Cliente clienteRicardo = new Cliente();
		clienteRicardo.nome = "Ricardo";
		clienteRicardo.cpf = "888.888.888.88";
		clienteRicardo.profissao = "programador";
		
		contaRicardo.titular = clienteRicardo;
		System.out.println(contaRicardo.titular.nome);
		System.out.println(contaRicardo.titular);
		System.out.println(clienteRicardo);
		
	}
}
