package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDeRicardo = new Conta();
		contaDeRicardo.saldo += 100;
		
		contaDeRicardo.deposita(42);
		
		System.out.println(contaDeRicardo.saldo);
		
		contaDeRicardo.saca(84);
		System.out.println(contaDeRicardo.saldo);
		
		
		contaDeRicardo.saca(96);
		System.out.println(contaDeRicardo.saldo);
		
		Conta contaLuisa = new Conta();
		contaLuisa.deposita(400);
		contaLuisa.transfere(200, contaDeRicardo);
		System.out.println(contaLuisa.saldo);
		System.out.println(contaDeRicardo.saldo);
		
		boolean sucessoTransferencia = contaDeRicardo.transfere(100, contaLuisa);
		if (sucessoTransferencia) {
			System.out.println("Transferência feita com sucesso!");
		} else {
			System.out.println("Erro na transferência!");
		}
		System.out.println(contaLuisa.saldo);
		System.out.println(contaDeRicardo.saldo);
		
	}
}
